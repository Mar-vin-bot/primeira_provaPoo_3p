package subClasses;

import classesConcreta.Empregado;

public class EmpregadoAssalariado extends Empregado {
	
	private double salarioSemanal;
	
	
	
	public EmpregadoAssalariado(String nome, String sobreNome, String numeroSeguroSocial, double salarioSemanal) {
		super(nome, sobreNome, numeroSeguroSocial);
		this.salarioSemanal = salarioSemanal;
	}
	
	
	public double getSalarioSemanal() {
		return salarioSemanal;
	}

	public void setSalarioSemanal(double salarioSemanal) {
		this.salarioSemanal = salarioSemanal;
		//método setter o parâmetro recebido deve ser validado.
	}
	
	public double calculaPagamento( ) {
		return salarioSemanal;  
		
	}
	
	@Override
	public String toString() {
		return  "\n Empregado Assalariado: " +getNome()+" "+getSobreNome()+
				"\n Número do Seguro Social:" +getNumeroSeguroSocial()+
				"\n Salário Semanal:" +getSalarioSemanal()+
				"\n Total Ganho "+calculaPagamento();
	
	}
	

}
