public class Main {

	public static void main(String[] args) {
		//Estamos creando aquí un objeto desde la clase animales
		Animales tigre = new Animales();
        
		// interactuamos ahora con el objeto y le doy de comer
		tigre.comer();
        System.out.println(tigre.hambre);
        System.out.println(tigre.vida);
        System.out.println(tigre.sed);
        System.out.println(tigre.felicidad);
        System.out.println(tigre.edad);
	    
        // creamos otro objeto 
	     AnimalesSabana leon = new AnimalesSabana();
	     leon.jugar();
	     System.out.println(leon.hambre);
	}
	

}

