package classesConcreta;

import packInterface.Pagavel;

public class Fatura implements Pagavel {
	
	private final String numeroPeca;
	private final String descricaoPeca; 	
	private int quantidade;
	private double precoItem;
	
	public Fatura(String numeroPeca, String descricaoPeca, int quantidade, double precoItem) {
		super();
		
		if(quantidade < 1) {
			 throw new IllegalArgumentException("Quantidade de produto deve ser maior ou igual a 1");
		}
		if(precoItem <=0) {
			 throw new IllegalArgumentException("Valor da fatura deve ser maior que zero");
		}
		
		this.numeroPeca = numeroPeca;
		this.descricaoPeca = descricaoPeca;
		this.quantidade = quantidade;
		this.precoItem = precoItem;			//fazer validação do int e double 
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if ( quantidade < 1)
			throw new IllegalArgumentException("Quantidade deve ser maior ou igual a 1");
		this.quantidade = quantidade;
	}

	public double getPrecoItem() {
		return precoItem;
	}

	public void setPrecoItem(double precoItem) {
		if (precoItem <= 0.0)
			throw new IllegalArgumentException("Valor deve ser maior que zero");
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
