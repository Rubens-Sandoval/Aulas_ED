package lista2;

import javax.swing.JOptionPane;

public class ex3{
	public static void main(String[] args) {
		int x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X: "));
		int y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y: "));
		
		y = inverter(x, x = y);
		System.out.println("X: " + x + "Y: " + y);
	}
	
	public static int inverter(int x, int y) {
		return x;
	}
	
}