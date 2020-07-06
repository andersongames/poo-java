package pctEmpregado;

public class Horario extends Empregado {
	private double salario;
	private double horas;

	public Horario(String nome, String nrDoct, double rendimento, double salario, double horas) {
		super(nome, nrDoct, rendimento);
		if (salario < 0.0)
		{
			throw new IllegalArgumentException("Salário Hora deve ser maior que 0!");
		}
		if (horas < 0.0)
		{
			throw new IllegalArgumentException("Horas deve ser maior que 0!");
		}
		this.salario = salario;
		this.horas = horas;
	}
	
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		if (salario < 0.0)
		{
			throw new IllegalArgumentException("Salário Hora deve ser maior que 0!");
		}
		this.salario = salario;
	}
	public double getHoras() {
		return horas;
	}
	public void setHoras(double horas) {
		if (horas < 0.0)
		{
			throw new IllegalArgumentException("Horas deve ser maior que 0!");
		}
		this.horas = horas;
	}

	@Override
	public double rendimentos() {
		if (getHoras() <= 160)
			setRendimento(getSalario() * getHoras());
		else
			setRendimento(160 * getSalario() + (getHoras() - 160) * getSalario() * 1.5);
		return getRendimento();
	}
}