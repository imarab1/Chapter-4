import java.util.*;
public class excersizefoureight{
	public static void main(String[] args){
		Scanner keyboard = new Scanner(System.in);
		smallestLargest(keyboard);
	}

	public static void smallestLargest(Scanner keyboard){
		int smol = 0;//gives intial value to our smallest value
		int big = 0;//gives intial value to our largest value
		
		System.out.print("How many numbers do you dare enter? "); //prints inital statement
		int n = keyboard.nextInt();	

		for (int i = 1; i <= n; i++){
			System.out.print("Number " +i+ ": ");//prints number placeholders
			int num = keyboard.nextInt();//allows for user interaction, how we type our numbers in
			
			if(i == 1){
				smol = num;
				big = num;
			}
			else if (num < smol){// If the number is less than the smallest number that was chosen
				smol = num;
			}			
			else if (num > big){// If the number is greater than the largest number that was chosen
				big = num;
			}
		}

		System.out.println("The smallest number is " + smol); // prints smallest number with statement, sorry I changed the print statement
		System.out.println("The largest number is " + big); // prints largest number with statement, sorry I changed the print statement
	}
}
