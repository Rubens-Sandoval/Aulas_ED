package exemploEstruturaRepeticao;

public class EstruturaRepeticao {
	public static void main(String[] args) {
		int soma = 0;
		int i = 0;
		
		System.out.println("Result For loop: " + forLoop(soma, i));
		System.out.println("Result While loop: " + whileLoop(soma, i));
		System.out.println("Result Do While loop: " + dowhileLoop(soma, i));
	}
	
	public static int forLoop(int soma, int i) {
		for (i=1;i<100;i++) {
			soma+=i;
		}
		return soma;
	}
	
	public static int whileLoop(int soma, int i) {
		while (i<100) {
			soma+=i;
			i++;
		}
		return soma;
	}
	
	public static int dowhileLoop(int soma, int i) {
		do {
			soma += i;
			i++;
		} while (i<100);
		
		return soma;
	}
}
