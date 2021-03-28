package co.edu.unbosque.controller;

import co.edu.unbosque.model.EjercicioArchivo;
import co.edu.unbosque.view.View;

public class Controller {

	private EjercicioArchivo modelo;
	private View vista;
		
	
	public Controller() {
		modelo = new EjercicioArchivo();
		vista = new View();
		funcionar();
	}
	
	public void funcionar() {
		boolean error = false;
		vista.mostrarInfo("A continuacion se abrira un cuadro de dialogo seleccione la ubicacion en donde desea guardar la cancion y escriba el nombre con el que desea guardar el archivo", "informativo");
		String ubicacion = vista.elegirUbicacionYNombre();
		modelo.getProp().setArchivoprop(ubicacion+".properties");
		vista.mostrarInfo(modelo.gestionarPropiedades(), "informativo");
		modelo.getArchivo().setArchivodata(ubicacion+".txt");
		int opcion = 0;
		vista.mostrarInfo(modelo.gestionarArchivoCadena(), "informativo");
		do {
			do {
				try {
					opcion = vista.pedirDatoEntero("De acuerdo a las siguientes indicaciones ingrese un numero\n1. Desea volver a generar la canción\n2. Continuar");
					error = false;
				}catch(NumberFormatException e) {
					vista.mostrarInfo("Digite numero valido", "error");
					error = true;
				}
				
			}while(error);
			switch ( opcion) {
				case 1: 
					vista.mostrarInfo(modelo.gestionarArchivoCadena(), "informativo");
					break;
				case 2: 
					vista.mostrarInfo("Hasta Pronto", "informativo");
					break;
				default:
					vista.mostrarInfo("OPCIÓN INVÁLIDA", "error");
					break;
			}				
		}while(opcion !=2);		
	}
}
