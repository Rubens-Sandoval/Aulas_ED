package lista2;

import javax.swing.*;

public class ex10{
	public static void main(String[] args) {
		double nProfessor = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota de professor"));
		double nProva = Double.parseDouble(JOptionPane.showInputDialog("Insira a nota da prova"));
		
		if (nProfessor >= 6 || nProva >= 6) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}