package adivinar_numero;

//Generar numeros aleatorios con java.util.Random
import java.util.Random;


//Para leer la entrada de usuario y procesar intentos con Scanner
import java.util.Scanner;


public class AdivinarNum {
	
	//Creamos variable para el numero que el usuario debe adivinar
	private int numSecreto;
	
	//Variable para el numero de intentos disponibles
	private int intentosDisponibles;
	
	//Variable que indica si gano el juego
	private boolean ganoJuego;
	
	//Variable para leer la entrada de usuario
	private Scanner scanner;
	
	//Constructor
	public AdivinarNum(int min, int max, int intentos) {
		
		//genera un número aleatorio entre el minimo y el maximo y cantidad de intentos
		Random random = new Random();
		
		this.numSecreto = random.nextInt(max - min + 1) + min;
		this.intentosDisponibles = intentos;
		this.ganoJuego = false;
		this.scanner = new Scanner(System.in);
	}
	
	//Método jugar inicia el juego
	public void jugar() {
		
		System.out.println("Bienvenido al juego de adivinar un número");
		System.out.println("Ingrese un número del 1 al 10");
		
		//Compara el número ingresado con el numero secreto
		while(intentosDisponibles > 0 && !ganoJuego) {
			
			System.out.println("\nIntentos restantes: " + intentosDisponibles);
			System.out.println("Ingrese su número: ");
			int intento = scanner.nextInt();
			
			//esta condicion da pistas si el número es demasiado alto o demasiado bajo
			if(intento < numSecreto) {
				
				System.out.println("El número es demasiado bajo. Intente nuevamente");
			
			} else if(intento > numSecreto) {
				
				System.out.println("El número es demasiado alto. Intente nuevamente");
				
			} else {
				ganoJuego = true;
			}
			//Cada vez q el usuario no acierta el número se va descontando un intento
			intentosDisponibles --;
		}
		
		//Finaliza el juego ya sea q el usuario adivinó el número o se quedó sin intentos disponibles
		if(ganoJuego) {
			System.out.println("\nFelicidades ha adivinado el número " + numSecreto);
		} else {
			System.out.println("Te has quedado sin intentos. El número era: " + numSecreto);
		}
		
		scanner.close();
	}
	
	
	

}
