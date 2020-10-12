package es.studium.ClaseFile;

//https://es.stackoverflow.com/questions/299657/contar-cuantos-archivos-tiene-una-directorio-con-java
import java.io.File;

public class Ejercicio1 {
//Desde el main llamamos a la función para que funcione
	public static void main(String[] args) {
		//Como la función es static, la podemos llamar por su nombre. 
		//esto se puede haacer porque está dentro de la misma clase
		ejercicio1("D:\\Eclipse\\AD\\Tema 1\\bin\\es\\studium\\Ejemplos");

	}

	//Montamos una funcion. Cuando lleva paréntesis, es una función
	//Aquí da igual que aun no conozcamos la ruta de nuestro archivo
	//La implementación del método se realiza fuera del main
	//Lo declaramos como estático para no tener que realizar ningún tipo de instancia
	//void significa que no tiene un return, que no devuelve nada
	public static void ejercicio1(String pathname) {
		File filePathname = new File(pathname);
		/*Con el array File voy guardando el contenido de la carpeta*/
		File[] files = filePathname.listFiles();
		System.out.println(" Contenido de la carpeta " + filePathname.getAbsolutePath() + "\n");
		/*Bucle for mejorado
		 * Este tipo de bucle se utiliza para arrays. Con files llamamos al nombre del array anterior
		 * y luego creamos una nueva variable del mismo tipo que el array anterior, creamos la
		 * variable File llamada element que llama a Files*/
		for (File element : files) {
			/*Obtenemos su nombre y lo mostramos*/
			String name = element.getName();
			System.out.println(name);
		}
	}

}
