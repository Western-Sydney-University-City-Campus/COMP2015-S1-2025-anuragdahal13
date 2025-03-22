package calorieCounter;

import java.util.Scanner;


//ID-22161681
//Name-AnuragDahal

public class CalorieWatcher {
	int Cookies=0;
	double Serves=0;
	double Calories=0;

	public static void main(String[] args) {
		
		Scanner Keyboard=new Scanner(System.in);
		System.out.print("Enter the number of cookies eaten: ");
        int Cookies = Keyboard.nextInt();
        if(Cookies<1 || Cookies>40 ) {
	        System.out.print("invalid input enter a valid number");
	        return;
        }
       double Serves=((Cookies/40.0)*10);
       double Calories=Serves*300;
       System.out.println("You consumed " + Calories);
       
        
	    }
}


	


