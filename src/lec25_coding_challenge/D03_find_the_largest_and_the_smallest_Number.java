package lec25_coding_challenge;

public class D03_find_the_largest_and_the_smallest_Number {

	public static void main(String[] args) {
		int [] number = {2, 12, 10, 1, 50};
		
		int largest = number[0];
		int smallest = number[0];
		
		for(int i = 1; i< number.length; i++) {
			if(number[i]>largest) {
				largest = number[i];
			} else if (number[i]<smallest) {
				smallest = number[i];
			}
		}
		System.out.println(largest);
		System.out.println(smallest);

	}

}
