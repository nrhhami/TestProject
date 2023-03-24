
import java.util.Scanner;

public class Lab2Ex3 {
	public static void main(String[]args) {
		//create a scanner object to read user input
		
		Scanner input= new Scanner(System.in);
		
		System.out.print("Retail price (RM): ");
		double Retail= input.nextDouble();
		
		System.out.print("Sales tax rate (%):");
		double sales_tax_rate=input.nextDouble();
		
		double sale_tax = Retail * sales_tax_rate/100 ;
		double total = Retail + sale_tax;
		
		System.out.println("sale tax="+ String.format("%.2f" ,sale_tax)) ;
		System.out.println("Total=" +String.format("%.2f" ,total));				
	}

}
