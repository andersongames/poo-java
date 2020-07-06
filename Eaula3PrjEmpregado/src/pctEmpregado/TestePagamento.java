package pctEmpregado;

public class TestePagamento {

	public static void main(String[] args) {
		Salario sal = new Salario("João", "123456789", 0, 2500.00);
		System.out.println("*** rendimento Mensalistas ***");
		System.out.println("Nome: " + sal.getNome());
		System.out.println("Documento: " + sal.getNrDoct());
		System.out.println("Salário Mensal: " + sal.getSalarioMensal());
		System.out.println();
		sal.rendimentos();
		System.out.println("Rendimento: " + sal.getRendimento());
		System.out.println();
		
		Horario hor = new Horario("João", "123456789", 0, 30.00, 12.00);
		System.out.println("*** Rendimentos Horistas ***");
		System.out.println("Nome: " + hor.getNome());
		System.out.println("Documento: " + hor.getNrDoct());
		System.out.println("Valor Hora: " + hor.getSalario());
		System.out.println("Total Horas: " + hor.getHoras());
		System.out.println();
		hor.rendimentos();
		System.out.println("Rendimento: " + hor.getRendimento());
		System.out.println();
		
		Comissao com = new Comissao("João", "123456789", 0, 20000.00, 0.2);
		System.out.println("*** Rendimentos Comissionados ***");
		System.out.println("Nome: " + com.getNome());
		System.out.println("Documento: " + com.getNrDoct());
		System.out.println("Venda Bruta: " + com.getVendaBruta());
		System.out.println("Taxa de Comissao: " + com.getTaxaComissao());
		System.out.println();
		com.rendimentos();
		System.out.println("Rendimento: " + com.getRendimento());
		System.out.println();
	}
}