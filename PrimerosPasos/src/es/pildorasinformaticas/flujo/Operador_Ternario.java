
// *************************************** video 29 OPERADOR TERNARIO **************************

package es.pildorasinformaticas.flujo;

import javax.swing.JOptionPane;

public class Operador_Ternario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//tomar� dos salarios y me dir� el mayor   es poco usado pero ahorrqa c�digo
		 
		double salario1=Integer.parseInt(JOptionPane.showInputDialog
				("primer salario"));
		
		double salario2=Integer.parseInt(JOptionPane.showInputDialog
				("segundo salario"));
		
		double salario_mayor;
		
		if (salario1>salario2) salario_mayor=salario1;
		
		else salario_mayor=salario2;

		
		System.out.println("el mayor es " + salario_mayor);
		
		/* ahora hago lo mismo con operador ternario
		 * fijarse que al usuario es EXACTAMENTE IGUAL
		 * pero el c�digo es mas sencillo
		 */
		
		double salario3=Integer.parseInt(JOptionPane.showInputDialog
				("primer salario"));
		
		double salario4=Integer.parseInt(JOptionPane.showInputDialog
				("segundo salario"));
		
		double salario_mayor2;
		
		/*if (salario1>salario2) salario_mayor=salario1;
		
		else salario_mayor=salario2;*/
		
		salario_mayor2=(salario3>salario4)   ?   salario3:salario4; 
		//esta linea sola reemplaz� a las dos previas
		//algo es algo... en un programa largo puede hacer diferencias
		
		//elegir� la primera si es verdadero y la segunda si es falso
		
	
		System.out.println("el mayor es " + salario_mayor2);
		
		
		
		//******************   otro ejemplo del mismo viswo 29     *** *******
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("edad por favor"));
		
		String mayor=(edad>18)?"sos mayor":"Sos pendejo";
		// osea el operador ternario TAMBIEN devuelve string si quiero
		
		 System.out.println(mayor);
		
		
		
		 
		
		
		
		
		
		
		
		
		

	}

}
