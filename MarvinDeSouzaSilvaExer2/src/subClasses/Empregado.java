package subClasses;

import packInterface.Pagavel;

public abstract class Empregado extends Object implements Pagavel {
	
	private final String nome;
	private final String sobreNome;
	private final String numeroSeguroSocial;
	
	public Empregado(String nome, String sobreNome, String numeroSeguroSocial) {
		super();
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.numeroSeguroSocial = numeroSeguroSocial;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobreNome() {
		return sobreNome;
	}
	
	public String getNumeroSeguroSocial() {
		return numeroSeguroSocial;
		
	}

	@Override
	public String toString() {
		return "Empregado [numeroSeguroSocial=" + numeroSeguroSocial + "]";
		//return "Numero do seguro social"+ getNumeroSeguroSocial();
	}
	
}
