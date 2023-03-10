package lista2;

import javax.swing.JOptionPane;

public class ex5{
	public static void main(String[] args) {
		double sal = 2000;
		
		JOptionPane.showMessageDialog(null, "Salário aantigo: " + sal + "\n"
									+ "Salário novo: " + (sal+(sal * 0.2)));
	}
}