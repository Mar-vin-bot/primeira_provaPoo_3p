package subClasses;

import classesConcreta.Empregado;

public class EmpregadoComissionado extends Empregado {

	private double vendasBrutasSemanais, taxaComissao;


	public EmpregadoComissionado(String nome, String sobreNome, String numeroSeguroSocial, double vendasBrutasSemanais,
			double taxaComissao) {
		super(nome, sobreNome, numeroSeguroSocial);
		this.vendasBrutasSemanais = vendasBrutasSemanais;
		this.taxaComissao = taxaComissao;
	}

	


	// métodos setters o parâmetro recebido deve ser validado. -> taxa, esta está
	// entre 0 e 1 ( 0% e 100%).
	public void setTaxaComissao(double taxaComissao) {
		this.taxaComissao = taxaComissao;
	}


	public void setVendasBrutasSemanais(double vendasBrutasSemanais) {
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
		return (taxaComissao/100) * vendasBrutasSemanais;  //atencao ao parametro isso que diferencia-ra dos demais
		
	}



	@Override
	public String toString() {
		return "\n Empregado Comissionado: "+ getNome()+" "+getSobreNome()+
				"\n Numero do seguro social "+getNumeroSeguroSocial()+
				"\n Vendas Brutas Semanais "+ getVendasBrutasSemanais()+ " Taxa de Comissão "+getTaxaComissao()/100+
				"\n Total Ganho "+calculaPagamento();
	}
	

}
