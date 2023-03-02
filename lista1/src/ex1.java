import javax.swing.JOptionPane;

public class ex1 {
	public static void main(String[]args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário atual: "));
		double pctreajuste = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de reajuste:\n"
				+ "(EM NÚMEROS DECIMAIS, 2% == 0.02) "));
		
		double salario_atual = calcreajuste(salario, pctreajuste);
		JOptionPane.showMessageDialog(null, "O novo salário é: " + salario_atual);
		
	}
	public static Double calcreajuste(Double sal, Double pct) {
		double result = sal + (sal*pct);
		return result;
	}
}