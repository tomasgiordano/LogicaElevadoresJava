package Program;

public class ElevadoresInteligentes {

	public static void main(String[] args) {
		
		// Array de pisos del 0 al 20
		
		final int[] pisos = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		
		// Inicializacion de los elevadores todos en el piso 0 (Planta Baja)
		
		int[] elevadores = {0,0,0};
		
		System.out.println("Llamado de elevador en el ultimo piso (20)");
		System.out.println("Posicion en el array del elevador que respondera: " + llamarElevador(elevadores,pisos,20));
		
		System.out.println("Llamado de elevador en el piso 7");
		System.out.println("Posicion en el array del elevador que respondera: " + llamarElevador(elevadores,pisos,7));
		
		System.out.println("Llamado de elevador en el piso 1"); //(no pongo planta baja ya que todos los inicialice en ese piso)
		System.out.println("Posicion en el array del elevador que respondera: " + llamarElevador(elevadores,pisos,1));
		
		System.out.println("\n\n Posicion en la que quedaron los elevadores: \nElevador 1: "+elevadores[0]+"\nElevador 2: "+elevadores[1]+"\nElevador 3: "+elevadores[2]);
	}
	
	public static int llamarElevador(int[] elevadores,int[] pisos,int pisoDestino) {
		
		//Esta variable retornara la posicion en el array del elevador que sera llamado como resultado
		int elevadorResultado = -1;
		
		int distanciaElevadorAPisoFinal = Integer.MAX_VALUE;

		//Recorro los elevadores para ver en que piso estan cada uno y de ahi sacar cual me conviene llamar
			
		for(int i = 0;i <= elevadores.length-1;i++) {
			int distanciaElevadorAPisoActual = Math.abs(elevadores[i]-pisoDestino);
			
			if(distanciaElevadorAPisoActual < distanciaElevadorAPisoFinal) {
				distanciaElevadorAPisoFinal = distanciaElevadorAPisoActual;

				elevadorResultado = i;
			}
		}
	
		elevadores[elevadorResultado] = pisoDestino;
		
		return elevadorResultado;
	}

}
