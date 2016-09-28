package three;

import java.io.InputStream;
import java.util.Scanner;

public class thirtythree {

	public static void main(String[] args) {
		//金融：比较成本
		double w1,p1,w2,p2;
		int ans = 0;
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter weight and price for package 1:");
		w1 = in.nextDouble();
		p1 = in.nextDouble();
		System.out.println("Enter weight and price for package 2:");
		w2 = in.nextDouble();
		p2 = in.nextDouble();
		
		p1 = p1/w1;
		p2 = p2/w2;
		
		if(p1>p2){
			System.out.println("Package 2 has a better price");
		}
		else if(p1<p2){
			System.out.println("Package 1 has a better price");
		}
		else{
			System.out.println("Two packages have the same price");
		}
		
		
	}
}
