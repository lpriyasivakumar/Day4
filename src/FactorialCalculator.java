import java.util.Scanner;

public class FactorialCalculator {

	public static void main(String[] args) {

		// Create a new instance of Scanner
		Scanner sc = new Scanner(System.in);
		String choice = "y";// set choice to "y" so that the while loop runs at
							// least once

		while (choice.equalsIgnoreCase("y")) {

			// Prompt user to enter a number between 1 and 10			
			System.out.println("Enter an integer that is greater than 0 but less than 10: ");
			int number = sc.nextInt();	
			//print output from helper method getFactorial
			System.out.println("The factorial of " + number+" is "+ getFactorial(number));
			
			//sample call to recursive function
			//System.out.println("The factorial of " + number+" is "+ getFactorialWithRecursion(number));
			
			//prompt if user wants to continue
			choice = Validator.getChoice(sc,"Continue? (y/n)");
		}
		sc.close();
	}

	public static long getFactorial(int l) {
		long factorial = 1; //initialize factorial to 1
		
		//set i to input value. keep decrementing i till it is equal to 1
		for(long i =l;i>0; i--){
			//keep multiplying the factorial to the current value of i
			factorial *= i;
		}
		return factorial;
	}
	public long getFactorialWithRecursion(long l) {
		long fact = 1;//set initial value of answer to 1
		//if input value is 0, then the factorial is 1
		if(l == 0){
			fact = 1;
		}
		else{
			fact = l * getFactorialWithRecursion(l-1);//if input value is greater than 0 keeps calling itself and multiplying the result
		}
		
		return fact;
	}
	

}
