package exercici1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Writeread {

	public static void main(String[] args) {

		String [] noms = {"John", "Jim", "George"};
		double [] alsades = {85.5, 185.5, 105.5};

		for (int i=0; i<noms.length; i++) {
			//*System.out.printf("%s %.2f \n", noms[i], alsades[i]);
		}

		try (FileOutputStream fileOut = new FileOutputStream("pedido.txt")){
			DataOutputStream salido = new DataOutputStream(fileOut);

			for (int i=0; i<noms.length; i++) {
				salido.writeUTF(noms[i]);
				salido.writeDouble(alsades[i]);
			}
		}catch(Exception e) {
			System.out.println(e.toString());
		}

		try (DataInputStream fileIn = new DataInputStream(new FileInputStream("./pedido.txt"))) {
			//*DataInputStream entrada = new DataInputStream(fileIn);


			while (fileIn.available() > 0){
				String fileInstring = fileIn.readUTF();
				double fileIndouble = fileIn.readDouble();
				System.out.println(fileInstring + " " + fileIndouble);
			}


		}	catch(Exception a) {
			System.out.println(a.toString());
		}

	}
}







