package Interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Prueba3 extends JFrame implements ActionListener{
	
	JLabel lblTitulo1,lblTitulo2,LBNombreBD;
	JButton btnPanel1,btnPanel2,btnPanel3,CrearBD,EliminarBD,OrCrearBD;
	JPanel panelSubMenu1,panel1,panel2;
	JTextField campo,TFNombreDB;
	

	public Prueba3() {
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(387,365);
		setTitle("TRABAJO CON BD");
		setLayout(null);
		
		setLocationRelativeTo(null);
		iniciarComponentes();
	}
	
	private void iniciarComponentes() {
		
		panelSubMenu1 = new JPanel();
		panelSubMenu1.setBackground(Color.orange);
		panelSubMenu1.setBounds(0,40,370,50);
		panelSubMenu1.setLayout(null);
		panelSubMenu1.setVisible(false);
		
		panel1 = new JPanel();
		panel1.setBackground(Color.cyan);
		panel1.setBounds(0,112,370,200);
		panel1.setLayout(null);
		panel1.setVisible(true);
		
		panel2 = new JPanel();
		panel2.setBackground(Color.green);
		panel2.setBounds(0,112,370,200);
		panel2.setLayout(null);
		panel2.setVisible(false);
		
		btnPanel1 = new JButton("Opciones BD");
		btnPanel1.setBounds(10,10,120,23);
		btnPanel1.addActionListener(this);
		
		btnPanel2 = new JButton("Tablas");
		btnPanel2.setBounds(145,10,89,23);
		btnPanel2.addActionListener(this);
		
		btnPanel3 = new JButton("Datos");
		btnPanel3.setBounds(250,10,89,23);
		btnPanel3.addActionListener(this);
		
		cargarComponentesPanel1();
		cargarComponentesPanel2();
		
		add(panelSubMenu1);
		add(btnPanel1);
		add(btnPanel2);
		add(btnPanel3);
		add(panel1);
		add(panel2);
	}
	
	private void cargarSubMenu1() {//SUBMENU CREATE - DELETE DB//
		CrearBD = new JButton("Crear nueva BD");
		CrearBD.setBounds(10,5,130,23);
		CrearBD.addActionListener(this);
		
		EliminarBD = new JButton("Eliminar BD");
		EliminarBD.setBounds(150,5,130,23);
		EliminarBD.addActionListener(this);
		
		panelSubMenu1.add(CrearBD);
		panelSubMenu1.add(EliminarBD);
	}
	
	private void cargarComponentesPanel1() {//COMPONENTES PANTALLA CREAR DB//
		
		lblTitulo1 = new JLabel("Crear nueva Base de datos : ");
		lblTitulo1.setBounds(100,0,221,51);
		
		LBNombreBD = new JLabel("Nombre : ");
		LBNombreBD.setBounds(5,55,70,25);
		
		TFNombreDB = new JTextField();
		TFNombreDB.setBounds(75,55,70,25);
		
		OrCrearBD = new JButton("Crear BD");
		OrCrearBD.setBounds(140,90,100,25);
		
		panel1.add(lblTitulo1);
		panel1.add(LBNombreBD);
		panel1.add(TFNombreDB);
		panel1.add(OrCrearBD);
		
	}
	
	private void cargarComponentesPanel2() {//COMPONENTES PANTALLA DELETE DB//

		campo = new JTextField();
		campo.setBounds(10,40,221,25);
		
		lblTitulo2 = new JLabel("Eliminar BD : ");
		lblTitulo2.setBounds(5,0,180,51);
		
		panel2.add(lblTitulo2);
		panel2.add(campo);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==CrearBD) {
			panel1.setVisible(true);
			panel2.setVisible(false);
		}
		
		if(e.getSource()==EliminarBD) {
			panel2.setVisible(true);
			panel1.setVisible(false);
		}
		
		if(e.getSource()==btnPanel1) {
			cargarSubMenu1();
			panelSubMenu1.setVisible(true);
		}
		if(e.getSource()==OrCrearBD) {
			
		}
	}
}

