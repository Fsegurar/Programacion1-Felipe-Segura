package co.edu.unbosque.model;

import java.util.Random;

import co.edu.unbosque.model.persistence.Arreglos;
import co.edu.unbosque.model.persistence.EjemploFile;
import co.edu.unbosque.model.persistence.Propiedades;

public class EjercicioArchivo {
	
	private EjemploFile archivo;
	private Arreglos p;
	private Propiedades prop;
	
	public EjercicioArchivo() {
	
	archivo = new EjemploFile();
	p = new Arreglos();
	prop = new Propiedades();
	 
	}
	
	
	public String gestionarArchivoCadena() {
		String dato = "";
		Random rnd;
		rnd = new Random(System.currentTimeMillis());
		int numero_r;
		for(short s = 0;s<prop.getEstrofa();s++) {
			for(short j = 0;j<prop.getFrase();j++) {
				for(short i = 0; i<6;i++) {
					numero_r = (int)(rnd.nextDouble()*4);
					if(i==0) {
						dato += p.getP1(numero_r)+" ";
					}else if (i==1) {
						dato += p.getP2(numero_r)+" ";
					}else if (i==2) {
						dato += p.getP3(numero_r)+" ";
					}else if (i==3) {
						dato += p.getP4(numero_r)+" ";
					}else if (i==4) {
						dato += p.getP5(numero_r)+" ";
					}else if (i==5) {
						dato += p.getP6(numero_r);
					}
				}
			 dato+="\n";
			}
			dato+="\n\n\n";
		}
		dato += "\nCantante : "+prop.getCantante()+"\nAutor : "+prop.getAutor();		
		archivo.escribirArchivo(dato);
		return "lei esto:\n "+archivo.leerArchivo();
	}
	
	public String gestionarPropiedades() {
		
		prop.escribirPropiedades();
		return "Se leyeron estas propiedades: "+"\n"+prop.leerPropiedades();
	}

	public EjemploFile getArchivo() {
		return archivo;
	}

	public void setArchivo(EjemploFile archivo) {
		this.archivo = archivo;
	}

	public Arreglos getP() {
		return p;
	}

	public void setP(Arreglos p) {
		this.p = p;
	}

	public Propiedades getProp() {
		return prop;
	}

	public void setProp(Propiedades prop) {
		this.prop = prop;
	}
	
}
