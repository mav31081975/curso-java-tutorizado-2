
public class ConcatenacionStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salario=1850.55;
		
		double salarioEnDolares=1850.55*1.2;
		
		System.out.println("1 El salario de Manuel es: " + salarioEnDolares + " a d�a de hoy");
		
		
		
		System.out.println("2 El salario es: " + salario*2 + " a dia de hoy");
		/* PERO OJO CON LAS SEUMA en lo que viene, toma todos
		 * los n�meros como string 
		 * porque asume el operador suma como concatenacion
		 * y da un resultado inesperado de 1850.55300*/
		
		System.out.println("3 El salario es: " + salario + 300 + " a dia de hoy");
		
		/*Pero se soluciona con PARENTESIS*/
		System.out.println("4 El salario es: " + (salario + 300) + " a dia de hoy");
		
		
		/*lo que sigue es prueba del video que sigue 
		 * video 9*/
		
		
		
		double raiz=Math.sqrt(65.899);
		System.out.println(raiz);
	}

}
