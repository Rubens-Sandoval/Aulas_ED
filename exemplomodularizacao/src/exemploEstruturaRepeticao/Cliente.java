package exemploEstruturaRepeticao;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String rg;
	private Banco bc;
	
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Banco getBc() {
		return bc;
	}
	public void setBc(Banco bc) {
		this.bc = bc;
	}
	
	public static void main(String[] args) {
		Banco bc = new Banco();
		Banco bc2 = new Banco();
		Banco bc3 = new Banco();

		bc.setId(123);
		System.out.println(bc.getId());
	}
	
}
