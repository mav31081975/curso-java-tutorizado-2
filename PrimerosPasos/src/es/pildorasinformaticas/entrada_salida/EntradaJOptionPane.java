

package es.pildorasinformaticas.entrada_salida;

import javax.swing.JOptionPane;

public class EntradaJOptionPane {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		System.out.println("***************VIDEO 20 y 21//////////////////////////");
		
		String nombre=JOptionPane.showInputDialog("�cu�l es tu nombre?"); 
		/*JoptionPane.show.... crea un formularito simple, ya lo vi en otro video*/
		
		int edad=Integer.parseInt(JOptionPane.showInputDialog("�y tu edad? "));
		/* ese parse int convierte un string a entero (si se puedeo, claro)*/
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Tu nombre es "+nombre+ " y ten�s " + edad +" a�os.");
		 
		
		

	}

}
