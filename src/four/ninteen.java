package four;

import java.util.Scanner;

public class ninteen {

	public static void main(String[] args) {
		String num = new String();
		int tmp = 0;
		int[] d = new int[9];
		Scanner in = new Scanner(System.in);
		
		System.out.println("ÇëÊäÈë¾Å¸öÊı×Ö");
		num = in.nextLine();
		
		for(int i=0;i<=8; i++){
			d[i] = num.charAt(i)-'0';
			tmp = tmp + d[i]*(i+1);
		}
		
		tmp = tmp%11;
				
		if(tmp!=10){
			System.out.println(num+tmp);
		}
		else{
			System.out.println(num+"X");
		}

	}
}
