package gravaObj;

	import java.util.List;
	import java.io.Serializable;

public class Cidade  implements Serializable {
	private static final long serialVersionUID = -7932047122858971692L;
	
	static class Ponto implements Serializable {
		private static final long serialVersionUID = 2651887979907L;
		
		double x, y;
		public Ponto(double x, double y ) {
			this.x = x;
			this.y = y;
		}
	}
	
	String nome;
	Ponto coordenadas;
	int populacao;
	boolean cidadePortuaria;
	List<String> palavras_chave;
	
	Bairro[] bairros;
	
	public Cidade(String nome, double geox, double geoy, int populacao, boolean portuaria, List<String> palavras, Bairro[] bairros) {
		this.nome = nome;
		this.coordenadas = new Ponto(geox, geoy);
		this.populacao = populacao;
		this.cidadePortuaria = portuaria;
		this.palavras_chave = palavras;
		this.bairros = bairros;
	}
	
	@Override
	public String toString() {
		StringBuilder strUtil = new StringBuilder();
		strUtil.append("Cidade: " + this.nome + "\n");
		strUtil.append("\n\tCoordenadas: " + this.coordenadas.x + "," + this.coordenadas.y);
		strUtil.append("\n\tPopulação: " + this.populacao);
		strUtil.append("\n\tCidade Portuária: " + ( this.cidadePortuaria ? "Sim" : "Não"));
		strUtil.append("\n\tPalavras-Chave: " + this.palavras_chave);
		strUtil.append("\n\tBairros");
		for(Bairro bairro: this.bairros) {
			strUtil.append("\n\t\tNome do Bairro: " + bairro.nome);
			strUtil.append("\n\t\t\tTem rio?: " + (bairro.temRio ? "Sim" : "Não"));
			strUtil.append("\n\t\t\tCaracterísticas: " + bairro.qualidades);
		}
		return strUtil.toString();
	}
}