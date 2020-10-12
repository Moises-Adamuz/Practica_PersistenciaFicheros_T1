package es.studium.Ejemplos;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//Programa que lee enteros por teclado y los escribe en el fichero datos.dat. La lectura de datos
//acaba cuando se introduce -1
public class Ejemplo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		DataOutputStream salida = null;
		int n;
		
		try
		{
			fos = new FileOutputStream("datos.data");
			salida = new DataOutputStream(fos);
			
			System.out.println("Introduce número: ");
			n = sc.nextInt();
			while(n!=-1)
			{
				//Se escribe el número entero
				salida.writeInt(n);
				System.out.println("Introduce número: ");
				n = sc.nextInt();
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if (fos != null)
					fos.close();
				if (salida != null)
					salida.close();
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
