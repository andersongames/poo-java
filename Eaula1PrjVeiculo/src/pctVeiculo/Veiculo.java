package pctVeiculo;

public class Veiculo {
	String modeloVeiculo;
	String marcaVeiculo;
	String tipoVeiculo;
	int qtdeRodas;
	int qtdePassageiros;
	
	public Veiculo() {
		super();
	};
	
	void incluiVeiculo(String modelo, String marca, String tipo, int rodas, int passageiros) {
		this.modeloVeiculo = modelo;
		this.marcaVeiculo = marca;
		this.tipoVeiculo = tipo;
		this.qtdeRodas = rodas;
		this.qtdePassageiros = passageiros;
	}
	
	void mostraVeiculo() {
		System.out.println("Modelo: " + modeloVeiculo);
		System.out.println("MArca: " + marcaVeiculo);
		System.out.println("Tipo: " + tipoVeiculo);
		System.out.println("Rodas: " + qtdeRodas);
		System.out.println("Passageiros: " + qtdePassageiros);
	}
}
