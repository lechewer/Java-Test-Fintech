package Model;

public class Gastos {
	private int idGasto;
	private String descricao;
	private double preco;
	private String data;
	
	public int getIdGasto() {
		return idGasto;
	}
	
	public void setIdGasto(int idGasto) {
		this.idGasto = idGasto;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getData() {
		return data;
	}
	
	public void setData(String data) {
		this.data = data;
	}
}
