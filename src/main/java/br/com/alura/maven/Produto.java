package br.com.alura.maven;

public class Produto {
	private final String nome;
	private final double preco;
	
	public Produto(String nome, double preco) {
		super();
		this.nome = nome;
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public String getNome() {
		return nome;
	}
	
	@Override
	public String toString() {
		return "[Nome: "+nome+", Preço: "+preco+"]";
	}

	public double getPrecoComImposto() {
		return this.preco*1.10;
	}
	
	

}
