package basics;

public class BasicCalc {

	public static void main(String[] args) {
		// Basic Calculator to understand Operator Functionality
		System.out.println("Basic Calculator");
		int a = 20, b = 30;
		
		System.out.println("First No: "+a);
		System.out.println("Second No: "+b+"\n");//new line Separator
		
		// Operator in java are
		int Addition = a+b;
		int Subtraction = a-b;
		int Multiplication = a*b;
		float Division = a/b;
		int Modulus = a%b;
		int Increment = ++a;
		int Decrement = --b;
		
		System.out.println("Addition is "+Addition);
		System.out.println("Subtraction is "+Subtraction);
		System.out.println("Multiplication is "+Multiplication);
		System.out.println("Division is "+Division);
		System.out.println("Modulus is "+Modulus);
		System.out.println("Increment is "+Increment);
		System.out.println("Decrement is "+Decrement);
	}

}
