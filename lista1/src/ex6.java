import javax.swing.JOptionPane;

public class ex6 {
	public static void main(String[]args) {

		ex1 ex1 = new ex1();
		ex2 ex2 = new ex2();
		ex3 ex3 = new ex3();
		ex4 ex4 = new ex4();
		ex5 ex5 = new ex5();
		
		int op = Integer.parseInt(JOptionPane.showInputDialog("O que você deseja?\n"
				+ " 1 - Calcular reajuste de salário com valor variável\n"
				+ " 2 - Calcular a diferença de dois valores\n"
				+ " 3 - Utilizar a calculadora\n"
				+ " 4 - Calcular salário atual e liquído (alíquota 27,5%)\n"
				+ " 5 - Calcular o fatorial e um número"));
		
		switch (op) {
		case 1:
			ex1.main(null);
			break;
		case 2:
			ex2.main(null);
			break;
		case 3:
			ex3.main(null);
			break;
		case 4:
			ex4.main(null);
			break;
		case 5:
			ex5.main(null);
			break;
		default:
			JOptionPane.showMessageDialog(null, "Escolha uma opção válida!!!");
			main(null);
		}
	}
}