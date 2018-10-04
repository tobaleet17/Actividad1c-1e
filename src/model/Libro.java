package model;

import java.io.Serializable;

public class Libro  implements Serializable{
	
	private int identificador;
	private String Titulo;
	private String Autor;
	private int anoPubli;
	private String editor;
	private int numPag;
	
	public Libro(int identificador, String titulo, String autor, int anoPubli, String editor, int numPag) {
		super();
		this.identificador = identificador;
		this.Titulo = titulo;
		this.Autor = autor;
		this.anoPubli = anoPubli;
		this.editor = editor;
		this.numPag = numPag;
		
	}

	public int getIdentificador() {
		return identificador;
	}

	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public int getAnoPubli() {
		return anoPubli;
	}

	public void setAnoPubli(int anoPubli) {
		this.anoPubli = anoPubli;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public int getNumPag() {
		return numPag;
	}

	public void setNumPag(int numPag) {
		this.numPag = numPag;
	}
	
	

}
