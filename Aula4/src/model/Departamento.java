package model;

public class Departamento {
	private String nome;
	private int id;
	
	public Departamento() {
		
	}
	
	public Departamento(String nome, int id) {
		this.id = id;
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if(nome.isEmpty()) {
			this.nome = nome;
		}
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}