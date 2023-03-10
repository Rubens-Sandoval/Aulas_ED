package lista2;

public class ex2{
	public static void main(String[] args) {
		int dia = 3;
		int mes = 10;
		int ano = 2004;
		
		System.out.println("Dia: " + dia + "\n"
							+ "Mês: " + mes + "\n"
							+ "Ano: " + ano);
		
		System.out.println(exibirData(dia, mes, ano));
		
	}
	
	public static String exibirData(int dia, int mes, int ano) {
		return  dia + "/" + mes + "/" + ano;
	}
	
}