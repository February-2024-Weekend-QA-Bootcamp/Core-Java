package lec25_coding_challenge;

public class D01_smallestNumber {

	public static void main(String[] args) {
		int [] number = {2, 12, 10, 1, 50, 0, -1, -2};
		
		int smallest = number[0];
		
		for(int i = 1; i< number.length; i++) {
			if(number[i]<smallest) {
				smallest = number[i];
			}
		}
		System.out.println(smallest);
		

	}

}
