package eight;

import java.nio.channels.ShutdownChannelGroupException;
import java.util.Scanner;

public class Twenty {
	//��������Ϸ
	private static int temp;
	public static void main(String[] args){
		String[][] board = new String[6][7];
		int i, j;
		for(i = 0; i < 6; i++){
			for(j = 0; j < 7; j++){
				board[i][j] = " ";
			}
		}
		playGame(board);
	}
	
	//��һ������
	public static void printBoard(String[][] board){
		int i, j;
		for(i = 0; i < 6; i++){
			for(j = 0; j < 7; j++){
				System.out.print("|");
				System.out.print(board[i][j]);
				if(j == 6)
					System.out.print("|");
			}
		System.out.println();
		}
	}
	
	//����Ϸ
	public static void playGame(String[][] board){	
		Scanner input = new Scanner(System.in);
		int key;
		printBoard(board);
		while(true){
			System.out.print("Drop a red disk at column(0-6): ");
			key = input.nextInt();
			changeBoard(board, key, "R");
			System.out.print("Drop a yellow disk at column(0-6): ");
			key = input.nextInt();	
			changeBoard(board, key, "Y");
		}
	}
	
	
	public static void changeBoard(String[][] board, int key,String color){
		int i;
		for(i = 5; i>=0; i--)
			if(board[i][key] == " "){
				board[i][key] = color;
				break;
			}
		printBoard(board);
		
		if(color == "Y"){
			color = "yellow";
			temp++;
		}
			
		else  
			color = "red";
		
		if(isFactory(board, i, key)){
			System.out.println("The "+ color + " player won");
			System.exit(0);	
		}
		if (temp==21) {
			System.out.println("Both won!");
			System.exit(0);
		}
	}
	
	//�ж���˭��ʤ
	public static boolean isFactory(String[][] board, int line, int row){
		int i,j;
		//��
		for(i = line, j = 0; j+3 < 7; j++){
			if( board[i][j]==board[i][j+1] && board[i][j]==board[i][j+				2] && board[i][j]==board[i][j+3] && board[i]						[j]==board[line][row])
			return true;
		}
		//��
		for(j = row, i = 0; i+3 < 6; i++){
			if(board[i][j]==board[i+1][j] && board[i][j]==board[i+2]				[j] && board[i][j]==board[i+3][j] && board[i]						[j]==board[line][row])
			return true;
		}
		//�Խ���
		int dia1 = 0;//���Խ��߳���
		int dia2 = 0;//���Խ��߳���
		int x1,y1,x2,y2,x3,y3,x4,y4;
		for(x1 = line, y1 = row; x1 < 6 && y1 < 7; x1++, y1++)
			dia1++;	//������
			x1--;
			y1--;
		for(x2 = line, y2 = row; x2 >= 0 && y2 >= 0; x2--, y2--)
			dia1++;	//������
			x2++;
			y2++;
		dia1--; 		//���Խ��ߴ�С
		for(x3 = line, y3 = row; x3 >= 0 && y3 < 7; x3--, y3++)
			dia2++;	//������
			x3++;
			y3--;
		for(x4 = line, y4 = row; x4 < 6 && y4 >= 0; x4++, y4--)
			dia2++;	//������
			x4--;
			y4++;
		dia2--;		//���Խ��ߴ�С
		if(dia1 >= 4){
			for(i = x2,j = y2; i+3 <= x1; i++,j++)
				if(board[i][j]==board[i+	1][j+1] && board[i]						[j]==board[i+2][j+2] && board[i]	[j]==board[i+3]					[j+3] && board[i][j]==board[line][row])
				return true; 
		}	
		if(dia2 >= 4){
			for(i = x4,j = y4; j+3 <= y3; i--,j++)
				if(board[i][j]==board[i-1][j+1] && board[i-2]						[j+2]==board[i][j] && board[i][j]==board[i-3]						[j+3] && board[i][j]==board[line][row])
				return true; 
		}
		return false;
	}
}
