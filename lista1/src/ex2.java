import javax.swing.JOptionPane;

public class ex2 {
	public static void main(String[]args) {
		double v1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
		double v2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: "));

		double result = v1 - v2;
		JOptionPane.showMessageDialog(null, "Diferença: " + result);
	}
}