package principal;

import modelo.Animal;
import modelo.Cliente;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente = new Cliente("João", "Aqui", "555-1234");
		Animal animal = new Animal("Toto", "Cachorro", "SRD", cliente);
		
		System.out.println("Nome: " + animal.getDono().getNome() +  " Animal: " + animal.getNome());
	}

}
