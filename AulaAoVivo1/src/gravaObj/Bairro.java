package gravaObj;

import java.io.Serializable;
import java.util.EnumSet;

public class Bairro implements Serializable {
	private static final long serialVersionUID = 5110549514946052395L;
		
	String nome;
	boolean temRio;
	
	public static enum Qualidade {COMERCIAL, PRAIA, TURISMO, RESIDENCIAL};
	EnumSet<Qualidade> qualidades = EnumSet.noneOf(Qualidade.class);
	
	public Bairro(String nome, boolean rio, EnumSet<Qualidade> qualidades) {
		this.nome = nome;
		this.temRio = rio;
		this.qualidades = qualidades;
	}
}