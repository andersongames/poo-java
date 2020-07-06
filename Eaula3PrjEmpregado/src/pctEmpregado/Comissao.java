package pctEmpregado;

public class Comissao extends Empregado {
	private double vendaBruta;
	private double taxaComissao;
	
	public Comissao(String nome, String nrDoct, double rendimento, double vendaBruta, double taxaComissao) {
		super(nome, nrDoct, rendimento);
		if (taxaComissao <= 0.0 || taxaComissao >= 1.0)
		{
			throw new IllegalArgumentException("Taxa de comissão deve ser maior que 0 e menor que 1!");
		}
		if (vendaBruta <= 0.0)
		{
			throw new IllegalArgumentException("Venda Bruta deve ser maior que 0");
		}
		this.vendaBruta = vendaBruta;
		this.taxaComissao = taxaComissao;
	}

	public double getVendaBruta() {
		return vendaBruta;
	}
	public void setVendaBruta(double vendaBruta) {
		if (vendaBruta <= 0.0)
		{
			throw new IllegalArgumentException("Venda Bruta deve ser maior que 0");
		}
		this.vendaBruta = vendaBruta;
	}
	public double getTaxaComissao() {
		return taxaComissao;
	}
	public void setTaxaComissao(double taxaComissao) {
		if (taxaComissao <= 0.0 || taxaComissao >= 1.0)
		{
			throw new IllegalArgumentException("Taxa de comissão deve ser maior que 0 e menor que 1!");
		}
		this.taxaComissao = taxaComissao;
	}

	@Override
	public double rendimentos() {
		setRendimento(getTaxaComissao() * getVendaBruta());
		return getRendimento();
	}
}