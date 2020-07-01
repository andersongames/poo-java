package model;

public class Funcionario {
	private int matricula;
	private String nome;
	private int ramal;
	private Departamento departamento;
	
	public Funcionario() {

	}

	public Funcionario(int matricula, String nome, int ramal, Departamento departamento) {
		this.matricula = matricula;
		this.nome = nome;
		this.ramal = ramal;
		this.departamento = departamento;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getRamal() {
		return ramal;
	}

	public void setRamal(int ramal) {
		this.ramal = ramal;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
}
