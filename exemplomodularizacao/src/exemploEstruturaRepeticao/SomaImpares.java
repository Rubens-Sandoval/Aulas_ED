package exemploEstruturaRepeticao;

public class SomaImpares {
	public static void main(String[] args) {
		int i, soma = 0;
		
		for (i=1;i<=1000;i++) {
			if (i%2 > 0) {
				soma += i;
			}
		}
		
		System.out.println(soma);
	}
}
