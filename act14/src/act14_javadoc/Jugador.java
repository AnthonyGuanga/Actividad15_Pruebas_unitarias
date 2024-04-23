package act14_javadoc;

	public class Jugador {
		private int dorsal;
		private int numeroTarjetasAmarillas;
		private int numeroTarjetasRojas;

	//Crear los métodos “get” y “set” de los atributos cuando se vayan a 
	//hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

		/**
		 * Método que sirve para poner el dorsal.
		 * Comprueba si el dorsal pasado por parámetro, se encuentra entre el rango 1-30 inclusives, si se encuentra
		 * en el rango el atributo dorsal del objeto Jugador se igualará al número del dorsal pasado por parámtro.
		 * En caso contrario, el altributo se igualará en -1.
		 * @param dorsal que se pasa por parametro
		 */
		public void ponerDorsal(int dorsal) {
			if(dorsal >= 1 && dorsal <= 30) {
				this.dorsal = dorsal;
			}else {
				this.dorsal = -1;
			}
		}		
		
		
		/**
		 * Método si un jugador está expulsado. Crea la variable expulsado y la valoraliza en false.
		 * Comprueba/evalúa el atributo numeroTarjetasAmarillas y en caso de que sea igual a 2, expulsado se valora en true.
		 * También evalúa el atributo numeroTarjetasRojas y en caso de que sea igual a 1, expulsado se valora en true.
		 * @return devuelve la variable expulsado.
		 */
	public boolean estaExpulsado() {
		
	boolean expulsado = false; 
	
		if(numeroTarjetasAmarillas == 2) {
			expulsado = true;
	
		}                          
		if(numeroTarjetasRojas == 1) {
			expulsado = true;
		}                          
	return expulsado;
	}       
	
	
	
	//prueba
	
	//-----------GETTERS Y SETTERS----------
	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getNumeroTarjetasAmarillas() {
		return numeroTarjetasAmarillas;
	}

	public void setNumeroTarjetasAmarillas(int numeroTarjetasAmarillas) {
		this.numeroTarjetasAmarillas = numeroTarjetasAmarillas;
	}

	public int getNumeroTarjetasRojas() {
		return numeroTarjetasRojas;
	}

	public void setNumeroTarjetasRojas(int numeroTarjetasRojas) {
		this.numeroTarjetasRojas = numeroTarjetasRojas;
	}
	//-----------GETTERS Y SETTERS----------
	
	
}