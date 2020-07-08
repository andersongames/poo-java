package exemplo1;

import java.io.File;
import java.util.Scanner;

public class Exemplo1 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Informe o nome de um arquivo ou diretório:\n");
		String nome = ler.nextLine();
		
		File objFile = new File(nome);
		if(objFile.exists()) {
			if(objFile.isFile()) {
				System.out.printf("\nArquivo (%s) existe - tamanho: %d bytes\n");
					objFile.getName(); objFile.length();
			} else {
				System.out.println("\nConteudo do diretório:\n");
				String diretorio[] =  objFile.list();
				for (String item: diretorio) {
					System.out.printf("%s\n", item);
				}
			}
		} else System.out.printf("Erro: arquivo ou diretório informado não existe!\n");
	}
}