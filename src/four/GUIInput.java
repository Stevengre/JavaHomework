package four;
import javax.swing.JOptionPane;

public class GUIInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		String inputString;
		
		inputString= JOptionPane.showInputDialog(null,"������һ������ֵ");
		num1 = Integer.parseInt(inputString);
		
		inputString= JOptionPane.showInputDialog(null,"������һ������ֵ");
		num2 = Integer.parseInt(inputString);
		
		JOptionPane.showConfirmDialog(null, num1+"+"+num2+"="+(num1+num2));
		//Scanner input = new Scanner(System.in);
		//integer value = input.nextInt;
		//			  next  ��һ���ַ���
	}

}
