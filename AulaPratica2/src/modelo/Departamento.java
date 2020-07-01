package modelo;

public class Departamento {
	protected String nome;
	protected String id;
	
	public Departamento(String nome, String id) {
		super();
		this.nome = nome;
		this.id = id;
	}
	
	public Departamento() {
		super();
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}