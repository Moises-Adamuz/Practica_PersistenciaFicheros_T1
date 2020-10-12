package es.studium.ClaseFile;

import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {

	public static void main(String[] args) throws IOException {
		dir("D:\\Eclipse\\AD\\Tema 1\\bin\\es\\studium\\Ejemplos");

	}
	public static void dir(String pathname) 
	{
		File filePathname = new File(pathname);
		File[] files = filePathname.listFiles();
		List<File> listTotal = Arrays.asList(files);
		List<File> listFiles = new ArrayList<File>();
		List<File> listDirectories = new ArrayList<File>();
		for(File element : listTotal)
		{
			if(element.isDirectory())
			{
				listDirectories.add(element);
				}
			else
			{
				listFiles.add(element);
			}
		}
		System.out.println(" Contenido de la carpeta " + filePathname.getAbsolutePath() + "\n");
		for(File element : listDirectories)
		{
			String name = element.getName();
		    System.out.println("<DIR>\t");
		    System.out.println(name);
		}
		for(File element : listFiles)
		{
			String name = element.getName();
		    System.out.println("\t");
		    System.out.println(name);
		}

		
	}

}
