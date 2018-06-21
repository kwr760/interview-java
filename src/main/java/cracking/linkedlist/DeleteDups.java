package cracking.linkedlist;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.ListIterator;

public class DeleteDups {

	public static void deleteDupsHash(ArrayList<Integer> n){
		Hashtable<Integer, Boolean> table = new Hashtable<>();

		Iterator<Integer> iter = n.iterator();
		while (iter.hasNext()) {
			Integer i = iter.next();
			if (table.containsKey(i)) {
				iter.remove();
			}
			else {
				table.put(i, true);
			}
		}
	}
	
	private static void deleteDupsIterator(ArrayList<Integer> n) {
		ListIterator<Integer> iter = n.listIterator();
		ListIterator<Integer> runner;
		
		Integer i;
		Integer r; 
		
		while (iter.hasNext()) {
			i = iter.next();
			runner = iter;
			while (runner.hasNext()) {
				r = runner.next(); 
				if (r.equals(i)) {
					runner.remove();
					System.out.println(n.toString());
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(1);
		l.add(3);
		l.add(1);
		l.add(1);
		l.add(4);
		l.add(5);
		System.out.println(l);
		deleteDupsIterator(l);
//		System.out.println(l);
	}
}
