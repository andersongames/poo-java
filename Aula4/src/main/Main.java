package main;

import model.Departamento;
import model.Funcionario;

public class Main {

	public static void main(String[] args) {
		Departamento departamento = new Departamento("Financeiro", 1);
		Funcionario funcionario = new Funcionario(1, "Joao", 1234, departamento);
		
		System.out.println("Nome: " + funcionario.getNome());
		System.out.println("Matricula: " + funcionario.getMatricula());
		System.out.println("Ramal: " + funcionario.getRamal());
		System.out.println("Departamento - Nome: " + funcionario.getDepartamento().getNome());
	}
}
