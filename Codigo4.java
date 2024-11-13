package ejercicios;

import java.util.Scanner; // se importa scanner

public class Codigo4 {

	public static void main(String[] args) { // se agrega main
		Scanner s = new Scanner(System.in); // se añade System.in dentro de Scanner
	    
	    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); // se cambia de jugador 1 a 2
	    //Scanner s2 = new Scanner(); ----> linea eliminada
	    String j2 = s.nextLine();
	    
	    if (j1 == j2) {//se elimina un parentesis de más
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals ("tijeras")) { // todos los if se cambian por .equals
	            g = 1;
	          }

	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          }// faltaba una llave
	          
	        case "tijeras": // caso tijera --> caso tijeras
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	        default:
	        	System.out.println("Opcion no válida");
	      }
	      System.out.println("Gana el jugador " + g);
	    }
	  
	    s.close(); // se cierra el scanner por buena practica
	}

}
