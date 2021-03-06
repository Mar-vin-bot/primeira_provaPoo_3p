package subClasses;

public class EmpregadoMisto extends EmpregadoComissionado {

	private double salarioBase;

	
	public EmpregadoMisto(String nome, String sobreNome, String numeroSeguroSocial, double vendasBrutasSemanais,
			double taxaComissao, double salarioBase) {
		super(nome, sobreNome, numeroSeguroSocial, vendasBrutasSemanais, taxaComissao);
		
        if (salarioBase <= 0.0)
            throw new IllegalArgumentException("Salario base devem ser > 0.0");
		
		this.salarioBase = salarioBase;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(double salarioBase) {
        if (salarioBase <= 0.0)
            throw new IllegalArgumentException("Salario base devem ser > 0.0");
		
		this.salarioBase = salarioBase;

	}
	
	public double calculaPagamento() {
		return ((getTaxaComissao()) * getVendasBrutasSemanais());
		
		//TRAZER DIRETO O CALCULAPAGAMENTO DE EMPREGADO COMISSIONADO
	}
	
	@Override
	public String toString() {
		return "\n Empregado Misto: "+getNome()+" "+getSobreNome()+
				"\n Número Seguro Social "+getNumeroSeguroSocial()+
				"\n Vendas brutas semanais "+getVendasBrutasSemanais()+ " Taxa de comissão "+getTaxaComissao()+
				" Salario base "+getSalarioBase();
				
	}

}
