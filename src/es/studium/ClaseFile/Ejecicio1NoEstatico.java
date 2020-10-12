package es.studium.ClaseFile;

import java.io.File;

public class Ejecicio1NoEstatico {

	public static void main(String[] args) {
		String ruta = "D:\\Eclipse\\AD\\Tema 1\\bin\\es\\studium\\Ejemplos";
		Ejecicio1NoEstatico instancia = new Ejecicio1NoEstatico();
		instancia.Ejercicio1NoEstatico(ruta);

	}

	public void Ejercicio1NoEstatico(String pathname) {
		File filePathname = new File(pathname);

		File[] files = filePathname.listFiles();
		System.out.println(" Contenido de la carpeta " + filePathname.getAbsolutePath() + "\n");

		for (File element : files) {

			String name = element.getName();
			System.out.println(name);
		}
	}

}
