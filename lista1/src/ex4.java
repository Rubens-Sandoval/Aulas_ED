import javax.swing.JOptionPane;

public class ex4 {
	public static void main(String[]args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio atual: "));
		
		double salario_liq = calcreajuste(salario);
		JOptionPane.showMessageDialog(null, "O sal�rio l�quido �: " + salario_liq);
		
	}
	
	public static Double calcreajuste(Double sal) {
		double result = sal - (sal*0.275);
		return result;
	}
}