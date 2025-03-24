package stockCommissioncalc;
import java.util.Scanner;


public class StockCommission {

	public static void main(String[] args) {
		//commands to get input the number of shares
		Scanner keyboard=new Scanner(System.in);
		System.out.print("Enter the number of share you want to buy:");
		int shares=keyboard.nextInt();
		//Commands to validate the number of shares
		if(shares<100 || shares>100000 ) {
		 System.out.print("invalid no of shares enter a valid number:");
			return;
         }
		//command to store the predetermined value of stock
		double commission=4.25;
		//commands to get input the price of share
		Scanner second=new Scanner(System.in);
		System.out.print("Enter the stock price:");
		int shareprice=second.nextInt();
		//commands to validate the minimum and maximum share price
		if(shareprice<0 || shareprice>500 ) {
			 System.out.print("invalid no of shares enter a valid amount:");
				return;
				}
		//Algorithm to calculate the Stock cost,commission amount and total cost.
		int stockcost=shareprice*shares;
		double commissionamount=stockcost*(commission/100);
		double total=stockcost+commissionamount;
		//Commands to display the Stock cost,commission amount and total cost.
		System.out.print("The cost of your stock is"+"  "+stockcost); 
		System.out.print("\nThe total commission for your share is"+"  "+commissionamount);
		System.out.print("\nThe total cost for your share is:"+"  "+total);
		
	}

	}
