package modelo;

public class Supervisor extends Funcionario {
	public Supervisor() {
		super();
	}
	public Supervisor(String matricula, String nome, Endereco endereco, Departamento departamento, double salario) {
		super(matricula, nome, endereco, departamento, salario);
	}
	
	@Override
	public double calculaComissao() {
		return salario * 0.15;
	}
}
