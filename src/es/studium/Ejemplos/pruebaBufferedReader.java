package es.studium.Ejemplos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;


public class pruebaBufferedReader {

	public static void main(String[] args) {
		try {
			File f = new File("D:\\Eclipse\\AD\\Tema 1\\bin\\es\\studium\\Ejemplos");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			int contador = 0;
			while(br.readLine()!=null)
			{
				contador++;
			}
			System.out.println("Total de líneas:"+contador);
		}
		catch(IOException ex) {
			System.out.println("Se ha producido un ERROR");
		}

	}

}



