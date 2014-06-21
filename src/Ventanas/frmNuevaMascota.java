package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clases.Mascota;
import Main.Main;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frmNuevaMascota extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombreCientifico;
	private JTextField txtNombreVulgar;
	private JTextField txtDescripcion;
	private JComboBox cmbDueno;
	private DefaultComboBoxModel<String> duenos = new DefaultComboBoxModel();

	public frmNuevaMascota() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				Main v = new Main();
				v.setVisible(true);
				dispose();
			}
		});
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setTitle("Nueva mascota - Veterinaria CAC");
		setBounds(100, 100, 309, 175);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Due\u00F1o:");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setBounds(10, 11, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNombreCientifico = new JLabel("Nombre cientifico:");
		lblNombreCientifico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreCientifico.setBounds(10, 34, 100, 14);
		contentPane.add(lblNombreCientifico);
		
		JLabel lblNombreVulgar = new JLabel("Nombre vulgar:");
		lblNombreVulgar.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombreVulgar.setBounds(10, 59, 100, 14);
		contentPane.add(lblNombreVulgar);
		
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescripcion.setBounds(10, 84, 100, 14);
		contentPane.add(lblDescripcion);
		
		cmbDueno = new JComboBox();
		cmbDueno.setModel(duenos);
		llenarDuenos();
		cmbDueno.setBounds(120, 8, 166, 17);
		contentPane.add(cmbDueno);
		
		txtNombreCientifico = new JTextField();
		txtNombreCientifico.setBounds(120, 31, 166, 20);
		contentPane.add(txtNombreCientifico);
		txtNombreCientifico.setColumns(10);
		
		txtNombreVulgar = new JTextField();
		txtNombreVulgar.setColumns(10);
		txtNombreVulgar.setBounds(120, 56, 166, 20);
		contentPane.add(txtNombreVulgar);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setColumns(10);
		txtDescripcion.setBounds(120, 81, 166, 20);
		contentPane.add(txtDescripcion);
		
		JButton btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Mascota mas = new Mascota();
				mas.setDescripcion(txtDescripcion.getText());
				mas.setDueno((String)cmbDueno.getSelectedItem());
				mas.setNombre_cientifico(txtNombreCientifico.getText());
				mas.setNombre_vulgar(txtNombreVulgar.getText());
				
				JOptionPane.showMessageDialog(null, mas.toString());
			}
		});
		btnAgregar.setBounds(197, 112, 89, 23);
		contentPane.add(btnAgregar);
	}
	
	private void llenarDuenos(){
		duenos.addElement("Dueño prueba 1");
		duenos.addElement("Dueño prueba 2");
		duenos.addElement("Dueño prueba 3");
		duenos.addElement("Dueño prueba 4");
	}
}
