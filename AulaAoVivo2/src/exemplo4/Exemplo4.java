package exemplo4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exemplo4 {
	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int i, n;
		
		System.out.printf("Informe o n�mero para a tabuada:\n");
		n = ler.nextInt();
				
		FileWriter arq = new FileWriter("C:\\MeusRepositorios\\MeusProjetos\\poo-java\\Temp\\Exemplo4.dat");
		PrintWriter gravarArq = new PrintWriter(arq);
		
		gravarArq.printf("+--Resultado--+%n");
		for (i=1; i<=10; i++) {
			gravarArq.printf("| %2d * %d = %2d |%n", i, n, (i*n));
			}
			gravarArq.printf("+-------------+%n");
			
			arq.close();
			
			System.out.printf("\nTabuada do %d foi gravada com sucesso.", n);
	}
}