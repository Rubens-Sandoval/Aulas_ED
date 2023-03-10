import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[]args){
		double v1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro valor: "));
		double v2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo valor: "));
		int op = Integer.parseInt(JOptionPane.showInputDialog("Escolha a opera��o:\n 1 - Soma\n"
				+ " 2 - Subtra��o\n"
				+ " 3 - Multiplica��o\n"
				+ " 4 - Divis�o"));
				
		switch(op) {
			case 1:
				soma(v1, v2);			
				break;
			case 2:				
				sub(v1, v2);
				break;
			case 3:			
				mult(v1, v2);
				break;
			case 4:
				div(v1, v2);
				break;
			default:
				JOptionPane.showMessageDialog(null, "Informe um valor v�lido!!!");
				main(null);
		}
		
	}
	public static void soma(double v1, double v2) {
		double result = v1 + v2;
		printar(result);
	}
	
	public static void sub(double v1, double v2) {
		double result = v1 - v2;
		printar(result);	}
	
	public static void mult(double v1, double v2) {
		double result = v1 * v2;
		printar(result);	}
	
	public static void div(double v1, double v2) {
		double result = v1 / v2;
		printar(result);	}
	
	public static void printar(double valor) {
		JOptionPane.showMessageDialog(null, "Resultado: " + valor);
	}
	
}