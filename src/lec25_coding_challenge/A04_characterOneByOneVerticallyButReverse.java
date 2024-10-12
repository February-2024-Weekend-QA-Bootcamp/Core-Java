package lec25_coding_challenge;


/*
Que: Print your name vertically but reverse [They will not mention: character by character]
Input: Tofael Kabir

first index = 0
second index = 1
last index = 

{11, 32, 13, 4, 45}
i [0] = 11
i [1] = 32
i [4] = 45
=> i[5-1] = 45
=> i[i.length-1] = 45 

i.length-1          is the last index for Array

s.length()-1         is the last index of a String

i.length = 5



Output:
r
i
b
a
K

l
e
a
f
o
T

*/

public class A04_characterOneByOneVerticallyButReverse {
	// parameterized method can be reused
	// why the method is static, because we can't call non static method inside main method
	public static void stringInReverse(String s) {
		for(int i = s.length()-1; i >=0; i--) {
			System.out.println(s.charAt(i));
		}
	}
	
	public static void main(String[] args) {
		stringInReverse("Nadia Jara");
		System.out.println("----------------");
		stringInReverse("Tofael Kabir");

	}
	
	
	
	
	
	
	
	
	
	

}
