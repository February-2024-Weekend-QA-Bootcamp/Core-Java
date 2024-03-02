package lec06_01_java_methods;

public class TestMethod {

	public static void main(String[] args) {
		LearningVoidTypeMethod lvm = new LearningVoidTypeMethod();
		lvm.addition();
		
		System.out.println("-----------------------------------------------------");
		LearningReturnTypeMethod lrm = new LearningReturnTypeMethod();
		lrm.addition();
		lrm.subtraction();
		lrm.myName();
		
		System.out.println("-----------------------------------------------------");
		OneMethodCalledInsideAnotherMethod omc = new OneMethodCalledInsideAnotherMethod();
		omc.subtraction();
		
		System.out.println("-----------------------------------------------------");
		MethodsCanBeCalledInsideConstructor mcc = new MethodsCanBeCalledInsideConstructor();
		
		System.out.println("-----------------------------------------------------");
		LearningStaticandFinalTypeMethod lsf = new LearningStaticandFinalTypeMethod();
		// lsf.addition(); // static methods are called by the class itself, no need of object to call a static method
		LearningStaticandFinalTypeMethod.addition();
		lsf.subtraction(); // final type method can't be changed	
		
		System.out.println("-----------------------------------------------------");
		LearningParameterizedMethod lpm = new LearningParameterizedMethod();
		lpm.addition(324, 120);
		lpm.addition(70, 60);
		
		System.out.println("-----------------------------------------------------");
		lpm.multiplication(3, 6);
		lpm.multiplication(6573, 350);
		
		System.out.println("-----------------------------------------------------");
		lpm.myName("Joe", "Biden");
		lpm.myName("Bill", "Clinton");
		lpm.myName("George", "Bush");
		
	}

}
