package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import model.*;
import view.*;

public class GestionEventos {

	private GestionDatos model;
	private LaunchView view;
	private ActionListener actionListener_comparar, actionListener_buscar,actionListener_anadir,actionListener_recuperar,actionListener_recuperarTodos;

	public GestionEventos(GestionDatos model, LaunchView view) {
		this.model = model;
		this.view = view;
	}

	public void contol() {
		actionListener_comparar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				// TODO: Llamar a la función call_compararContenido
				call_compararContenido();
			}
		};
		view.getComparar().addActionListener(actionListener_comparar);

		actionListener_buscar = new ActionListener() {
			public void actionPerformed(ActionEvent actionEvent) {
				// TODO: Llamar a la función call_buscarPalabra
				call_buscarPalabra();
			}
		};
		view.getBuscar().addActionListener(actionListener_buscar);
		
		actionListener_anadir = new ActionListener() {
		public void actionPerformed(ActionEvent actionEvent) {
			
			guardar_libro();
			
			}
		
		};
		view.getAnadir().addActionListener(actionListener_anadir);
		
		actionListener_recuperar = new ActionListener() {
		public void actionPerformed(ActionEvent actionEvent) {
			
			call_recuperar_libro();
			
			}
	
		};
	view.getRecuperar().addActionListener(actionListener_recuperar);
	
	actionListener_recuperarTodos = new ActionListener() {
	public void actionPerformed(ActionEvent actionEvent) {
		
		recuperar_todos();
		
		}

	};
	view.getRecuperar_todos().addActionListener(actionListener_recuperarTodos);
	
	
	
	}

	private int call_compararContenido() {

		// TODO: Llamar a la función compararContenido de GestionDatos
		try {
			if (model.compararContenido(view.getFichero1().getText(), view.getFichero2().getText())) {
				
				view.getTextArea().setText("El contenido es el mismo");
			}else{
				
				view.getTextArea().setText("Los textos no contienen los mismo");
			}
			
			}catch(FileNotFoundException excepcion) {
				view.showError("algun fichero no ha sido encontrado");
			} catch (IOException excep){
				
				view.showError("Hay un problema");
			}
	
		
		// TODO: Gestionar excepciones
		return 1;
	}

	private int call_buscarPalabra() {

		// TODO: Llamar a la función buscarPalabra de GestionDatos
		// TODO: Gestionar excepciones
		try {
			boolean primera=view.getPrimera().isSelected();
			int res=model.buscarPalabra(view.getFichero1().getText(), view.getPalabra().getText(), primera);
			
			if (res==0) {
				view.getTextArea().setText("La palabra no se ha encontrado ");
			}else {
				if(primera) {
					
					view.getTextArea().setText("La primera aparación de la palabra esta en la linea :"+res);
				}else {
					
					view.getTextArea().setText("La última aparación es en la linea :"+res);
				}
				
			}
			
		}catch(IOException ex) {
			
			view.showError("Ha ocurrido un error al buscar");
			
		}
		
		return 1;
	}
	
	public void guardar_libro() {
		
		
		try { 

			int id = Integer.parseInt(view.getTextID().getText());
			String titulo = view.getTextTitulo().getText();
			String autor = view.getTextAutor().getText();
			int AnoPubli = Integer.parseInt(view.getTextPublicacion().getText());
			String editor = view.getTextEditor().getText();
			int NumPag = Integer.parseInt(view.getTextNumPag().getText());
			
			Libro l1= new Libro(id, titulo, autor, AnoPubli, editor, NumPag);
			
			model.guardar_libro(l1);
			
			
		}catch (IOException ex) {
			view.showError("Tienes un error a la hora de crear el libro");
			
			
			
		}
		
		
	}
	
	public void call_recuperar_libro() {
		
		try {
			
			int id = Integer.parseInt(view.getTextID().getText());
	
			
			Libro l1recu=model.recuperar_libro(view.getTextID().getText());
			
			view.getTextArea().setText("Autor :" + l1recu.getAutor() + "\n"+ "Editor :" + l1recu.getEditor()+ "\n" + "Titulo :" +l1recu.getTitulo() + "\n" + "Año de Publicacion :"+ ""+l1recu.getAnoPubli());
		
		} catch (ClassNotFoundException | IOException e) {
			
			view.showError("No se ha encontrado el libro");
		}
		
		
		
	}
	
	private void recuperar_todos() {
		
		
		try {
			
			ArrayList <Libro> Array1= model.Todos();
			StringBuilder sb = new StringBuilder();
			for (int i=0;i<Array1.size();i++) {
				
				sb.append(Array1.get(i).getTitulo()+"\n"); //Añadimos el salto de línea para que no salgan los títulos juntos
				
			}
			
			view.getTextArea().setText(sb.toString());
		} catch (ClassNotFoundException e) {
			view.showError("Hay un problema para ver la clase padre ");
			e.printStackTrace();
		} catch (IOException e) {
			
			view.showError("Se ha producido un error en el sistema ");
			e.printStackTrace();
		}
		
		
		
		
	}
	

}
