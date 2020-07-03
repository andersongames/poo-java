package model;

public class PessoaFisica extends Pessoa {
	protected int cpf;
	
	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, String contato, String endereco, int cpf) {
		super(nome, contato, endereco);
		this.cpf = cpf;
	}
	
	public int getCpf() {
		return cpf;
	}
	
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
}
