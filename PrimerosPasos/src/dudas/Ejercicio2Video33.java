package dudas;

import javax.swing.JOptionPane;

public class Ejercicio2Video33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = JOptionPane.showInputDialog("ingrese su email");
		String punto =".";
		String arroba="@";
				
		//borrar estas dos lineas proximas
		//String letrita= email.substring(0,1); //es el string sacado del email
		 //System.out.println(letrita);
		
		
		//System.out.println( email.charAt(0));
		
		int largo= email.length();
		
		String malo = ("introduc� un email verdadero por favor");
		
		 if (largo>4) 
		 
		 
			 
			//en la proxima llave averiguar si tiene un arroba
		 
		 { System.out.println(largo);
		 
		 for (int i=0; i<largo ; i++) //esto es la base del for, 
			 
			 //la llave siguiente es lo que hace ese for
			 
		 {
			 String letrita= email.substring(i,(i+1)); //es el string sacado del email
			 System.out.println(letrita);
			 boolean respuesta=arroba.equals(letrita);
			 
			 if (respuesta=true) { System.out.println("tiene un arroba, pero tiene mas?");
				 
				
				 
			 }
			 
		
			 
			 
			 //System.out.println(respuesta);
			 
			 //compara si el string es una arroba, si es si debe verificar que no haya otra
			 //pero si es no , debe seguir verificando
			 
			 
			 
		 }
		 
		 
			 
		 }
			 
			// for (int i=0; i<largo ; i++)                                   		 }
		 
		
			 
		 else 
		 System.out.println(malo);
		
		
		 /*
		 else
			
		{		
		//	while i<largo
			for (int i=0; i<largo; i++)
			String letrita= email.substring(i,i);
					
			//String letra= email.charAt(0);
			//arroba.equalsIgnoreCase(letra);
						
		}
			
			
		
		//if (email.length()<4):
		
		
		
*/		
	}

}
