package subClasses;


public class EmpregadoHorista extends Empregado {

	private double salarioHora, horasTrabalhadas;

	public EmpregadoHorista(String nome, String sobreNome, String numeroSeguroSocial, double salarioHora,
			double horasTrabalhadas) {
		super(nome, sobreNome, numeroSeguroSocial);
		
		if(salarioHora <= 0)
			 throw new IllegalArgumentException("Salario hora deve ser maior que zero");
		if (horasTrabalhadas <=0)
			throw new IllegalArgumentException("Horas trabalhada deve ser maior que zero");
		
		this.salarioHora = salarioHora;
		this.horasTrabalhadas = horasTrabalhadas;
	}

	// métodos setters o parâmetro recebido deve ser validado.

	public void setHorasTrabalhadas(double horasTrabalhadas) {
		if (horasTrabalhadas <=0)
			throw new IllegalArgumentException("Horas trabalhada deve ser maior que zero");
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public void setSalarioHora(double salarioHora) {
		if(salarioHora <= 0)
			 throw new IllegalArgumentException("Salario hora deve ser maior que zero");
		this.salarioHora = salarioHora;
	}

	public double getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public double getSalarioHora() {
		return salarioHora;
	}

	public double calculaPagamento() {
		if (getHorasTrabalhadas() <= 40) {
			return getHorasTrabalhadas() * getSalarioHora();
		} else {
			return 40 * getSalarioHora() + (getHorasTrabalhadas() - 40) * 1.5;
		}

	}

	@Override
	public String toString() {
		return "\n Empregado Horista: "+getNome()+" "+getSobreNome()+
				"\n Numero do seguro social "+getNumeroSeguroSocial()+
				"\n Valor por hora "+getSalarioHora()+ " Horas Trabalhadas "+getHorasTrabalhadas();
				//"\n Total Ganho "+calculaPagamento();
	

	}

}
