package model;

public class Main {

	public static void main(String[] args) {
		Funcionario func = new Funcionario("Joao", "joao@aqui", "Santa Felicidade", 999999999, 99, "Gerente");
		
		System.out.println("Nome: " + func.getNome());
	}

}