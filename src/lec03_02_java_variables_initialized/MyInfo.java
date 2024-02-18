package lec03_02_java_variables_initialized;

public class MyInfo {
	// variables initialized
	public String myName = "Tofael";
	public byte myAge = 127;
	public short myApartmentRent = -32768;
	public int myYearlySalary = 5672354;
	public long myBankBalance = -2147483648l;
	public float myHeight = 1.6537f;
	public double myGrade = 3.46936569855;
	public char myGender = 'M';
	public boolean usCitizen = true;

	// Constructor declared
	public MyInfo() {
		System.out.println("--- :This is all about me: ---");
	}

	// method implemented
	public void myInfo() {
		System.out.println("My Name is: " + myName + ", My Age: " + myAge + ", My Apartment Rent: " + myApartmentRent
				+ ", My Yearly Salary: " + myYearlySalary + ", My Bank Balance: " + myBankBalance + ", My Gender: "
				+ myGender + ", My height: " + myHeight + ", My Grade: " + myGrade + ", US citizen? : " + usCitizen);
	}

}
