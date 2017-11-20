package streams;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;



public class Streams {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("entrada.txt");
		BufferedReader br = new BufferedReader(fr);
		
		//Opci�n 1 - PrintWriter
		PrintWriter pw = new PrintWriter(new FileWriter("salida.txt"));
		
		//Opci�n 2 - BufferedWriter
			//BufferedWriter bw = new BufferedWriter(new FileWriter("salida.txt"));
		
		String str;
		
		
		while((str=br.readLine())!=null) {
			System.out.println("He leido : " +str);
			//Opci�n 1 - Con BufferedWriter
				//bw.write(str + "\n");
			//Opci�n 2 - PrintWriter
			//Se puede utilizar pw.write() y println()
			pw.write(str + "\n");
			pw.println(str);
		}
		//Opci�n 1 - Con BufferedWriter
			//bw.close();
		
		//Opci�n 2 - PrintWriter
		pw.close();
		/*int c;
		
		FileWriter fw = new FileWriter("salida.txt");
		
		System.out.println("He leido ");
			while((c=fr.read())!=-1) {
				System.out.println((char)c);
				fw.write(c);
		}*/
			//fw.close();
			fr.close();
	}

}
