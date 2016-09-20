package two;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Seventeen {

	public static void main(String[] args) {
		
		double anwser,fa,sp;
		Scanner in = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.00000");
		
		System.out.println("Enter the temperature in Fahrenheit between -58  ¨H and 41  ¨H:");
		fa = new Scanner(System.in).nextDouble();
		System.out.println("Enter the wind speed (>=2) in miles per hour: ");
		sp = new Scanner(System.in).nextDouble();
		
		anwser = 35.74+0.6215*fa-35.75*Math.pow(sp, 0.16)+0.4275*Math.pow(sp, 0.16)*fa;
		System.out.println("The wind chill index is " + format.format(anwser) );

	}

}
