package lista2;

public class ex1{
	public static void main(String[] args) {
		int anoNasc = 1990;
		int anoAtual = 2023;
		
		System.out.println("Idade atual: " + idadeAtual(anoNasc, anoAtual));
		System.out.println("Idade atual: " + idadeFutura(anoNasc, anoAtual));
	}
	
	public static int idadeAtual(int anoNasc, int anoAtual) {
		return anoAtual - anoNasc;
	}
	
	public static int idadeFutura(int anoNasc, int anoAtual) {
		int idade = idadeAtual(anoNasc, anoAtual);
		return idade  + 25;
	}
}