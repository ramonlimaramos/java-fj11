package br.com.io.exrcicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TesteJavaIO {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		InputStreamReader ir = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println("Digite sua mensagem: ");
		String linha = br.readLine();
		
		while(linha != null){
			switch(linha) {
				case "que que o tim ker":
					System.out.println("ker passar battom");
					break;
				
				case "que cor":
					System.out.println("cor de violeta");
					break;
				
				case "na onde":
					System.out.println("na boca e na bochecha");
					break;
				
				default: System.out.println("command not found");
					break;
			}
			linha = br.readLine();
		}
	}
}
