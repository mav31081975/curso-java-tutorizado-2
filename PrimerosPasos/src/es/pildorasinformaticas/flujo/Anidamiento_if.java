//mi primer java
package es.pildorasinformaticas.flujo;

import javax.swing.JOptionPane;

public class Anidamiento_if 

{

	public static void main(String[] args)
	
	{
		// TODO Auto-generated method stub

		//comprar un coche si soy mayor y tengo carnet
		
		int edad=Integer.parseInt
				(JOptionPane.showInputDialog
						("introduce tu edad"));
		String carnet;
		
		
		if (edad>=18 ) 
		
		{
		
		 carnet=JOptionPane.showInputDialog("tenes carnet?");
		
		if (carnet.equalsIgnoreCase("si")
				||carnet.equalsIgnoreCase("s�"))
						{JOptionPane.showMessageDialog(null, "compr�" );}
		else {JOptionPane.showMessageDialog(null, "vas a chocar, mejor no te vendo" );}
		
			
		}
		else {JOptionPane.showMessageDialog(null, "no hay posibilidad,"
				+ " sos menor de edad" );}
		
			
		
	}

}
