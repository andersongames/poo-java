package pctEmpregado;

public abstract class Empregado {
	private String nome;
	private String nrDoct;
	private double rendimento;
	
	public Empregado(String nome, String nrDoct, double rendimento) {
		super();
		this.nome = nome;
		this.nrDoct = nrDoct;
		this.rendimento = rendimento;
	}
	public Empregado() {
		super();
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNrDoct() {
		return nrDoct;
	}
	public void setNrDoct(String nrDoct) {
		this.nrDoct = nrDoct;
	}
	public double getRendimento() {
		return rendimento;
	}
	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	
	public abstract double rendimentos();
}