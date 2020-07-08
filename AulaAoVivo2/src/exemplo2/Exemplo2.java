package exemplo2;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exemplo2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Scanner ler = new Scanner(System.in);
		String nome;
		char sexo;
		int idade, altura;
		double pc; //peso corporal
		
		FileOutputStream arq = new FileOutputStream("C:\\MeusRepositorios\\MeusProjetos\\poo-java\\Temp\\Exemplo2.dat");
		DataOutputStream gravarArq = new DataOutputStream(arq);
		
		System.out.printf("Informe o seu nome: ");
		nome = ler.nextLine();
		
		System.out.printf("Informe o seu sexo (M/F): ");
		sexo = (char)System.in.read();
		
		System.out.printf("Informe sua idade: ");
		idade = ler.nextInt();
		
		System.out.printf("Informe seu peso corporal (em kg): ");
		pc = ler.nextDouble();
				
		System.out.printf("Informe a sua altura (em cm): ");
		altura = ler.nextInt();
		
		gravarArq.writeUTF(nome);
		gravarArq.writeChar(sexo);
		gravarArq.writeInt(idade);
		gravarArq.writeDouble(pc);
		gravarArq.writeInt(altura);
		
		arq.close();
		
		System.out.println("\nDados gravados com sucesso na pasta Temp");
	}
}