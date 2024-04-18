package act14_javadoc;

	public class Jugador {
		private int dorsal;
		private int numeroTarjetasAmarillas;
		private int numeroTarjetasRojas;

		
		
	//Crear los métodos “get” y “set” de los atributos cuando se vayan a 
	//hacer las pruebas y la documentación. Aquí no se han creado porque no aportan nada

		
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

		
		/**
		 * El dorsal pasado por parametro es mayor o igual que 1 y si
		 * es menor o igual que 30, sera igual a dorsal
		 * 
		 * en caso contrario es menos 1 
		 * 
		 * @param dorsal se pasa por parametro
		 */
		public void ponerDorsal(int dorsal) {
			
			if(dorsal >= 1 && dorsal <= 30) {
				this.dorsal = dorsal;
			}else {
				this.dorsal = -1;
			}
		}
		
		/**
		 * Metodo si un jugador esta expulsado
		 * 
		 * @return si el jugador tiene dos amarillas retorna false, si el numero
		 * de rojas es 1 sera true y retorna expulsado
		 * 
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
}