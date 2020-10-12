package es.studium.Ejemplos;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ficherosAleatorios {

	public static void main(String[] args) {
		try {
			creaFichBin("Aleatorio.dat");

			imprimeEltoN("Aleatorio.dat", 20);

		} catch (IOException e) {
			e.getMessage();
		}

	}

	static void creaFichBin(String ruta) throws IOException {
		RandomAccessFile f = new RandomAccessFile(ruta, "rw");
		for (int i = 1; i <= 100; i++) {
			f.write(i);
		}
		f.close();
	}

	static void imprimeEltoN(String ruta, long cual) throws IOException {
		RandomAccessFile f = new RandomAccessFile(ruta, "r");

		System.out.println("El fichero " + ruta + " ocupa " + f.length() + " bytes.");

		/* Me posiciona cual - 1 porque empieza en 0 */
		f.seek(cual - 1);
		System.out.println("En la posición " + f.getFilePointer() + " está el número " + f.readByte());

		/* Salto 9, 10 elementos más allá */
		f.skipBytes(9);
		System.out.print("10 elementos más allá, está el " + f.readByte());

		f.close();
	}

}