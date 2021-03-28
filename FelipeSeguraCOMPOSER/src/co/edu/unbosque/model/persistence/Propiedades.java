package co.edu.unbosque.model.persistence;

import java.io.*;
import java.util.Properties;

public class Propiedades {

	private Properties prop;
	private String archivoprop;	
	private int frase;
	private int estrofa;
	private String cantante;
	private String autor;
	
	public Propiedades() {
		prop = new Properties();
	}
	
	public int escribirPropiedades() {
		try {
			prop.setProperty("NumeroFrases", "4");
			prop.setProperty("NumeroEstrofa", "3");
			prop.setProperty("Cantante", "Anuel AA");
			prop.setProperty("NombreAutor","Reguetón Music Composer" );
			prop.store(new FileOutputStream(archivoprop), null);
		}catch (IOException ex) {
			return -1;
		}
		return 0;
	}
	
	public String leerPropiedades() {
		String linea = "";
		try {
			//leer el archivo de las propiedades definidas
			prop.load(new FileInputStream(archivoprop));
			//obtener las propiedades definidas
			prop.list(System.out);
			//leer cada valor de las propiedades
			linea += "Numero de Frases : "+prop.getProperty("NumeroFrases")+"\n";
			linea += "Numero de Estrofa : "+prop.getProperty("NumeroEstrofa")+"\n";
			linea += "Cantante : "+prop.getProperty("Cantante")+"\n";
			linea += "Autor : "+prop.getProperty("NombreAutor")+"\n";
			String f = prop.getProperty("NumeroFrases");
			frase = Integer.parseInt(f);
			String e = prop.getProperty("NumeroEstrofa");
			estrofa = Integer.parseInt(e);
			
		}catch(IOException ex) {
			return null;
		}
		return linea;
	}
	
	public Properties getProp() {
		return prop;
	}

	public void setProp(Properties prop) {
		this.prop = prop;
	}

	public String getArchivoprop() {
		return archivoprop;
	}

	public void setArchivoprop(String archivoprop) {
		this.archivoprop = archivoprop;
	}

	public int getFrase() {	
		return frase;
	}

	public void setFrase(int frase) {
		this.frase = frase;
	}

	public int getEstrofa() {
		return estrofa;
	}

	public void setEstrofa(int estrofa) {
		this.estrofa = estrofa;
	}

	public String getCantante() {
		cantante = prop.getProperty("Cantante");
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	public String getAutor() {
		autor = prop.getProperty("NombreAutor");
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}
}


