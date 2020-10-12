package es.studium.Ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejemplo2 {

	public static void main(String[] args) {
		try
		{
			//Creamos la clase File la cual nos llevará al lugar donde se encuentra el arachivo
			File f = new File("D:\\\\Eclipse\\\\AD\\\\Tema 1\\\\bin\\\\es\\\\studium\\\\Ejemplos\\\\prueba.txt");
			//Con FileReader, introducir o devolve la información del archivo para poder leerla
			FileReader fr = new FileReader(f);
			//Leemos la línea completa BufferedReader
			BufferedReader br = new BufferedReader(fr);
			//Inicializamos el contador
			int contador = 0;
			//Leemos el contenido del archivo con readLine()
			while (br.readLine()!= null)
			{
				contador++;
			}
			System.out.println("Total de líneas:"+contador);
		}
		catch(IOException ex)
		{
			System.out.println("Se ha producio un error");
		}
	}

}
