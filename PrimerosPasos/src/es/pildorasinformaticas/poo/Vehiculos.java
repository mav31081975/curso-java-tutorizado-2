package es.pildorasinformaticas.poo; //video 41 42 

public class  Vehiculos {

	//crear un m�todo especial que da estado incial
	// a los objetis, medoco constructor, LLEVA EL MISMO NOMBRE DE LA CLASE
	// public para que sea accesible desde la otra
	
	public Vehiculos () //modificador de acceso, y construcctor de la clase
	
	{
		//ac� establezco el estado inicial tiene el veh�culo
		
		ruedas=4; // se podr� cambiar, ojo
		
		largo=2;
		
		ancho=1;
		
		peso=2;
		
		color= "sin color";
		
		
		
		colorPuertas="blancas";
		
		
		
				
	}  //tengo que establecer un m�todo setter para cambiar alguna de las propiedades
	
	public void setColorPuertas(String colorDePuertas) {
		colorPuertas=colorDePuertas; //me va a pedir un string si o si al llamar al metodo
	}
	
	public String getColorPuertas() {
		return colorPuertas;
		
	}
	
	
	
	public void setColor() //void porque no devuelve nada. setColor convenci�n de escritura del m�todo setter
	
	{
		color="azul"; //no me dice el color, solaente lo cambia a este color
			
		
	}
	
	public String getColor() {
		return color; //m�todo getter para que devuelva el color
		
	}

	
	/* campos de la clase, o PROPIEDADES pude haberlos creados dentro de la llave
		on caracter�sticas o propiedades , ver que uso modificador privado para encapsular*/
	
	private int ruedas; //no es una variable
	
	private String color;
	
	private int largo;
	
	private int ancho;
	
	private int peso;
	
	
	private String colorPuertas;
	
	
	
	
	
	
	
	
	
	

	
}
