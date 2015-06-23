import java.util.Scanner;

public class SquaresAndCubes {

	public static void main(String[] args) {
		// Create Scanner Instance
		Scanner sc = new Scanner(System.in);
		
		//Print header
		System.out.println("Learn your squares and cubes: ");
		int num = 0;//set the initial number to 0
		String choice = "y"; //set choice to "y" so program runs at least once

		while (choice.equalsIgnoreCase("y")) {
			num = Validator.getInt(sc, "Enter an Integer: ");//prompt user to enter a number

			System.out.print("Number\t\t");
			System.out.print("Squared\t\t");
			System.out.print("Cubed\t\t");
			System.out.println();

			System.out.print("======\t\t");
			System.out.print("=======\t\t");
			System.out.print("=====\t\t");
			System.out.println();
			
			//Set variable i to 1 and increment by one till i == num
			//calculate square and cube of i and display to screen
			for (int i = 1; i <= num; i++) {
				System.out.print(i + "\t\t");
				System.out.print(i * i + "\t\t");
				System.out.print(i * i * i + "\t\t");
				System.out.println();
			}
			choice = Validator.getChoice(sc, "Continue? (y/n): "); //check if user wants to continue

		}
		sc.close();

	}

}
