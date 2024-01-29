import java.util.*;
public class question_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number or unit consumed");
		int unit = sc.nextInt();
		double totalAmount;
		double discount=0;
		
		System.out.println("Do you want to pay online (y/n)?");	   //if "n" then the customer will redirected to the totalamount section(without discount).
		String payonline = sc.next();
		
		if(unit<=50) {			
			totalAmount = unit*3;
		}
		else if(unit<=200) {
			totalAmount = 50*3+(unit-50)*4.80;
		}
		else if(unit<=400) {					
			totalAmount = 50*3+150*4.80+(unit-200)*5.80;
		}
		else {
			totalAmount = 50*3+150*4.80+200*5.80+(unit-400)*6.20;
		}
		System.out.println("₹"+totalAmount); 
		
		if(payonline.equalsIgnoreCase("y")) { 		//Discount section
			discount = totalAmount*0.03;
			totalAmount = totalAmount-discount;
		}
		System.out.println("Discount: ₹"+discount);		//Discount
		System.out.println("Amount payable: ₹"+totalAmount);	//Amount payable after discount
	}

}
