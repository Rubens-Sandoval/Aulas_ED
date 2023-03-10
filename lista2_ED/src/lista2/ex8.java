package lista2;

import javax.swing.JOptionPane;

public class ex8{
	public static void main(String[] args) {
		double n1 = 5;
		double n2 = 7;
		double n3 = 8;
		double n4 = 0;
		
		double media = somar(n1, n2, n3) / 3;
		
		if (media > 6) {
			JOptionPane.showMessageDialog(null, "Média: " + media + "\nAPROVADO!");
		} else {
			n4 = Double.parseDouble(JOptionPane.showInputDialog("Média: " + media + "\nREPROVADO\nInsira a nota de recuperação: "));
			media = somar((media*3), n4)/4;
			if (media > 6) {
				JOptionPane.showMessageDialog(null, "Média: " + media + "\nAPROVADO!");
			} else {
				JOptionPane.showMessageDialog(null, "Média: " + media + "\nREPROVADO!");
			}
		}
		
		
	}
	
	public static double somar(double n1, double n2, double n3) {
		return n1 + n2 + n3;
	}
	
	public static double somar(double n1, double n2) {
		return n1 + n2;
	}
}