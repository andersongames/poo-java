package lerObj;

import gravaObj.Cidade;

public class RestaurarObjetoTest {

	public static void main(String[] args) {
		//Recupera e imprime os valores
		System.out.println((Cidade) RestaurarObjeto
				.restaurar("C:\\MeusRepositorios\\MeusProjetos\\poo-java\\Temp\\Cidade.sav"));
	}
}