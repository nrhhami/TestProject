
import java.util.Scanner;
public class Lab2Ex4 {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Enter the number between 0 and 1000:");
		int number = input. nextInt();
		
		int t1 = 1 + (number-100) /100;
		int t2 =(1+ (number-10)/ 10) % 10;
		int t3= number % 10;
		
		int The_multiplication_of_all_digits = t1 * t2 * t3;
		System.out.println(The_multiplication_of_all_digits);
	}

}
//Norhamidatul Hairiyah Binti Hairee
//210847