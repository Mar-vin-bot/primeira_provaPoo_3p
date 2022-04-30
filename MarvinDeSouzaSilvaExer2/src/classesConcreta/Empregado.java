package classesConcreta;

import packInterface.Pagavel;

public class Empregado implements Pagavel {
	
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
		/*
		String pt1 = numeroSeguroSocial.substring(0, 3);
		String pt2 = numeroSeguroSocial.substring(3, 5);
		String pt3 = numeroSeguroSocial.substring(5, 9);
		*/
		return numeroSeguroSocial;
		//return pt1+" - "+pt2+" - "+pt3;
		
	}


	@Override		//recebido pela interface, contudo não explicito no material
	public double calculaPagamento() {
		
		return 0;
	}


	@Override
	public String toString() {
		//return "Empregado [numeroSeguroSocial=" + numeroSeguroSocial + "]";
		return "Numero do seguro social"+ getNumeroSeguroSocial();
	}



	
	

	
	

	
	
	// sobrescrever o toString saida ->  Número do Seguro Social: 111-11-1111
}
