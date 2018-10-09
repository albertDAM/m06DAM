
import java.awt.List;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Calendar;
import java.util.GregorianCalendar;
//import java.util.List;
public class Menu {

	public static void main(String[] args) {

		/*Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion;
	        
	       while(!salir){
	            
	           System.out.println("1. Create");
	           System.out.println("2. Display its length");
	           System.out.println("3. Display its last modified date");
	           System.out.println("4. Quit");
	            
	           System.out.println("Escribe una de las opciones");
	           opcion = sn.nextInt();*/	
	           
	        	
	        	   /*FileSystem sistemaFicheros=FileSystems.getDefault();
	        	   Path rutaFichero=sistemaFicheros.getPath("/home/users/inf/wiam2/iam46977232/Documents/ex1");
	        	   System.out.println(rutaFichero.getFileName());
	        	   System.out.println(rutaFichero.getParent().getFileName());*/
	        	   
	        	   
	        	   /*try {
	        		   
	        		   List<String> texto=Files.readAllLines(rutaFichero);
	        		    
	        		   for(String cadena:texto) {
	        		    
	        		   System.out.println(cadena);
	        		   }
	        		    
	        		   } catch (IOException e) {
	        		   // TODO Auto-generated catch block
	        		   e.printStackTrace();
	        		   }*/

	
		File file = new File( "//Ex1" );

		long lastModified = file.lastModified();

		String pattern = "yyyy-MM-dd hh:mm aa";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		
		Date lastModifiedDate = new Date( lastModified );

		System.out.println( "The file " + file + " was last modified on " + simpleDateFormat.format( lastModifiedDate ) );
	}
	
	    
		
		
		
	     
	        	       }


