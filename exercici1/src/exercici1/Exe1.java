package exercici1;

import java.io.BufferedOutputStream;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Exe1 {
	static final String arxiu = "Contingut";
	public static void main (String[] args) {
		
	
	DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream (/arxiu.txt)));
	
	DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream (/arxiu.txt)));
	
	String[] nom;
	nom = new String[3];
	nom[0] = "John";
	nom[1] = "Jim";
	nom[2] = "George";
	
	double[] num;
	num = new double[3];
	num[0] = 85.5;
	num[1] = 185.5;
	num[2] = 105.5;
	
	for (int i = 0; i < nom.length; i++) {
		out.writeUTF(nom[i]);
		out.writeDouble(num[i]);
	}
	} }
	
	
	
	
	

		/**static final String [] nombres = { 'John', 'Jim', 'George' };
		static final double [] numeros = { 85.5, 185.5, 105.5};

	for (int i = 0; i < nombres.length; i++) {
		out.writeUTF(nombres[i]);
		out.writeDouble(numeros[i]);
	}**/

	
