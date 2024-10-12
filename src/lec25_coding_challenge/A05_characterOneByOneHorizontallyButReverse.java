package lec25_coding_challenge;

/*
Que: Print your name Horizontally but in reverse [They will not mention: character by character]
Input: Tofael Kabir

Output:
ribaK leafoT

*/

public class A05_characterOneByOneHorizontallyButReverse {
	// parameterized method can be reused
	// why the method is static, because we can't call non static method inside main method
	public static void stringInReverse(String s) {
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}
	}

	public static void main(String[] args) {
		stringInReverse("Nadia Jara");
		System.out.println("\n----------------");
		stringInReverse("Tofael Kabir");

	}
}
