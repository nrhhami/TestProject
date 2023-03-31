
import java.util.Scanner;

public class Lab3_Ex1 {
	public static void main(String[]args) {
	
		Scanner input= new Scanner(System.in);
		
	//Item 1 from user 
		System.out.print("Item: ");
		String Item1 = input.nextLine();
		
		System.out.print("Quantity: ");
		double Quantity1 = input.nextDouble();
		
		System.out.print("Unit Price: RM ");
		double Price_1 = input.nextDouble();
		
		double Amount1 = Quantity1 * Price_1;
		
		System.out.println("");
		System.out.println("Amount: RM " + String.format("%.2f", Amount1));
		
		
		System.out.println("------------------------");
		
	//Item 2 from user
		input.nextLine();
		System.out.print("Item: ");
		String Item2 = input.nextLine();
		
		System.out.print("Quantity: ");
		double Quantity2 = input.nextDouble();
		
		System.out.print("Unit price: RM ");
		double Price2= input.nextDouble();
		
		double Amount2 = Quantity2 * Price2;
		
		System.out.println("");
		System.out.println("Amount: RM "+ String.format("%.2f", Amount2 ));
					
				
	//Result
		double subtotal = Amount1 + Amount2;
		double govenmenttax = 0.06* subtotal;
		double servicecharge = 0.1* subtotal;
		double total= subtotal + govenmenttax + servicecharge;
		
		System.out.println("");
		System.out.println("Subtotal: RM " + String.format("%.2f", subtotal));
		System.out.println("Govenment Tax: RM" + String.format("%.2f", govenmenttax));
		System.out.println("Service Charge: RM " + String.format("%.2f",servicecharge));
		System.out.println("Total: RM "+ String.format("%.2f",total));
		
				
	}
}

//NORHAMIDATUL HAIRIYAH BINTI HAIREE 
//210847
//LAB3 EX 1
