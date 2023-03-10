package lista2;

import javax.swing.JOptionPane;

public class ex9{
	public static void main(String[] args) {
		double salario_atual = Double.parseDouble(JOptionPane.showInputDialog("Insira o salário atual: "));
		int op = Integer.parseInt(JOptionPane.showInputDialog("VALOR DE AUMENTO:\n"
															+ " 1 - 30%\n"
															+ " 2 - 40%\n"
															+ " 3 - 50%\n"
															+ " 4 - 60%\n"));
		
		double pct = 0;
		
		switch (op) {
		case 1:
			pct = 0.3;
			break;
		case 2:
			pct = 0.4;
			break;
		case 3:
			pct = 0.5;
			break;
		case 4:
			pct = 0.6;
			break;
		}
		
		JOptionPane.showMessageDialog(null, "Novo salário: " + calcSal(salario_atual, pct));
	}
	
	public static double calcSal(double sal, double pct) {
		return sal + (sal*pct);
	}
}