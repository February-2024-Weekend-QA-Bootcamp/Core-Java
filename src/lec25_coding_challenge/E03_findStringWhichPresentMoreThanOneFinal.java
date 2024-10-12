package lec25_coding_challenge;

import java.util.HashSet;
import java.util.Set;

// This code is correct, so I am showing how?
public class E03_findStringWhichPresentMoreThanOneFinal {
	public static void main(String[] args) {
		String [] language = { "Java", "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript", "C++" };
		
		Set<String>moreThanOne = new HashSet<>();
				
		for(int i = 0; i<language.length; i++ ) { // index 0 is Java
			for(int j =i+1; j<language.length; j++) { // "C++", "C#", "Python", "Java", "C++", "Java", "Python", "Javascript", "C++"
				if(language[i].equals(language[j])) {
					moreThanOne.add(language[i]);
				}
			}
		}
		System.out.println("String present more than one are: " + moreThanOne);	
	}

}
