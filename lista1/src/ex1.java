import javax.swing.JOptionPane;

public class ex1 {
	public static void main(String[]args) {
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o sal�rio atual: "));
		double pctreajuste = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de reajuste:\n"
				+ "(EM N�MEROS DECIMAIS, 2% == 0.02) "));
		
		double salario_atual = calcreajuste(salario, pctreajuste);
		JOptionPane.showMessageDialog(null, "O novo sal�rio �: " + salario_atual);
		
	}
	public static Double calcreajuste(Double sal, Double pct) {
		double result = sal + (sal*pct);
		return result;
	}
}