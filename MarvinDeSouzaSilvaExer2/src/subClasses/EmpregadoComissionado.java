package subClasses;

public class EmpregadoComissionado extends Empregado {

	private double vendasBrutasSemanais, taxaComissao;


	public EmpregadoComissionado(String nome, String sobreNome, String numeroSeguroSocial, double vendasBrutasSemanais,
			double taxaComissao) {
		super(nome, sobreNome, numeroSeguroSocial);
		
		if (vendasBrutasSemanais <=0)
			throw new IllegalArgumentException("Vendas brutas semanais deve ser maior que zero");
	     if (taxaComissao <= 0.0 || taxaComissao >= 1.0)
			throw new IllegalArgumentException("Taxa de comissão deve estar entre 0 e 1");
		
		this.vendasBrutasSemanais = vendasBrutasSemanais;
		this.taxaComissao = taxaComissao;
	}

	


	// métodos setters o parâmetro recebido deve ser validado. -> taxa, esta está
	// entre 0 e 1 ( 0% e 100%).
	public void setTaxaComissao(double taxaComissao) {
	     if (taxaComissao <= 0.0 || taxaComissao >= 1.0)
			throw new IllegalArgumentException("Taxa de comissão deve estar entre 0 e 1");
		this.taxaComissao = taxaComissao;
	}


	public void setVendasBrutasSemanais(double vendasBrutasSemanais) {
		if (vendasBrutasSemanais <=0)
			throw new IllegalArgumentException("Vendas brutas semanais deve ser maior que zero");
		this.vendasBrutasSemanais = vendasBrutasSemanais;
	}

	public double getVendasBrutasSemanais() {
		return vendasBrutasSemanais;
	}

	public double getTaxaComissao() { 	//depois usa a linha comentada para ver retorno, não deixa de fazer adp need
		//return taxaComissao/100;
		return taxaComissao;
	}
	
	public double calculaPagamento( ) {
		return (taxaComissao) * vendasBrutasSemanais;  //atencao ao parametro isso que diferencia-ra dos demais
		
	}



	@Override
	public String toString() {
		return "\n Empregado Comissionado: "+ getNome()+" "+getSobreNome()+
				"\n Numero do seguro social "+getNumeroSeguroSocial()+
				"\n Vendas Brutas Semanais "+ getVendasBrutasSemanais()+ " Taxa de Comissão "+getTaxaComissao();
				//"\n Total Ganho "+calculaPagamento();
	}
	

}
