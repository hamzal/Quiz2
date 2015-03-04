//Made By Hamza Lemsaddek

import java.util.Scanner;
public class College_Tuition_Calculator {
	private static Scanner user_input;

	public static void main(String[] args) {
		
		//opening a scanner
		user_input = new Scanner(System.in);

		//declaring the variables
		double Actual_Tuition;
		double Increase_Rate_1;
		double Increase_Rate_2;		
		double Increase_Rate_3;		
		double Expected_Total_Tuition;
		double Expected_Tuition_Freshman;
		double Expected_Tuition_Sophomore;
		double Expected_Tuition_Junior;
		double Expected_Tuition_Senior;
		double Formatted_Total;
		//This asks for the tuition freshman year
		System.out.print("Please enter the actual tuition: ");
		Actual_Tuition = user_input.nextDouble();

		//This asks for the expected increase rate Sophomore year
		System.out.print("Please enter the rate at which the tuition is expected to increase Sophomore Year: ");
		Increase_Rate_1 = user_input.nextDouble();
		
		//This asks for the expected increase rate Junior year
		System.out.print("Please enter the rate at which the tuition is expected to increase Junior Year: ");
		Increase_Rate_2 = user_input.nextDouble();
		
		//This asks for the expected increase rate Senior year
		System.out.print("Please enter the rate at which the tuition is expected to increase Senior Year: ");
		Increase_Rate_3 = user_input.nextDouble();
		
		//Assigning the values for every year
		Expected_Tuition_Freshman = Actual_Tuition;
		Expected_Tuition_Sophomore = Expected_Tuition_Freshman*(1+Increase_Rate_1/100);		
		Expected_Tuition_Junior = Expected_Tuition_Sophomore*(1+Increase_Rate_2/100);		
		Expected_Tuition_Senior = Expected_Tuition_Junior*(1+Increase_Rate_3/100);		
		
		//Calculating the total tuition for the 3 following years
		Expected_Total_Tuition = Expected_Tuition_Freshman + Expected_Tuition_Sophomore + Expected_Tuition_Junior +Expected_Tuition_Senior;
		
		//Formating the number
		Formatted_Total = Math.round(Expected_Total_Tuition*100.0)/100.0;

		
		//Printing the total cost
		System.out.print("Your total expected cost is: $"+Formatted_Total);
		
		//Closing the scanner
		user_input.close();
	}
}
