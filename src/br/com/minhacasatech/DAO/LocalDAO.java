package br.com.minhacasatech.DAO;

import br.com.minhacasatech.model.Local;
import java.io.*;
import java.util.ArrayList;

public class LocalDAO {
	private ArrayList <Local> locais;
	File arq;
	FileWriter writer;
	PrintWriter escrever;
	String texto;
	FileReader reader;
	BufferedReader ler;
	
	
	public void salvar(Local local) {
		locais.add(local);
		try {
			arq = new File("locais.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(locais);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}
	
	public boolean pesquisar(Local local) {
		try{
			arq = new File("locais.txt");
			if(arq.exists() && arq.isFile() && arq.canRead()) {
				reader = new FileReader("locais.txt");
				ler = new BufferedReader(reader);
				String linha = "";
				while ((linha = ler.readLine()) != null)
					texto = texto + linha;
				ler.close();
				reader.close();
			}
		}catch(IOException e) {e.printStackTrace();}
		finally {System.out.println(texto);}
		if(texto == null) {
			return false;
		} else {
			return true;
		}
	}
	
	public void editar(Local local) {
		if(pesquisar(local)) {
			
		locais.add(local);
		try {
			arq = new File("locais.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(locais);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
		
		}
	}
	
	public void excluir(Local local) {
		locais.remove(local);
		try {
			arq = new File("locais.txt");
			writer = new FileWriter(arq);
			escrever = new PrintWriter(writer);
			escrever.print(locais);
			escrever.close();
			writer.close();
			
		} catch(IOException e) {e.printStackTrace();}
	}

}
