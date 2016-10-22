package four;
import javax.swing.JOptionPane;

public class GUIInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		String inputString;
		
		inputString= JOptionPane.showInputDialog(null,"请输入一个整形值");
		num1 = Integer.parseInt(inputString);
		
		inputString= JOptionPane.showInputDialog(null,"请输入一个整形值");
		num2 = Integer.parseInt(inputString);
		
		JOptionPane.showConfirmDialog(null, num1+"+"+num2+"="+(num1+num2));
		//Scanner input = new Scanner(System.in);
		//integer value = input.nextInt;
		//			  next  读一个字符串
	}

}
