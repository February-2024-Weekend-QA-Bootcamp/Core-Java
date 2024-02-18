package lec03_02_java_variables_initialized;

import java.awt.print.Book;

public class MyInfoTest {

	public static void main(String[] args) {
		// How MyInfo class is accessed here? Ans: inside same package, public type
		MyInfo myInfo = new MyInfo(); // Constructor initialized here
		myInfo.myInfo(); // method initialized here
		
		
		// The below code is reated to accessibility, not related with above code
		
		// How Book class is accessed here? Ans: inside different package, public type
		Book book = new Book();
		
		// How Car class can't accessed here? Ans: inside different package, default type
		// default type can't accessed from different package, but same package ok
		// Car car = new Car();

	}

}
