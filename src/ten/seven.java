package ten;

import java.util.Scanner;

public class seven {

	public static void main(String[] args){
		
		Account[] users = new Account[10];
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		for (int i = 0; i < users.length ; i++) {
			users[i] = new Account();
			users[i].setId(i);
			users[i].setBalance(100);
		}
		
		while(true){
			System.out.println("Enter an id:");
			int id = in.nextInt();
			if (id<=9) {
				System.out.printf("Main menu \n1: check balance \n2: withdraw\n3: deposit\n4: exit");
				int choice = 0;
				while (choice != 4) {
					System.out.println("Enter a choice:");
					choice = in.nextInt();
					switch (choice) {
					case 1:
						System.out.println("The balance is " +  users[id].getBalance());
						break;
					case 2:
						System.out.println("Enter an amount to withdraw");
						double draw = in .nextDouble();
						users[id].withDraw(draw);
						break;
					case 3:
						System.out.println("Enter an amount to deposit:");
						double money = in.nextDouble();
						users[id].deposit(money);
						break;
					case 4:
						break;
					default:
						break;
					}
					
				}
			}else {
				System.out.println("Please input a right id");
			}
		}
	}

}
