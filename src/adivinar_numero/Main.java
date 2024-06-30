package adivinar_numero;

public class Main {

	public static void main(String[] args) {
		
		//Creamos una instancia de juego con el mínimo = 1 y un máximo = 10 y 5 intentos disponibles 
		AdivinarNum juego = new AdivinarNum(1,10,5);
		
		//Llama al método jugar() para iniciar el juego
		juego.jugar();
		
	}

}
