package model;

public class Pessoa {
	protected String nome;
	protected String contato;
	protected String endereco;
	
	public Pessoa(String nome, String contato, String endereco) {
		this.nome = nome;
		this.contato = contato;
		this.endereco = endereco;
	}
	
	public Pessoa() {
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
}
