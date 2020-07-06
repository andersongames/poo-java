package modelo;

public class ItemPedido {
	private Produto produto;
	private double quantidade;
	
	public ItemPedido(Produto produto, double quantidade) {
		super();
		this.produto = produto;
		this.quantidade = quantidade;
	}
	public ItemPedido() {
		super();
	}
	
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public double getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
}
