package view;

import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class LaunchView extends JFrame {

	private JButton comparar,buscar,AnadirLibro;
	private JTextArea textArea;
	private JTextField fichero1,fichero2,palabra;
	private JLabel label_f1,label_f2,label_pal;
	private JCheckBox primera;
	
	private JPanel panel;
	private JPanel panel_1;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JTextField textNumPag;
	private JTextField textID;
	private JTextField textTitulo;
	private JTextField textAutor;
	private JTextField textPublicacion;
	private JTextField textEditor;
	private JButton Recuperar;
	private JButton btnRecuperarTodos;
	
	
	public LaunchView() {
		
		setBounds(200,200,1000,450);
		setTitle("Proyecto Buffers");	
		panel = new JPanel();
		
		comparar = new JButton("Comparar contenido");
		comparar.setPreferredSize(new Dimension(150, 26));
		buscar = new JButton("Buscar palabra");
		buscar.setPreferredSize(new Dimension(150, 26));
		AnadirLibro = new JButton("Añadir Libro");
		AnadirLibro.setPreferredSize(new Dimension(150, 26));
		
		fichero1 = new JTextField("",10);
		fichero2 = new JTextField("",10);
		palabra = new JTextField("",10);
		
		label_f1 = new JLabel("Fichero 1:");
		label_f2 = new JLabel("Fichero 2:");
		label_pal = new JLabel("Palabra:");
		
		primera = new JCheckBox("Primera aparición");

		textArea = new JTextArea(20, 80);
		textArea.setBounds(50,50,50,50);
		textArea.setEditable(false);		
		
		panel.add(comparar);
		panel.add(buscar);
		panel.add(label_f1);
		panel.add(fichero1);
		panel.add(label_f2);
		panel.add(fichero2);
		panel.add(label_pal);
		panel.add(palabra);
		panel.add(primera);
		
		Recuperar = new JButton("Recuperar Libro");
		panel.add(Recuperar);
		
		btnRecuperarTodos = new JButton("Recuperar Todos");
		panel.add(btnRecuperarTodos);
		panel.add(AnadirLibro);
		
		panel_1 = new JPanel();
		panel.add(panel_1);
		
		label = new JLabel("Identificador:");
		
		label_1 = new JLabel("Titulo:");
		
		label_2 = new JLabel("Autor:");
		
		label_3 = new JLabel("A\u00F1o de Publicaci\u00F3n:");
		
		label_4 = new JLabel("NumPAg:");
		
		textNumPag = new JTextField();
		textNumPag.setColumns(10);
		
		textID = new JTextField();
		textID.setColumns(10);
		
		textTitulo = new JTextField();
		textTitulo.setColumns(10);
		
		textAutor = new JTextField();
		textAutor.setColumns(10);
		
		textPublicacion = new JTextField();
		textPublicacion.setColumns(10);
		
		textEditor = new JTextField();
		textEditor.setColumns(10);
		
		JLabel lblEditor = new JLabel("Editor:");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 324, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(label)
								.addComponent(label_1)
								.addComponent(label_2)
								.addComponent(label_3))
							.addPreferredGap(ComponentPlacement.UNRELATED))
						.addGroup(gl_panel_1.createSequentialGroup()
							.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
								.addComponent(lblEditor)
								.addComponent(label_4))
							.addGap(23)))
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(textNumPag, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textPublicacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textEditor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(132, Short.MAX_VALUE))
		);
		gl_panel_1.setVerticalGroup(
			gl_panel_1.createParallelGroup(Alignment.LEADING)
				.addGap(0, 171, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textID, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textTitulo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_1))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textAutor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING)
						.addComponent(textPublicacion, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_3))
					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textEditor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblEditor))
					.addGap(11)
					.addGroup(gl_panel_1.createParallelGroup(Alignment.BASELINE)
						.addComponent(textNumPag, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(label_4)))
		);
		panel_1.setLayout(gl_panel_1);
		panel.add(textArea);
		
        // Añadimos el JPanel al JFrame
        this.getContentPane().add(panel);
		
	}	


	public JTextField getTextAutor() {
		return textAutor;
	}


	public void setTextAutor(JTextField textAutor) {
		this.textAutor = textAutor;
	}


	public JTextField getTextTitulo() {
		return textTitulo;
	}


	public void setTextTitulo(JTextField textTitulo) {
		this.textTitulo = textTitulo;
	}


	public JTextField getTextPublicacion() {
		return textPublicacion;
	}


	public void setTextPublicacion(JTextField textPublicacion) {
		this.textPublicacion = textPublicacion;
	}


	public JTextField getTextEditor() {
		return textEditor;
	}


	public void setTextEditor(JTextField textEditor) {
		this.textEditor = textEditor;
	}


	public JTextField getTextID() {
		return textID;
	}


	public void setTextID(JTextField textID) {
		this.textID = textID;
	}


	public JTextField getTextNumPag() {
		return textNumPag;
	}


	public void setTextNumPagina(JTextField textNumPag) {
		this.textNumPag = textNumPag;
	}


	public JButton getAnadir() {
		
		return AnadirLibro;
		
	}
	 public void setAnadirLibro(JButton AnadirLibro) {
		 
		 this.AnadirLibro = AnadirLibro;
		 
	 }
	 
		public JButton getRecuperar() {
			
			return Recuperar;
			
		}
		 public void setRecuperar(JButton Recuperar) {
			 
			 this.Recuperar = Recuperar;
			 
		 }
	public JCheckBox getPrimera() {
		return primera;
	}
	public void setPrimera(JCheckBox primera) {
		
		this.primera=primera;
	}
	
	public JTextField getPalabra() {
		return palabra;
	}
	
	public void setPalabra(JTextField palabra) {
		this.palabra=palabra;
	}
	
	public JButton getComparar() {
		return comparar;
	}

	public void setComparar(JButton comparar) {
		this.comparar = comparar;
	}

	public JButton getBuscar() {
		return buscar;
	}

	public void setBuscar(JButton buscar) {
		this.buscar = buscar;
	}
	public JButton getRecuperar_todos() {
		return btnRecuperarTodos;
	}

	public void setRecuperar_todos(JButton Recuperar_todos) {
		this.btnRecuperarTodos = btnRecuperarTodos;
	}

	public JTextArea getTextArea() {
		return textArea;
	}

	public void setTextArea(JTextArea textArea) {
		this.textArea = textArea;
	}
			
	public JTextField getFichero1() {
		return fichero1;
	}

	public void setFichero1(JTextField fichero1) {
		this.fichero1 = fichero1;
	}

	public JTextField getFichero2() {
		return fichero2;
	}

	public void setFichero2(JTextField fichero2) {
		this.fichero2 = fichero2;
	}

	public void showError(String m){
		JOptionPane.showMessageDialog(this.panel,
			    m,
			    "Error",
			    JOptionPane.ERROR_MESSAGE);
	}
}
