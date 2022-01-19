package br.com.alura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class TestaCopia {
			
	
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada do arquivo 
		InputStream fis = new FileInputStream("financeiro.txt"); 
		Reader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
	    BufferedReader br = new BufferedReader(isr);
	    
	    OutputStream fos = new FileOutputStream("finn4.txt"); 
		Writer osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
	    BufferedWriter bw = new BufferedWriter(osw);
			
		//System.out.println(br.readLine());
		    
	    String linha = br.readLine();
		    
	    while(linha != null) {	
	    	bw.write(linha);
	    	bw.newLine();
		    linha = br.readLine();
		}
	    bw.close();
	    br.close();	    
    }
	
}