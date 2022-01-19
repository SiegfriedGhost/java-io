package br.com.alura;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;


public class TesteLeitura {

	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada do arquivo 
		FileInputStream fis = new FileInputStream("finn.txt"); 
		InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
	    BufferedReader br = new BufferedReader(isr);
		
		//System.out.println(br.readLine());
	    
	    String linha = br.readLine();
	    
	    while(linha != null) {	
	    	System.out.println(linha);
	    	linha = br.readLine();
	    }
	    
	    
	    br.close();
	   
		
	}

}
