package two;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Thirteen {

	public static void main(String[] args) {
		
		double save,money=0;
		Scanner in = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.00");
		
		System.out.println("Enter the monthly saving amount:");
		save = new Scanner(System.in).nextDouble();
		for(int i=1;i<=6;i++){
			money = (save+money)*(1+0.00417);
		}
		
		System.out.println("After the sixth month, the account value is: " + format.format(money));
	}

}
