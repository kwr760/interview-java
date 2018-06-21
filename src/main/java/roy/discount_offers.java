package roy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class discount_offers {
	private class Product {
		private int letterCount;
		private List<Integer> factors = new ArrayList<Integer>();
		
		private void FindLetterCount(String name) {
			char[] chArray = name.toCharArray();
			letterCount = 0;
			for (char ch : chArray) {
				if (true == Character.isLetter(ch))
					letterCount++;
			}
		}
		private void FindFactors() {
			for (int i = 2; i * i < letterCount; i++) {
				if (letterCount % i == 0)
					factors.add(i);
			}
		}
		public Product(String name) {
			FindLetterCount(name);
			FindFactors();			
//			System.out.println(name + " : " + letterCount + " : " + factors );
		}
	}
	
	private class Customer {
		private int vowelCount;
		private int consonantCount;
		private int letterCount;
		private List<Integer> factors = new ArrayList<Integer>();
		
		private void FindFactors() {
			for (int i = 2; i * i <= letterCount; i++) {
				if (letterCount % i == 0)
					factors.add(i);
			}
		}
		private void FindVowelCount(String name) {
			char[] chArray = name.toLowerCase().toCharArray();
			List<Character> copy = new ArrayList<Character>();
			for (char ch : chArray)
				copy.add(ch);
			copy.retainAll(vowels);
			vowelCount = copy.size();
		}
		private void FindConsonantCount(String name) {
			char[] chArray = name.toLowerCase().toCharArray();
			List<Character> copy = new ArrayList<Character>();
			for (char ch : chArray)
				copy.add(ch);
			copy.retainAll(consonants);
			consonantCount = copy.size();
		}
		private void FindLetterCount() {
			letterCount = vowelCount + consonantCount;
		}
		public Customer(String name) {
			FindVowelCount(name);
			FindConsonantCount(name);
			FindLetterCount();
			FindFactors();
//			System.out.println(name + " : " + vowelCount + " : " + consonantCount + " : " + letterCount + " : " + factors );
		}
	}
	
	private double ss; 
	
	List<Character> vowels = new ArrayList<Character>();
	List<Character> consonants = new ArrayList<Character>();
	List<Customer> customers = new ArrayList<Customer>();
	List<Product> products = new ArrayList<Product>();
	
	public discount_offers() {
		vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'y');
		consonants = Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 
								   'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'w', 'z');
	}
	
	private void AddCustomers(String[] customers) {
		for (String customer : customers)
			this.customers.add(new Customer(customer));
	}
	private void AddProducts(String[] products) {
		for (String product : products)
			this.products.add(new Product(product));
	}
	private double FindSuitabilityScore(Customer customer, Product product) {
		int score = 0;
		
		if (0 == product.letterCount % 2)
			score += customer.vowelCount * 1.5;					
		else
			score += customer.consonantCount * 1.5;					

		List<Integer> common = new ArrayList<Integer>(product.factors);
		common.retainAll(customer.factors);
		if (common.size() > 0)
			score *= 1.5;
		
		return score;
	}

	private double FindMaxSuiabilityScore(ArrayList<Customer> customers, ArrayList<Product> products)
	{
		int customer = -1;
		double max = 0;
		double current = 0;
		
		for (int i = 0; i < customers.size(); i++) {
			for (int j = 0; j < products.size(); j++) {
				current = FindSuitabilityScore((Customer)customers.get(i), (Product)products.get(j));
				if (current > max) {
					customer = i;
					max = current;
				}
//				System.out.println(current + " : " + i  + " : " + j );
			}
		}
		
		if (customer > -1) {
			customers.remove(customer);
		}
		
		return max;
	}
	
	private void FindBestSuitabilityScore() {
		ArrayList<Customer> cCustomers = new ArrayList<Customer>(customers);  
		ArrayList<Product> cProducts = new ArrayList<Product>(products);
		
		ss = 0;
		
		while ((cCustomers.size() > 0) && (cProducts.size() > 0)){
			ss += FindMaxSuiabilityScore(cCustomers, cProducts);
		}
	}

	public void ss(String[] customers, String[] products) {
		AddCustomers(customers);
		AddProducts(products);
		FindBestSuitabilityScore();
		System.out.println(ss);
	}
	
	public static void main(String[] args) {
		discount_offers f = new discount_offers();

		try {
			String filename;
			if (args.length > 0)
				filename = args[0];
			else
				filename = "test/discount.txt";
			File file = new File(filename);
			BufferedReader in = new BufferedReader(new FileReader(file));
			String line;
			while ((line = in.readLine()) != null) {
				String[] lineArray = line.split(";");
				if (lineArray.length > 0) {
					f.ss(lineArray[0].split(","),lineArray[1].split(","));
//					System.exit(0);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.exit(0);
	}

}
