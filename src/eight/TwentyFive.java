package eight;

import java.util.Scanner;

public class TwentyFive {
	
	//Âí¶û¿Æ·ò¾ØÕó
	public static void main(String[] args){
		final int N = 3;
		double[][] m = new 	double[N][N];
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a 3-by-3 matrix row by row:");
		for(int i = 0; i < N; i++)
			for(int j = 0; j < N; j++)
				m[i][j] = input.nextDouble();
		
		if(isMarkovMatrix(m))
			System.out.print("Is is a Markov matrix");
		else
			System.out.print("Is is not a Markov matrix");		
	}
	
	public static boolean isMarkovMatrix(double[][] m){
		double sum = 0;
		int i,j;
		for(j = 0; j < m[0].length; j++){
			for(i = 0; i < m.length; i++){
				sum += m[i][j];
			}
			if(sum != 1){
				return false;
			}
			sum = 0;
		}
		return true;
	}
}
