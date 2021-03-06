package modelo;

public class Funcionario {
	protected String matricula;
	protected String nome;
	protected Endereco endereco;
	protected Departamento departamento;
	protected double salario;
	
	public Funcionario(String matricula, String nome, Endereco endereco, Departamento departamento, double salario) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.endereco = endereco;
		this.departamento = departamento;
		this.salario = salario;
	}
	
	public Funcionario() {
		super();
	}

	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double calculaComissao() {
		return salario * 0.1;
	}
}