package lec25_coding_challenge;

import java.util.Arrays;

// What is an Array?
// An array is a collection of items of same data type stored at contiguous memory locations. 

public class KnowingArray {

	public static void main(String[] args) {
		// Generally every value is assigned to a variable name, but in Array, a set of value present under one name
	    System.out.println("------------------------------------------------------------------------");
	    String val1 = "Biden";
	    String val2 = "Trump";
	    String val3 = "Obama";
	    String val4 = "Bush Jr";
	    
	    // Array
		// same data type or a cluster of data present
		// How to write an Array: first data type, then [], it is called container, the president (OBJECT) is the name of Array, 
		// [5] represent total 5 data is present
		// Array is static [fixed number of data], [interview question]
	    String [] president = new String [5];
	    president [0] = "Biden";
	    president [1] = "Trump";
	    president [2] = "Obama";
	    
	    president [4] = "Clinton";
	    
	    System.out.println(president.length);
	    System.out.println(president[1]);
	    System.out.println(president[3]);
	    // System.out.println(president[5]); //  java.lang.ArrayIndexOutOfBoundsException
	    
		 // or we can write this way, called "literal representation" of an Array
		 System.out.println("\n------------------------------------------------------------------------");
		 String [] presidents =  new String [] {"Biden", "Trump", "Obama", "", "Bush Jr", "Clinton", "Bush Sr"};
		 System.out.println(presidents[2]);
		 System.out.println(presidents.length);
		 
		 // important interview question: length () vs length
		 // or how can you get the size of a String and Array?
		 // length is a property, length() is a method of String
	    
		//or	without  new String [] 
		System.out.println("\n------------------------------------------------------------------------");
		// This is the most common way to write an Array
		String [] allPresident = {"Biden", "Trump", "Obama", "Bush Jr", "Clinton", "Bush Sr"};  
		System.out.println(allPresident.length); 
		System.out.println(allPresident[5]);
		
		System.out.println("\n------------------------------------------------------------------------");
		// or	without new int [] 
		int [] age = {12, 18, 16, 15, 13};
		System.out.println(age.length);
		System.out.println(age[3]);
		
		age[0]=12;
		age[1]=18;
		age[2]=16;
		age[3]=15;
		
		age[4]=13; 
		age[5-1]=13;
		age[age.length-1]=13;
		// so, who is the last index 4 or [age.length-1]
		
		System.out.println("\n------------------------------------------------------------------------");
		// char type
		char [] gender = {'M', 'M', 'M', 'F', 'M'};
		System.out.println(gender[3]);
		System.out.println(gender.length);
		
		// How to write an Array finally or most common: 
		// first data type, then []  container, then array name = data inside curly braces, ended up with semicolon
	    
		gender[0] = 'M';
		gender[1] = 'M';
		gender[2] = 'M';
		gender[3] = 'F';
	    
		gender[4] = 'M';
		gender[5-1] = 'M';
		gender[gender.length-1] = 'M';
	    
	    // gender.length-1  is the last index
		
		System.out.println("\n------------------------------------------------------------------------");
		// or	without new int [] 
		int [] val = {23,54,12, 66, 88, 23, 80, 43}; // space is removed from first 2 index on purpose
		System.out.println(val.length);
		System.out.println(val[3]);
		System.out.println(val[0]);
		// System.out.println(val[8]);
		// System.out.println(val[-1]); // same outcome as above line
		
		// interview question: What is the exception you got if Array is out of range?
		// Ans: ArrayIndexOutOfBoundsException 
		
		// int [] a = {5, 15, 50, 0, 56};
		// a.length value is 5;
		// a[0]=5, a[1]=15, a[2]=50, a[3]=0, a[4]=56
		// a[4]=56
		// a[5-1]=56
		// a[a.length-1]=56 =last Index
		
		// For example
		// a.length = 100;
		// a[99] = a[100-1] = a[a.length-1]
		// This is a formula: last index is a[a.length-1]
		// This is a formula: second last index is a[a.length-2]
		// This is a formula: third last index is a[a.length-3]  and so on .........
		// important interview question: How to find (what is the formula) the value for last index from an Array?
		System.out.println("\nPrinting the last number of the Array: " + val[val.length - 1]); 

		// Que: how can you find the second last index from an array if the array name is a?
		// Ans: a[a.length - 2])
		
		// very very important -->  toString(a) method
		// no need to memorize
		//	Returns a string representation of the contents of the specified array. The string representation consists 
		// of a list of the array's elements, enclosed in square brackets ("[]"). Adjacent elements are separated by the
		// characters ", " (a comma followed by a space). Elements are converted to strings as by String.valueOf(int). 
		
		// How can we print an Array?
		// important interview question
		// Array vs Arrays, Arrays is a class which is used to manipulate the Array
		// What will happen if you directly print by Array name or array object? Ans: you will get the "Array ID", line 123
		System.out.println(val);
		// solution below
		System.out.println(Arrays.toString(val));
		
		// Just FYI
		int [] b = new int [0]; // 0 elements, no elements there, also called null
		// System.out.println(b[0]); // newly added
		// System.out.println(b); // will show Array ID
		System.out.println("To find an Array when size is Null: " + Arrays.toString(b)); // You will find Empty Array
		System.out.println(b.length);
		
		// You can skip below
		System.out.println("\n------------------------------------------------------------------------");
		// NOT IMPORTANT
		System.out.println("\nPrinting Array ID: " + val); // Array ID
		// NOT IMPORTANT
		System.out.println("\nPrinting hashCode of the Array, represented by data: " + Arrays.hashCode(val));
		// hashCode of the Array used for representation of array by data	
		// java.util.Arrays Class --> This class contains various methods for manipulating Array (such as sorting and searching).
		// NOT IMPORTANT
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(val, 66)); // which index is 66?
		// here a is the name of the array, 66 is the value checking the index number
		// binary search to get the index position of the value from the ref
		System.out.println("\nPrinting the index position of the value form the ref: " + Arrays.binarySearch(val, 3)); //TODO WHY -1?
		
				
		
	}

}
