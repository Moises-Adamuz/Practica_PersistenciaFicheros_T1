package es.studium.ClaseFile;

import java.io.File;
import java.io.IOException;

public class Ejercicio3 {

	public static void main(String[] args) throws IOException {
			dir("D:\\Eclipse\\AD\\Tema 1\\bin\\es\\studium\\Ejemplos");

	}
	
	public static void dir(String pathname) 
	{
		File filePathname = new File(pathname);
		File[] files = filePathname.listFiles();
	}

}
