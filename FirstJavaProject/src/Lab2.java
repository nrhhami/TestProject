
import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		//create a scanner object to read user input
		
		
		double kilo = 1.6;
				
		Scanner input = new Scanner(System.in);
		System.out.print("miles ");
		int miles= input.nextInt();
		double total = miles*kilo;
		System.out.println("96 miles is="+ String.format("%.1f",total)+" kilometer");
		
	
	}

}
