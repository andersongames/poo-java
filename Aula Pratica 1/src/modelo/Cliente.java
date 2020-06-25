package modelo;

public class Cliente {
	//atributos
	String nome;
	String endereco;
	String telefone;
	
	//metodos construtores
	public Cliente() {
		
	}
	
	public Cliente(String nome, String endereco, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	//metodos de retorno
	public String getNome() {
		return nome;
	}
	
	public String getEndereco() {
		return endereco;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	//metodos de inserção
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
