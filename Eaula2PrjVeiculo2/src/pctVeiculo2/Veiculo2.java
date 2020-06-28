package pctVeiculo2;

public class Veiculo2 {
	private String modeloVeiculo;
	private String marcaVeiculo;
	private String tipoVeiculo;
	private int qtdeRodas;
	private int qtdePassageiros;
	
	public Veiculo2() {
		
	}
	
	public void incluiVeiculo(String modelo, String marca, String tipo, int rodas, int passageiros) {
		this.modeloVeiculo = modelo;
		this.marcaVeiculo = marca;
		this.tipoVeiculo = tipo;
		this.qtdeRodas = rodas;
		this.qtdePassageiros = passageiros;
	}
	
	public void mostraVeiculo() {
		System.out.println("Modelo: " + modeloVeiculo);
		System.out.println("MArca: " + marcaVeiculo);
		System.out.println("Tipo: " + tipoVeiculo);
		System.out.println("Rodas: " + qtdeRodas);
		System.out.println("Passageiros: " + qtdePassageiros);
		System.out.println("");
	}

	public String getModeloVeiculo() {
		return modeloVeiculo;
	}

	public void setModeloVeiculo(String modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}

	public String getMarcaVeiculo() {
		return marcaVeiculo;
	}

	public void setMarcaVeiculo(String marcaVeiculo) {
		this.marcaVeiculo = marcaVeiculo;
	}

	public String getTipoVeiculo() {
		return tipoVeiculo;
	}

	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}

	public int getQtdeRodas() {
		return qtdeRodas;
	}

	public void setQtdeRodas(int qtdeRodas) {
		this.qtdeRodas = qtdeRodas;
	}

	public int getQtdePassageiros() {
		return qtdePassageiros;
	}

	public void setQtdePassageiros(int qtdePassageiros) {
		this.qtdePassageiros = qtdePassageiros;
	}
	
	
}
