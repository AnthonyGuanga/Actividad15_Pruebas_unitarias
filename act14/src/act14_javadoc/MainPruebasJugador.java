package act14_javadoc;

public class MainPruebasJugador {

	public static void main(String[] args) {
		//aca vamos a realizar las pruebas de los métodos de Jugador....
		
		
		
		//batería de pruebas ponerDorsal:
		//PRUEBA1: pasar por parámtero: 10
		//resultado esperado: 10
		//

		Jugador j1 = new Jugador();
		int dorsal1 = 10;
		j1.ponerDorsal(dorsal1);
		
		int resultadoEsperado = 10;
		int resultadoObtenido = j1.getDorsal();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("LA PRUEBA 1 FUE CORRECTA");
		}else {
			System.out.println("LA PRUEBA 1 FUE INCORRECTA");
		}
		
		//PRUEBA2:
		//parametro = 31
		//resultado esperado: -1
		Jugador j2 = new Jugador();
		int dorsal2 = 31;
		j2.ponerDorsal(dorsal2);
		
		resultadoEsperado = -1;
		resultadoObtenido = j2.getDorsal();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("LA PRUEBA 2 FUE CORRECTA");
		}else {
			System.out.println("LA PRUEBA 2 FUE INCORRECTA");
		}
		
		//PRUEBA3:
		//parametro = -1
		//resultado esperado: -1
		Jugador j3 = new Jugador();
		int dorsal3 = -1;
		j3.ponerDorsal(dorsal3);
		
		resultadoEsperado = -1;
		resultadoObtenido = j3.getDorsal();
		if(resultadoEsperado == resultadoObtenido) {
			System.out.println("LA PRUEBA 3 FUE CORRECTA");
		}else {
			System.out.println("LA PRUEBA 3 FUE INCORRECTA");
		}
		
		
		
		
	}

}
