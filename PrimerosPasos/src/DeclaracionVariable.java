
public class DeclaracionVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte edad;
		
		edad=27; //esto no saca la advertencia de que no se us� porque declarqar no es usar
		byte edad2=28; //esto es iniciar y declarar en la misma l�nea
		
		edad=45; //ac� hica una variaci�n, cambi� el valor de la variable
		
		System.out.println(edad);//ahora SI quit� la advertencia que no era  usada la variable
		//el resultado es el �ltimo valor si esta l�nea de c�digo est� al final
		
		System.out.println(edad2);
		
		edad2=87;
		System.out.println(edad2);
		
		int edadMaria, edadPedro, edadLuis, edadSandra;
	
		/*
		 iojrgiojroijreooi
		 uihuihiuhuihiuhuih
		 
		    */   
		 //ESO ES UN BLOQUE DE CODIGO, comentario de varias lineas
		
		/*
		System.out.println(edadMaria);
		
		eso da error porque HASTA esta linea edadMaria no se inici�
		y el FLUJO va de arriba hacia abajo
		*/
		edadMaria=34;
		System.out.println(edadMaria); //ahora SI lo imprme
		
		
		
		 
		
		
		
		
		
		
		
		
				
	}

}


