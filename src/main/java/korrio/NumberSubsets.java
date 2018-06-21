package korrio;

import java.util.ArrayList;
import java.util.Arrays;

public class NumberSubsets {
	private String input;
	private ArrayList<Integer> numberList = new ArrayList<>();
	private ArrayList<ArrayList<Integer>> subsets = new ArrayList<>();
	
	public static void main (String[] args) {
		NumberSubsets n = new NumberSubsets();
		n.challengeThree();
	}
	
	void challengeThree() {
		try {
			input = Utility.loadFromFile("C:\\Devel\\korrio-challenge\\numbers.csv");
		}
		catch (Exception e) {
			System.out.println("Could not open input file.");
			e.printStackTrace();
			return;
		}
			
		initializeNumberList();
		ArrayList<Integer> check = new ArrayList<>();
		findSums(0, check);
		displayCount();
	}
	
	private void displayCount() {
		System.out.println("There are " + subsets.size() + " subsets.");
	}
	
	@SuppressWarnings("unused")
	private void displayResult() {
		int sum;
		for (ArrayList<Integer> item : subsets) {
			sum = 0;
			for (Integer integer : item) {
				if (0 == sum)
					System.out.print(integer);
				else
					System.out.print(" + " + integer);
					
				sum += integer;
			}
			
			System.out.println (" = " + sum);
		}
	}

	private void initializeNumberList() {
		String[] array = input.split(",");
		Integer[] numbers = new Integer[array.length];
		
		for (int i = 0; i < array.length; i++)
			numbers[i] = new Integer(array[i].trim());
		
		numberList.addAll(Arrays.asList(numbers));
	}
	
	private boolean isSumInNumberList(ArrayList<Integer> check) {
		int sum = 0;
		
		for (Integer i : check) {
			sum += i;
		}
		
		return numberList.contains(sum);
	}
	
	private void findSums(int position, ArrayList<Integer> determineSums) {
		for (int i = position; i < numberList.size(); i++) {
			ArrayList<Integer> duplicateSums = new ArrayList<>(determineSums);
			duplicateSums.add(numberList.get(i));
			if (duplicateSums.size() > 1) {
				if (isSumInNumberList(duplicateSums)) {
					subsets.add(duplicateSums);
				}
			}
			findSums(i + 1, duplicateSums);
		}
	}
}
