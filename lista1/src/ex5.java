import javax.swing.JOptionPane;

public class ex5 {
	public static void main(String[]args) {
		int valor = Integer.parseInt(JOptionPane.showInputDialog("Informe o valor a ser calculado: "));
		
		int result = 1;
		int counter = 1;
		
		while (counter <= valor) {
			result = result * counter;
			counter += 1;
		}
		
		JOptionPane.showMessageDialog(null, "O fatorial de " + valor + " é: " + result);
	}

}