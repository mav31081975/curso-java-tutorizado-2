



//***********************************  video 28 condicional switch **********************


package es.pildorasinformaticas.flujo;

import javax.swing.JOptionPane;

public class Condicional_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int hijos= 
				Integer.parseInt
				( JOptionPane.showInputDialog
						("cu�ntos pibes ten�s?"));
		
		switch(hijos) {
		
		case 0: System.out.println("nataliudad baja"); break;
		
		case 1: System.out.println("bien bien"); break;
		
		case 2: System.out.println("mejor"); break;
		
		case 3: System.out.println("uuuuu"); 
		break;
		
		
		case 4: System.out.println("par� la f�brica");
		break;
		
		
		default: 
			System.out.println("sos un hijo de puta, dej� de tener pibes!!");
	
	
		
		/* este condicional switch eval�a a partir del caso pripuesto hasta abajo del todo
		 * por eso hay  que poner un brake;(freno)
		 * 
		 * 
		 * solo evalua IGUALDAD, por eso se usa "poco"
		 * 
		 * otar que es mas sencillo que un if la sintaxis
		 * pero solamente evalua n�meros enteros en sus diferentes tipos   
		 * */
		
		
		
		}
		 

		

	}

}
