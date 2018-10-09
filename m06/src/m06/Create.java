package m06;

import java.io.File;

public class Create {	
	public Create() {
		
	}
	public void createNewFile() {
		File c = new File("arxiu.txt");
		System.out.println(c.getAbsolutePath());

		System.out.println(c.length());
	}
	

}
