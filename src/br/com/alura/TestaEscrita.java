package br.com.alura;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class TestaEscrita {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//Fluxo de entrada do arquivo 
		OutputStream fos = new FileOutputStream("finn2.txt"); 
		Writer osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
		BufferedWriter bw = new BufferedWriter(osw);
				
		bw.write("Leandro de Oliveira Torres Santos");
		bw.newLine();
							    
			    
		bw.close();
		}

}
