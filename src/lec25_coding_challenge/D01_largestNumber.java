package lec25_coding_challenge;

public class D01_largestNumber {

	public static void main(String[] args) {
		int [] number = {2, 12, 10, 1, 50};
		
		int largest = number[0]; // we assume zero index is largest
		// Then start comparing it with index one, then two, then thre ........
		
		for(int i = 1; i< number.length; i++) {
			if(number[i]>largest) {
				largest = number[i];
			}
		}
		System.out.println(largest);

	}

}
