package ejercicios;

public class Codigo6 {
	public static void main(String[] args) {
		int[] n = new int[20]; //se agrega la palabra reservada new para inicializar el array

	    for (int i = 0; i < 20; i++) { //se añade un + al i+ para incrementar
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.println(n[i] + " "); //se corrige el system.print --> sysout
	    }
	    
	    System.out.println("\n¿Qué números quiere resaltar? "); //se añade n a printl
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): "); // se añade ln a print
	    int opcion = Integer.parseInt(System.console().readLine()); // se añade un parentesis al final

	    int multiplo = (opcion == 1) ? 5 : 7; // sintaxisis incorrecta, se invierte : --> ? y ? --> :

	    for (int e : n) { // cambio char --> int y el foreache se cambio por for
	      if (e % multiplo == 0) {
	        System.out.println("[" + e + "] ");
	      }else{ // se añade } antes del else
	        System.out.println(e + " "); // se cambia in por out
	      }
	    }
	    }
}

	

