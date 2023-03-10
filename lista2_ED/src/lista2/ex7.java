package lista2;

import javax.swing.JOptionPane;

public class ex7{
	public static void main(String[] args) {
		double n1 = 2;
		double n2 = 3;
		double result = 0;
		
		if (n1 > n2) {
			result = n1 - n2;
		} else if (n2 > n1) {
			result = n2 - n1;
		}
		
		JOptionPane.showMessageDialog(null, "Resultado: " + result);
	}
}