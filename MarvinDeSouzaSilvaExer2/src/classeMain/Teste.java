package classeMain;


import subClasses.Empregado;
import subClasses.EmpregadoAssalariado;
import subClasses.EmpregadoComissionado;
import subClasses.EmpregadoHorista;
import subClasses.EmpregadoMisto;

public class Teste {
		
		static Empregado[] criaEmpregado() {
			Empregado [] empregado  = new Empregado [4];
			
			empregado [0] = new EmpregadoAssalariado("Jhon", "Smith", "12345678", 800);
			empregado [1] = new EmpregadoHorista("Keren", "Price", "23456789", 16.75, 40);
			empregado [2] = new EmpregadoComissionado("Sue ", "Jhones ", "34567890 ", 10000, 0.06);
			empregado [3] = new EmpregadoMisto ("Bob", "Lewis", "456789012", 10000, 0.06, 300);
			
			return empregado;
		}
		
	    static void listaEmpregado( Empregado[ ] empregado){

	        
	        for(int i=0; i < empregado.length; i++){
	        	if (empregado[i] instanceof EmpregadoMisto) {
	        		double salarioBase = ((EmpregadoMisto) empregado[i]).getSalarioBase();
	        		double absoluto = (salarioBase * 1.1) + empregado[i].calculaPagamento();
	        		System.out.println(empregado[i].toString() +"\n Novo salario com base com 10% de aumento � R$ "+ salarioBase * 1.1+
	        				"\n Total de ganho R$ "+ (salarioBase * 1.1 + absoluto));
	        		
	        	}else {
	        		System.out.println(empregado[i].toString()+  "\n Total de ganho R$ "+empregado[i].calculaPagamento());
	        	}
	        		
	        }
	        
	        System.out.println("");
	    }

	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empregado [] empregado  = criaEmpregado ();
		listaEmpregado (empregado);
		
		/*
		
		EmpregadoAssalariado empregadoAssalariado = new EmpregadoAssalariado("Jhon", "Smith", "12345678", 800);
		
		EmpregadoHorista empregadoHorista = new EmpregadoHorista("Keren", "Price", "23456789", 16.75, 40);
		
		EmpregadoComissionado empregadoComissionado = new EmpregadoComissionado("Sue ", "Jhones ", "34567890 ", 10000, 0.6);
		
		EmpregadoMisto empregadoMisto = new EmpregadoMisto ("Bob", "Lewis", "456789012", 10000, 6, 300);
		
		System.out.println(empregadoAssalariado.toString());

		System.out.println(empregadoHorista.toString());
		
		System.out.println(empregadoComissionado.toString());
		
		System.out.println(empregadoMisto.toString());
		*/
	}
	

}
