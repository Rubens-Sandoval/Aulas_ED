package lista2;

import javax.swing.JOptionPane;

public class ex4{
	public static void main(String[] args) {
		double invest = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de  aplicação: "));
		
		JOptionPane.showMessageDialog(null, "Saldo após 1 mês da aplicação: " + calcMes(invest));
	}
	
	public static double calcMes(double invest) {
		return invest + (invest*0.013);
	}
}