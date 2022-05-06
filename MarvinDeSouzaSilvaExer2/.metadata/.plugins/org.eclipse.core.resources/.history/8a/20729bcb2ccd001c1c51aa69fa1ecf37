package classesConcreta;

import packInterface.Pagavel;

public class Fatura implements Pagavel {
	
	private final String numeroPeca;
	private final String descricaoPeca; 	//pq o final nas string
	private int quantidade;
	private double precoItem;
	
	public Fatura(String numeroPeca, String descricaoPeca, int quantidade, double precoItem) {
		super();
		this.numeroPeca = numeroPeca;
		this.descricaoPeca = descricaoPeca;
		this.quantidade = quantidade;
		this.precoItem = precoItem;			//fazer validação do int e double 
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		this.precoItem = precoItem;
	}

	public String getNumeroPeca() {
		return numeroPeca;
	}

	public String getDescricaoPeca() {
		return descricaoPeca;
	}

	@Override
	public double calculaPagamento() {
		
		return getQuantidade() * getPrecoItem();
	}
	
	@Override
	public String toString() {
		return "Fatura"+
				"Numero da peça "+getNumeroPeca()+
				"Quantidade "+getQuantidade()+
				"Preço por item "+getPrecoItem();
	}
	
	
}
