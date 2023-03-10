package lista2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ex6{
	public static void main(String[] args) {
		int n1 = 1;
		int n2 = 200;
		int n3 = 999;
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(n1);
		lista.add(n2);
		lista.add(n3);
		
		ArrayList<Integer> listaVer = new ArrayList<Integer>();
		
		String mensagem = "Números dentro do range: ";
		
		for (int i : lista) {
			if (i >= 100 && i <= 1000) {
				listaVer.add(i);
			}
		}
		
		for (int i : listaVer) {
			mensagem = mensagem + i +", ";
		}
		
		JOptionPane.showMessageDialog(null, mensagem);
		
	}
}