package act14_javadoc;

public class MainPruebasSoldado {

	public static void main(String[] args) {
		//aca vamos a realizar las pruebas de los métodos Soldado....
		
		
				System.out.println("-------METODO puedeDisparar-------");
				//batería de pruebas puedeDisaparar:
				//PRUEBA1: numeroBalas = 10
				//resultado esperado: true
				//

				Soldado s1 = new Soldado();
				int numeroBalas = 10;
				s1.setNumeroBalas(numeroBalas);
				
				boolean resultadoEsperado = true;
				boolean resultadoObtenido = s1.puedeDisparar();
				if(resultadoEsperado == resultadoObtenido) {
					System.out.println("LA PRUEBA 1 FUE CORRECTA");
				}else {
					System.out.println("LA PRUEBA 1 FUE INCORRECTA");
				}
				
				
				//PRUEBA2: numeroBalas = 0
				//resultado esperado: false
				//

				Soldado s2 = new Soldado();
				numeroBalas = 0;
				s2.setNumeroBalas(numeroBalas);
				
				resultadoEsperado = false;
				resultadoObtenido = s2.puedeDisparar();
				if(resultadoEsperado == resultadoObtenido) {
					System.out.println("LA PRUEBA 2 FUE CORRECTA");
				}else {
					System.out.println("LA PRUEBA 2 FUE INCORRECTA");
				}


				//PRUEBA3: numeroBalas = -10
				//resultado esperado: false
				//

				Soldado s3 = new Soldado();
				numeroBalas = -10;
				s3.setNumeroBalas(numeroBalas);
				
				resultadoEsperado = false;
				resultadoObtenido = s3.puedeDisparar();
				if(resultadoEsperado == resultadoObtenido) {
					System.out.println("LA PRUEBA 3 FUE CORRECTA");
				}else {
					System.out.println("LA PRUEBA 3 FUE INCORRECTA");
				}
		
				System.out.println("-------METODO DISPARAR-------");
				
				//Método disparar
				//Prueba 1:
				//Soldado parámetro: estaMuerto = false;
				//Soldado objeto: numeroBalas = 10;
				//resultadoEsperado sol.estaMuerto = true;
				
				Soldado s4 = new Soldado();
				Soldado sol = new Soldado();
				
				sol.setEstaMuerto(false);
				s4.setNumeroBalas(10);
				s4.disparar(sol);
				resultadoEsperado = true;
				resultadoObtenido = sol.isEstaMuerto();
				if(resultadoEsperado == resultadoObtenido && s4.getNumeroBalas() == 9) {
					System.out.println("LA PRUEBA 1 FUE CORRECTA");
				}else {
					System.out.println("LA PRUEBA 1 FUE INCORRECTA");
				}
				
				//Prueba 2:
				//Soldado parámetro: estaMuerto = true;
				//Soldado objeto: numeroBalas = 10;
				//resultadoEsperado sol.estaMuerto = true;
				
				Soldado s5 = new Soldado();
				Soldado sol2 = new Soldado();
				
				sol2.setEstaMuerto(false);
				s5.setNumeroBalas(10);
				s5.disparar(sol2);
				resultadoEsperado = true;
				resultadoObtenido = sol2.isEstaMuerto();
				if(resultadoEsperado == resultadoObtenido && s5.getNumeroBalas() == 9) {
					System.out.println("LA PRUEBA 2 FUE CORRECTA");
				}else {
					System.out.println("LA PRUEBA 2 FUE INCORRECTA");
				}
		
				//Prueba 2:
				//Soldado parámetro: estaMuerto = false;
				//Soldado objeto: numeroBalas = -10;
				//resultadoEsperado sol.estaMuerto = true;
				
				Soldado s6 = new Soldado();
				Soldado sol3 = new Soldado();
				
				sol3.setEstaMuerto(false);
				s6.setNumeroBalas(-10);
				s6.disparar(sol3);
				resultadoEsperado = true;
				resultadoObtenido = sol3.isEstaMuerto();
				if(resultadoEsperado == resultadoObtenido && s6.getNumeroBalas() == -11) {
					System.out.println("LA PRUEBA 3 FUE CORRECTA");
				}else {
					System.out.println("LA PRUEBA 3 FUE INCORRECTA");
				}
				
		
	}

}
