package subClasses;

public class EmpregadoMisto extends EmpregadoComissionado {

	private double salarioBase;

	
	public EmpregadoMisto(String nome, String sobreNome, String numeroSeguroSocial, double vendasBrutasSemanais,
			double taxaComissao, double salarioBase) {
		super(nome, sobreNome, numeroSeguroSocial, vendasBrutasSemanais, taxaComissao);
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;

	}
	
	public double calculaPagamento() {
		return salarioBase + ((getTaxaComissao()/100) * getVendasBrutasSemanais());
		
		//TRAZER DIRETO O CALCULAPAGAMENTO DE EMPREGADO COMISSIONADO
	}
	
	@Override
	public String toString() {
		return "\n Empregado Misto: "+getNome()+" "+getSobreNome()+
				"\n Número Seguro Social "+getNumeroSeguroSocial()+
				"\n Vendas brutas semanais "+getVendasBrutasSemanais()+ " Taxa de comissão "+getTaxaComissao()/100+
				"\n Salario base "+getSalarioBase()+
				"\n Total Ganho "+calculaPagamento();
	}

}
