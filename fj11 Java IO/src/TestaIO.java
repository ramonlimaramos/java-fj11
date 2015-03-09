

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TestaIO {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in; //new FileInputStream("leitura.txt");
		InputStreamReader inputStreamReader = new InputStreamReader(in);
		BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
		
		OutputStream os = new FileOutputStream("saida.txt");
		OutputStreamWriter outputStramWriter = new OutputStreamWriter(os);
		BufferedWriter bufferedWriter = new BufferedWriter(outputStramWriter);
		
		String linha = bufferedReader.readLine();
		
		while(linha != null) {
			bufferedWriter.append(linha);
			bufferedWriter.newLine();
			linha = bufferedReader.readLine();
		}
		
		bufferedReader.close();
		bufferedWriter.close();
		
	}
}
