import java.util.Scanner;

public class Factorial {
	
	//declare global variable
	 static int product = 1;
	 static int initialFactor = 0;
	 
	 public static void main(String[] args) {
		 
		 //ask the user to enter a number
		 System.out.println("Enter an integer: ");
		 //create scanner object to get the answer from the user
		 Scanner read = new Scanner(System.in);
		 
		 //check if the user input is an integer
		 try
		 {
			 //get the integer from the user
			 int factor = Integer.parseInt(read.nextLine());
			 initialFactor = factor;
			 //call the Factorial function and pass the factor 
		     Factorial(factor);
			
		 }
		 catch (Exception e)
		 {
			 System.out.println("Restart the program and enter an integer");
		 }
	 }
	 
	 public static void Factorial (int factor)
	 {
		 //check if the factor is equal to 1 or greater
		 if (factor >= 1)
		 {
			 //multiply the previous product to the factorial
			 product = product * factor;
			 //recall the function
			 Factorial (factor-1);
		 }
		 else
		 {
			 //when we multiplied all the numbers up to 1, display the answer
			 System.out.print("!"  + initialFactor + " = " + product); 
 		 }
		
	 }

}
