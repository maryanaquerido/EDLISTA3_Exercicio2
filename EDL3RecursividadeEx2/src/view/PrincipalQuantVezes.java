package view;
import controller.ControllerQuantVezes;
import javax.swing.JOptionPane;
public class PrincipalQuantVezes {
	public static void main (String []args) {
		
		ControllerQuantVezes m = new ControllerQuantVezes();
		int num = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor entre 10 e 999999:"));
		while ((num<10) || (num>999999)) {
			num = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente. Precisa ser entre 10 e 999999:"));
			
		}
		
		int i = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor entre 0 e 9:"));
		while ((i<0) || (i>9)) {
			i = Integer.parseInt(JOptionPane.showInputDialog("Digite novamente. Precisa ser entre 0 e 9:"));
			
		}
		
		int quant = m.QuantVezes(num, i);
		System.out.println("1° Número = " + num + "; 2° Número = " + i + "; retorno aparece " + quant + " vezes.");
	}
	

}
