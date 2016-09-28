package four;

import java.util.Arrays;
import java.util.Scanner;

public class TwentyFour {

	public static void main(String[] args) {
		String[] citys = new String[3];
		  
		for(int i = 0;i<=2;i++){
			System.out.println("Enter the " + i + " city");
			citys[i] = new Scanner(System.in).nextLine();
		}
		Arrays.sort(citys);
		
		System.out.println("The three cities in alphabetical order are " + citys[0] + " " + citys[1] + " " + citys[2]);
	}
}
