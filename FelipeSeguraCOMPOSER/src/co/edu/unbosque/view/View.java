package co.edu.unbosque.view;

import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View {
	public void mostrarInfo(String dato, String tipo) {
		if(tipo.equals("informativo")) {
			JOptionPane.showMessageDialog(null, dato, "Información", JOptionPane.INFORMATION_MESSAGE);
		}else if(tipo.equals("error")) {
			JOptionPane.showMessageDialog(null, dato, "Error", JOptionPane.ERROR_MESSAGE);
		}
	}
	
	public String pedirDato(String mensaje) {
		String dato = "";
		dato = JOptionPane.showInputDialog(null, mensaje, "Composer", JOptionPane.QUESTION_MESSAGE);
		return dato;
	}
	
	public int pedirDatoEntero(String mensaje) {
		int numero = 0;
		numero = Integer.parseInt(JOptionPane.showInputDialog(null,mensaje , "Composer", JOptionPane.QUESTION_MESSAGE));
		return numero;
	}
	
	public String elegirUbicacionYNombre() {
		
		JFileChooser filechooser =new JFileChooser();
		filechooser.showSaveDialog(filechooser);
		File ubicacion = filechooser.getSelectedFile();
		String u = ""+ubicacion;	
		return u;
		
	}
}
