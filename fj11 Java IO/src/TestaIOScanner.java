import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;


public class TestaIOScanner {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(new FileInputStream("leitura.txt"));
		PrintStream ps = new PrintStream(new FileOutputStream("saida.txt"));
		
		while(sc.hasNextLine()) {
			String linha = sc.nextLine();
			ps.println(linha);
		}
		
		sc.close();
		ps.close();
	}
}
