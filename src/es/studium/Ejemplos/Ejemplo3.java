package es.studium.Ejemplos;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejemplo3 {
	public static String FILE_NAME = "D:\\Eclipse\\AD\\Tema 1\\bin\\es\\studium\\Ejemplos\\prueba2.txt";

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Introduzca texto: ");
			String text = sc.nextLine();
			FileWriter output = new FileWriter(FILE_NAME);
			output.write(text);
			output.close();
			sc.close();

		} catch (IOException ex) {
			System.out.println("Se ha producido un error");
		}

	}

}
