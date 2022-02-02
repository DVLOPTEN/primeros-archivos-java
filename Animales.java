public class Animales {
	// atributos  + metodos = miembros de una clase.
	// estos son los atributos
	int vida;
	int hambre;
	int sed;
	int felicidad;
	int cansancio;
	int edad;
	String color;
	boolean pelo;
	char sexo;
	String origen;
	int hola;
	
	// esto sería un constructor cada vez que creo uno tendrá esos parámetros
	// SE EJECUTA SIEMPRE DESDE EL PRINCIPIO para que no hereden ponemos PRIVATE
	public void Animales() {
	vida = 100;
	hambre =10;
	pelo = true;
	sexo= 'f';
	origen= "Asia";
	}
	// esto son los métodos o funcionalidades QUE SE HAN DE LLAMAR NO ENTRA DIRECTAMENTE
	
	public void comer() {
	hambre=0;
	vida=30;
	sed =80;
	System.out.println("estoy comiendo");
	}
	
	private void caminar() {
	cansancio = 50;
	hambre= 50;
	sed =50;
	System.out.println("estoy caminando");
	}
	
	void correr() {
	cansancio = 100;
	hambre= 60;
	sed =60;
	felicidad=50;
	System.out.println("estoy corriendo");
	}
	public void jugar() {
		felicidad =80;
		System.out.println("estoy jugando");
	}

}