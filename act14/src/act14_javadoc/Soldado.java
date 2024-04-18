package act14_javadoc;
public class Soldado {

     private boolean estaMuerto;

     private int numeroBalas;

     //Crear los métodos “get” y “set” de los atributos cuando se vayan a hacer las pruebas y
     //la documentación. Aquí no se han creado porque no aportan nada
     
     
     /**
      * Método que sirve para saber si el soldado puede disparar, en el mismo se evalúa el atributo numeroBalas  y en caso de que 
      * sea positivo devolverá true, caso contrario devolverá false.
      * @return devuelve true si numeroBalas es positivo, sino false.
      */
     public boolean puedeDisparar() {
    	 if(this.numeroBalas > 0) {
    		 
       return true;
       
    	 }                          
     return false;
     
     }
     
     /**
      * Metodó que sirve para que un Soldado dispare a otro Soldado pasado por parámetro.
      * Decrementa en 1 el número de balas del propio Soldado y valoraliza el valor del atributo estaMuerto 
      * del Soldado pasado por parámtero en TRUE.
      * @param sol
      */
     
     public void disparar(Soldado sol) {
    	 this.numeroBalas--;
    	 
    	 sol.estaMuerto = true;
     }

     
    //}--------------GETTERS AND SETTERS---------------{
	public boolean isEstaMuerto() {
		return estaMuerto;
	}

	public void setEstaMuerto(boolean estaMuerto) {
		this.estaMuerto = estaMuerto;
	}

	public int getNumeroBalas() {
		return numeroBalas;
	}

	public void setNumeroBalas(int numeroBalas) {
		this.numeroBalas = numeroBalas;
	}
    //}--------------GETTERS AND SETTERS---------------{
     

}