import java.io.File;
import java.io.IOException;

public class RandomAccessFile {
	
	public static void main(String[] args) {
		
		File test = new File("testeando");
		
		try {
			RandomAccessFile raf = new RandomAccessFile("./", "rw");
			
		}catch(IOException ex){
			ex.printStackTrace();
			
		}
	}

}
