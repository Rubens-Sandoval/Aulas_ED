package exemploEstruturaRepeticao;

public class Banco implements Ibanco{
	private int id;
	private String nome;
	private String endereco;
	private double patrimonio;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(double patrimonio) {
		this.patrimonio = patrimonio;
	}

	@Override
	public void inserir(Banco bc) {
		Banco bc2 = new Banco();
		bc2.setId(bc.getId());
		bc2.setNome(bc.getNome());
		bc2.setEndereco(bc.getEndereco());
		bc2.setPatrimonio(bc.getPatrimonio());
	}
	
	@Override
	public void excluir(int id) {
		Banco bc2 = new Banco();
		bc2.setId(id);
	}
	
	@Override
	public void atualizar(Banco bc) {
		
	}
	
	public static void main(String[] args) {
		Banco b = new Banco();
		
		b.setId(1);
		System.out.println(b.getId());
		
		b.setNome("Banco de são Paulo");
		System.out.println(b.getNome());
		
		b.setEndereco("Rua tal");
		System.out.println(b.getEndereco());
		
		b.setPatrimonio(20000);
		System.out.println(b.getPatrimonio());

	}

}
