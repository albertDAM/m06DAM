package m06;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;

public class Metadata {

	public static void main(String[] args) throws IOException {
		Create create = new Create();
		create.createNewFile();
		
		File c = new File("arxiu");
		c.createNewFile();
		
		System.out.println(c.getAbsolutePath());

		System.out.println(c.length());
		
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println(sdf.format(c.lastModified()));
		
		
	

	}

}
