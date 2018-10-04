package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class GestionDatos {

	public GestionDatos() {

	}

	//TODO: Implementa una función para abrir ficheros
	public FileReader abrirFichero(String fichero1) throws FileNotFoundException{
		
		FileReader f1 =new FileReader(fichero1);
		return f1;
		
	}
	
	//TODO: Implementa una función para cerrar ficheros
	public void cerrarFichero(FileReader f1,BufferedReader b1) throws IOException{
		
		f1.close();
		b1.close();
		
	}
	
	public boolean compararContenido (String fichero1, String fichero2) throws IOException{
		//TODO: Implementa la función
		FileReader bf1 = abrirFichero(fichero1);
		FileReader bf2= abrirFichero(fichero2);
		
		BufferedReader bfr1 = new BufferedReader(bf1);
		BufferedReader bfr2 = new BufferedReader(bf2);
		
		String Cadena1 = bfr1.readLine();
		String Cadena2=bfr2.readLine();
		
		boolean iguales= true;
		
		while ((Cadena1!=null) && (Cadena2!=null) && iguales){
			
			System.out.println("hola "+Cadena1.compareTo(Cadena2));
			if (Cadena1.compareTo(Cadena2)!=0) {
			    iguales = false;
			    return false;
			}
			 Cadena1 = bfr1.readLine();
			 Cadena2 = bfr2.readLine();
			 if (Cadena1==null && Cadena2!=null) {
				 
				 iguales = false;
				 return iguales;
			 }
			 
			 if (Cadena1!=null && Cadena2==null) {
				 
				 iguales = false;
				 return iguales;
			 }
			 if (Cadena1==null && Cadena2==null) {
				 
				 iguales = true;
				 return iguales;
			 }
		}
		
		return true;
	}
	
	public int buscarPalabra (String fichero1, String palabra, boolean primera_aparicion) throws IOException{
		//TODO: Implementa la función
		try {
		FileReader bf1 = abrirFichero(fichero1);
		BufferedReader bfr1 = new BufferedReader(bf1);
		
		
		
		String text="";
		int numLinea=0;
		int lineaActual=0;
		
		while (text!=null) {
		text=bfr1.readLine(); //Aquí leemos lo que hay en una linea y lo rellenamos en Text para después compararla		
		if(text==null) {
			cerrarFichero(bf1,bfr1);
			return numLinea;
			
		}
		lineaActual++;
		if (text.contains(palabra)) {
			
			numLinea=lineaActual;
			
			if(primera_aparicion) {
				cerrarFichero(bf1, bfr1);
				return numLinea;
			}	
			
		} 
		
		
		}
		
		}catch(IOException ex) {
			
			System.out.println("se ha producido un error");
		}
		
		return 0;
	}
	
	public int guardar_libro(Libro libro) throws FileNotFoundException, IOException {
		
		File f1=new File(String.valueOf(libro.getIdentificador()));// El string value of lo convertimos en String porque es un int
		
		
		if (!f1.exists()) { // si no existe el fichero que vamos a crear con el título se creará
			System.out.println("hola3");
		ObjectOutputStream traer = new ObjectOutputStream(new FileOutputStream(f1)); //Aquí lo que hacemos es serializar para guardar los objetos en un fichero con el nombre título.
		traer.writeObject(libro);
		System.out.println("hola4");
		traer.close();
		}else {
			
			return 0;
			
		}
	
		return 1;
		
	}
	
	public Libro recuperar_libro(String identificador) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		File f2=new File(String.valueOf(identificador));
		
		ObjectInputStream recu = new ObjectInputStream(new FileInputStream(f2));
		Libro l1 = (Libro) recu.readObject();
		 return l1;
		 
		
	}
	
	public ArrayList<Libro> Todos() throws IOException, ClassNotFoundException {
		
	
		File f1r = new File("C:\\Users\\crgomo01\\eclipse-workspace\\Actividad1c\\libros");//Users\\crgomo01\\eclipse-workspace\\Actividad1c\\libros");
		

		
		ArrayList <Libro> n1=new ArrayList <Libro>();
		String Array1[] =f1r.list();
		
		int i=0;
		
		while (i < Array1.length) {
			
			n1.add(recuperar_libro(Array1[i]));
			
			i++;
			
		}
		
		return n1;
		
		
		
	}
	
	

}
