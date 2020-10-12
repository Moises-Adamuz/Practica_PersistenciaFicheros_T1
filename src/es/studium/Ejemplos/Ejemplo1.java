/*Dado un fichero de texto, contar el número de veces que aparece la letra 'a' en el. Leeremos cada uno de los caracteres hasta llegar al último.
 *  Para cada carácter a considerar, incrementamos el contador*/

package es.studium.Ejemplos;

import java.io.FileReader;
import java.io.IOException;

public class Ejemplo1 {


		private static String FILE_NAME = "D:\\Eclipse\\AD\\Tema 1\\bin\\es\\studium\\Ejemplos\\prueba.txt"; //Creamos la variable que contiene la ruta del fichero
		private static char BUSCAR = 'a'; //Creamos la variable donde se encontrá el caracter 'a', el cual utilizaremos para compararlo con los caracteres obtenidos
		
		public static void main(String[] args) 
		{
			//Creamos el try para hacer funcionar la línea de código
			try
			{
				int contador = 0; //Creamos el contador que irá contando el número de veces que aparece la letra a en el fichero
				//FileReader es el Flujo
				FileReader input = new FileReader(FILE_NAME);//Creamos el objeto que nos mostrará la información del fichero, esta es una entrada
				int c = input.read();//Este método proporcionado por FileReader() lee el contenido del fichero, al ser de tipo bit, la variable es un entero.
				
				/*Creamos el bucle donde realizaremos la búsqueda, hasta que haya recorrido todos los caracteres. Cuando llegue a -1, significa que ya no queda
				 * más caracteres por recorrer*/
				while(c != -1)
				{
				
					/*Vemos si tenemos el caracter que buscamos. Transformamos el bit leido en un carácter y lo comparamos si es igual o no al carácter 'a'
					 * Si es igual el carácter leido al carácter 'a', entonces el contador se incrementará y seguirá leyendo los caracteres siguiente*/
					if((char)c == BUSCAR)
					{
						contador++;
						
					}
					c = input.read();
				}
				input.close();//cerramos el flujo
				System.out.println(contador);//mostramos el resultado
				
			}
			//Creamos a la excepción para el caso en el que se produzca algún error
			catch (IOException ex)
			{
				System.out.println("Se ha producido un error");
			}
		
		
	    }

}
