package modelo;

public class Animal {
	String nome;
	String tipo;
	String raca;
	Cliente dono;

	public Animal(String nome, String tipo, String raca, Cliente dono) {
		super();
		this.nome = nome;
		this.tipo = tipo;
		this.raca = raca;
		this.dono = dono;
	}

	public Animal() {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Cliente getDono() {
		return dono;
	}

	public void setDono(Cliente dono) {
		this.dono = dono;
	}
}
