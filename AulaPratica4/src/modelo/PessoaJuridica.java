package modelo;

public class PessoaJuridica extends Pessoa {
	private String cnpj;

	public PessoaJuridica() {
		super();
	}
	public PessoaJuridica(String nome, String endereco, String telefone, String email) {
		super(nome, endereco, telefone, email);
	}

	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}