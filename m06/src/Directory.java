import java.io.File;
import java.io.IOException;

public class Directory {

	public static void main(String[] args) throws IOException {
		
		File c = new File("directory");
		c.mkdir();
		File j = new File("directory2");
		j.mkdir();
		
		File d = new File("directory/arxiu");
		d.createNewFile();
		File e = new File ("directory/arxiu2");
		e.createNewFile();
		
		
		for (File datos: c.listFiles()) {
			System.out.println(datos);
		}
	}

}
