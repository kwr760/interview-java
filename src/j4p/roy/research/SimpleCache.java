package roy.research;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SimpleCache<T> {
	private final Map<String, T> objects;
	private final Map<String, Long> expire;
	private final long defaultExpire;
	private final ExecutorService threads;

	public SimpleCache() {
		this(100);
	}

	public SimpleCache(final long defaultExpire) {
		this.objects = Collections.synchronizedMap(new HashMap<String, T>());
		this.expire = Collections.synchronizedMap(new HashMap<String, Long>());
		this.defaultExpire = defaultExpire;
		this.threads = Executors.newFixedThreadPool(256);
		Executors.newScheduledThreadPool(2).scheduleWithFixedDelay(this.removeExpired(), this.defaultExpire / 2, this.defaultExpire, TimeUnit.SECONDS);
	}

	private final Runnable removeExpired() {
		return new Runnable() {
			public void run() {
				for (final String name : expire.keySet()) {
					if (System.currentTimeMillis() > expire.get(name)) {
						threads.execute(createRemoveRunnable(name));
					}
				}
			}
		};
	}

	private final Runnable createRemoveRunnable(final String name) {
		return new Runnable() {
			public void run() {
				objects.remove(name);
				expire.remove(name);
			}
		};
	}

	public long getExpire() {
		return this.defaultExpire;
	}

	public void put(final String name, final T obj) {
		this.put(name, obj, this.defaultExpire);
	}

	public void put(final String name, final T obj, final long expireTime) {
		this.objects.put(name, obj);
		this.expire.put(name, System.currentTimeMillis() + expireTime * 1000);
	}

	public T get(final String name) {
		final Long expireTime = this.expire.get(name);
		if (expireTime == null) return null;
		if (System.currentTimeMillis() > expireTime) {
			this.threads.execute(this.createRemoveRunnable(name));
			return null;
		}
		return this.objects.get(name);
	}

	@SuppressWarnings("unchecked")
	public <R extends T> R get(final String name, final Class<R> type) {
		return (R) this.get(name);
	}
}
