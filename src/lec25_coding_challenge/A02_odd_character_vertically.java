package lec25_coding_challenge;

/*
Que: Print out your name vertically all the odd index [They will not mention: character by character]
Input: Tofael Kabir
Output:
T
f
e

a
i
*/

public class A02_odd_character_vertically {
	public static void main(String[] args) {
		String s = "Tofael Kabir"; 
		for(int i=0; i<s.length(); i=i+2) {
			System.out.println(s.charAt(i));
		}

	}

}
