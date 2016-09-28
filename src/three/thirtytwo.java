package three;

import java.text.DecimalFormat;
import java.util.Scanner;

public class thirtytwo {

	public static void main(String[] args) {
		double x0,x1,x2,y0,y1,y2,ans;
		Scanner in = new Scanner(System.in);
		DecimalFormat format = new DecimalFormat("#.0");
		
		System.out.println("Enter three points fo p0, p1, and p2:");
		x0 = in.nextDouble();
		y0 = in.nextDouble();
		x1 = in.nextDouble();
		y1 = in.nextDouble();
		x2 = in.nextDouble();
		y2 = in.nextDouble();
		ans=(x1-x0)*(y2-y0)-(x2-x0)*(y1-y0);
		if(ans>0){
			System.out.println("(" + format.format(x2) + "," + format.format(y2) + ") " + "is on the left side of the line from "+"(" + format.format(x0) + "," + format.format(y0) + ")" +" (" + format.format(x1) + "," + format.format(y1) + ")" );
		}
		else if(ans==0){
			System.out.println("(" + format.format(x2) + "," + format.format(y2) + ") " + "is on the the line from "+"(" + format.format(x0) + "," + format.format(y0) + ")" +" (" + format.format(x1) + "," + format.format(y1) + ")" );
		}
		else{
			System.out.println("(" + format.format(x2) + "," + format.format(y2) + ") " + "is on the right side of the line from "+"(" + format.format(x0) + "," + format.format(y0) + ")" +" (" + format.format(x1) + "," + format.format(y1) + ")" );
		}
	}

}
