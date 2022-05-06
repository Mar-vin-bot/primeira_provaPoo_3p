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
		return ((getTaxaComissao()/100) * getVendasBrutasSemanais());
		
		//TRAZER DIRETO O CALCULAPAGAMENTO DE EMPREGADO COMISSIONADO
	}
	
	@Override
	public String toString() {
		return "\n Empregado Misto: "+getNome()+" "+getSobreNome()+
				"\n NÃºmero Seguro Social "+getNumeroSeguroSocial()+
				"\n Vendas brutas semanais "+getVendasBrutasSemanais()+ " Taxa de comissÃ£o "+getTaxaComissao()/100+
				" Salario base "+getSalarioBase();
				
	}

}
