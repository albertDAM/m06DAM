import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Date;
import java.util.Properties;

public class Main {
	
	
	public static void generar_properties() throws FileNotFoundException, IOException {
		Properties prop = new Properties();
		
		try (OutputStream output = new FileOutputStream("config.properties")) {
			
			prop.setProperty("max_punts", "200");
			prop.setProperty("max_nom_arbitre", "30");
			prop.setProperty("max_dia", "6");
			prop.setProperty("equips", "10");
			
			prop.store(output, "Propietats de la lliga");
			
			
			
		}
	}
	
	public static void main(String[] args) throws IOException {
		
		/*try {
			generar_properties();
		} catch (IOException e) {
			
			System.out.println("no s'ha pogut crear el fitxer");
			return;
		}*/
		
		Partit partit = new Partit(120, 140, "Manolo", new Date());	
		RAFArray raf = new RAFArray(10, 10, "proba");
		raf.set(0, 0, partit);
	}

}
