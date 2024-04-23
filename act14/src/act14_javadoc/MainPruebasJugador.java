package act14_javadoc;

public class MainPruebasJugador {

	public static void main(String[] args) {
		//aca vamos a realizar las pruebas de los métodos de Jugador....
		
		
		System.out.println("-----METODO ponerDorsal--------");
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
		
		
		System.out.println("----- METODO estaExpulsado --------");
		
		//PRUEBA 1:
		//numeroTarjetasAmarillas = 1;
		//nuemroTarjetasRojas = 0;
		//resultadoEsperado = false;
		Jugador j4 = new Jugador();
		j4.setNumeroTarjetasAmarillas(1);
		j4.setNumeroTarjetasRojas(0);
		boolean resultadoEsperado2 = false;
		boolean resultadoObtenido2 = j4.estaExpulsado();
		if(resultadoEsperado2 == resultadoObtenido2) {
			System.out.println("LA PRUEBA 1 FUE CORRECTA");
		}else {
			System.out.println("LA PRUEBA 1 FUE INCORRECTA");
		}
		
		//PRUEBA 2:
		//numeroTarjetasAmarillas = 2;
		//nuemroTarjetasRojas = 0;
		//resultadoEsperado = true;
		Jugador j5 = new Jugador();
		j5.setNumeroTarjetasAmarillas(2);
		j5.setNumeroTarjetasRojas(0);
		resultadoEsperado2 = true;
		resultadoObtenido2 = j5.estaExpulsado();
		if(resultadoEsperado2 == resultadoObtenido2) {
			System.out.println("LA PRUEBA 2 FUE CORRECTA");
		}else {
			System.out.println("LA PRUEBA 2 FUE INCORRECTA");
		}
		
		//PRUEBA 3:
		//numeroTarjetasAmarillas = 0;
		//nuemroTarjetasRojas = 1;
		//resultadoEsperado = true;
		Jugador j6 = new Jugador();
		j6.setNumeroTarjetasAmarillas(0);
		j6.setNumeroTarjetasRojas(1);
		resultadoEsperado2 = true;
		resultadoObtenido2 = j6.estaExpulsado();
		if(resultadoEsperado2 == resultadoObtenido2) {
			System.out.println("LA PRUEBA 3 FUE CORRECTA");
		}else {
			System.out.println("LA PRUEBA 3 FUE INCORRECTA");
		}
		
		//PRUEBA 4:
		//numeroTarjetasAmarillas = 3;
		//nuemroTarjetasRojas = 2;
		//resultadoEsperado = true;
		Jugador j7 = new Jugador();
		j7.setNumeroTarjetasAmarillas(0);
		j7.setNumeroTarjetasRojas(1);
		resultadoEsperado2 = true;
		resultadoObtenido2 = j7.estaExpulsado();
		if (resultadoEsperado2 == resultadoObtenido2) {
			System.out.println("LA PRUEBA 4 FUE CORRECTA");
		} else {
			System.out.println("LA PRUEBA 4 FUE INCORRECTA");
		}	
		
		
		
		
	}

}
