import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RAFArray<Partit> lliga = new RAFArray<Partit>(10,10,"lliga");
 * Partit partit = new Partit(87,59,"cabr�n","110498");
 * lliga.set(1,2,partit); 	// lliga[1][2]=partit 
 * 
 * ...
 * 
 * Partit aquell_partit = lliga.get(1,2);
 */

public class RAFArray {
	
	public RAFArray(int filas, int columnas, String nom_fitxer) throws FileNotFoundException {
		super();
		this.filas = filas;
		this.columnas = columnas;
		fra = new RandomAccessFile (nom_fitxer, "rw");
	}
	
	int columnas;
	int filas;	
	RandomAccessFile fra;
	
	public void set(int fila, int columna, RAFElement element) throws IOException {
		boolean columna_malament = columna > 9;
		boolean fila_malament = fila>9;
		
		if (columna_malament || fila_malament)
			throw new IndexOutOfBoundsException();
		int posicio = (fila * columnas + columna);
		fra.seek(posicio*element.size());
		fra.write(element.toString().getBytes("UTF-32"));	
	}
	
	public void get (int fila, int columna, RAFElement element) throws IOException {
		boolean columna_malament = columna > 9;
		boolean fila_malament = fila>9;
		
		if (columna_malament || fila_malament)
			throw new IndexOutOfBoundsException();
		int posicio = (fila * columnas + columna);
		
		
		byte[] buffer = new byte[element.size()]; 		
		fra.seek(posicio*element.size());
		fra.read(buffer);
		
		element.fromString(new String(buffer,"UTF-32"));		
	}

}
