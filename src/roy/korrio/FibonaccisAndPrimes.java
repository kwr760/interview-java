package roy.korrio;

import java.util.ArrayList;

public class FibonaccisAndPrimes {
	private long[] savedNumbers = new long[90];  // Overflow happens at 93
	private ArrayList<Long> primes = new ArrayList<Long>(); // Save the primes
	
	public static void main(String[] args) {
		FibonaccisAndPrimes f = new FibonaccisAndPrimes();
		f.challengeTwo();		
	}

	public void challengeTwo() {
		for (int i = 0; i < 90; i++) {
			long x = findFibonacci(i);
			if (x > 227000)
			{
				if (isPrime(x)) {
					System.out.println("The first Fibonacci which is prime and greater than 227,000 is " + x + ".");
					
					findPrimes(x + 1);
					long total = 0;
				
					for (long number : primes) {
						if ((x + 1)% number == 0)
							total += number;
					}
					
					System.out.println("Sum of prime divisors of " + (x + 1) + " is " + total + ".");
					
					return;
				}
			}
		}
	}
	
	private void findPrimes(long number) {
		for (long i = 2; i * i <= number; i++)
		{
			if (isPrime(i)) {
				primes.add(i);
			}
		}
	}
	
	private boolean isPrime(long number) {
		if (number <= 1)
			return false;
		
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0)
				return false;
		}
		
		return true;
	}
	
	private long findFibonacci(int i) {
		if (i == 0) 
			return 0;
		if (i == 1) 
			return 1;
		
		if (savedNumbers[i] != 0) 
			return savedNumbers[i];
		
		savedNumbers[i] = findFibonacci(i - 1) + findFibonacci(i - 2);
		
		return savedNumbers[i];
	}
}
