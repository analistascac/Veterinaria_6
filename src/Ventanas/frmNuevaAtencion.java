package Ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

import javax.swing.JTextArea;

import Clases.Atencion;
import Main.Main;
import Main.TFecha;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frmNuevaAtencion extends JFrame {

	private JPanel contentPane;
	private JLabel lblTipoConsulta;
	private JLabel lblDiagnostico;
	private JLabel lblFecha;
	private JLabel lblDia;
	private JLabel lblMes;
	private JLabel lblAnio;
	private JComboBox cmbDia;
	private JComboBox cmbMes;
	private JComboBox cmbAnio;
	private JComboBox cmbTipoConsulta;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private TFecha fecha;
	private JComboBox cmbCliente;
	private DefaultComboBoxModel clientes = new DefaultComboBoxModel();
	private JComboBox cmbVeterinario;
	private DefaultComboBoxModel veterinarios = new DefaultComboBoxModel();
	private JComboBox cmbMascota;
	private DefaultComboBoxModel mascotas = new DefaultComboBoxModel();
	private JTextArea txtDiagnostico;
	
	@SuppressWarnings("rawtypes")
	public frmNuevaAtencion() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				Main v = new Main();
				v.setVisible(true);
				dispose();
			}
		});
		setResizable(false);
		setTitle("Nueva Atencion - Veterinaria CAC");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 422, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCliente = new JLabel("Cliente");
		lblCliente.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCliente.setBounds(80, 11, 53, 21);
		contentPane.add(lblCliente);
		
		JLabel lblVeterinario = new JLabel("Veterinario");
		lblVeterinario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblVeterinario.setBounds(35, 43, 96, 21);
		contentPane.add(lblVeterinario);
		
		lblTipoConsulta = new JLabel("Tipo de consulta");
		lblTipoConsulta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoConsulta.setBounds(10, 75, 120, 21);
		contentPane.add(lblTipoConsulta);
		
		JLabel lblMascota = new JLabel("Mascota");
		lblMascota.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMascota.setBounds(13, 102, 120, 21);
		contentPane.add(lblMascota);
		
		lblDiagnostico = new JLabel("Diagnostico");
		lblDiagnostico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiagnostico.setBounds(-8, 134, 141, 24);
		contentPane.add(lblDiagnostico);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(10, 181, 131, 21);
		contentPane.add(lblFecha);
		
		lblDia = new JLabel("Dia");
		lblDia.setBounds(10, 212, 23, 21);
		contentPane.add(lblDia);
		
		lblMes = new JLabel("Mes");
		lblMes.setBounds(139, 213, 23, 21);
		contentPane.add(lblMes);
		
		lblAnio = new JLabel("Año");
		lblAnio.setBounds(282, 213, 23, 21);
		contentPane.add(lblAnio);
		
		cmbCliente = new JComboBox();
		cmbCliente.setModel(clientes);
		cargarClientes();
		cmbCliente.setBounds(150, 11, 247, 21);
		contentPane.add(cmbCliente);
		
		cmbVeterinario = new JComboBox();
		cmbVeterinario.setModel(veterinarios);
		cargarVeterinarios();
		cmbVeterinario.setBounds(150, 43, 247, 21);
		contentPane.add(cmbVeterinario);
		
		cmbTipoConsulta = new JComboBox();
		cmbTipoConsulta.setModel(new DefaultComboBoxModel(new String[] {"Consulta General", "Operacion", "Aplicacion de medicamentos"}));
		cmbTipoConsulta.setBounds(151, 75, 246, 21);
		contentPane.add(cmbTipoConsulta);
		
		cmbMascota = new JComboBox();
		cmbMascota.setModel(mascotas);
		cargarMascotas();
		cmbMascota.setBounds(151, 104, 246, 21);
		contentPane.add(cmbMascota);
		
		txtDiagnostico = new JTextArea();
		txtDiagnostico.setLineWrap(true);
		txtDiagnostico.setBounds(151, 134, 246, 53);
		contentPane.add(txtDiagnostico);
		
		cmbDia = new JComboBox();
		cmbDia.setBounds(35, 213, 82, 21);
		contentPane.add(cmbDia);
		
		cmbMes = new JComboBox();
		cmbMes.setBounds(172, 213, 82, 21);
		contentPane.add(cmbMes);
		
		cmbAnio = new JComboBox();
		cmbAnio.setBounds(315, 213, 82, 21);
		contentPane.add(cmbAnio);
		
		fecha = new TFecha(cmbDia,cmbMes, cmbAnio);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Atencion atenc=new Atencion();
				atenc.setCliente((String) cmbCliente.getSelectedItem());
				atenc.setVeterinario((String) cmbVeterinario.getSelectedItem());
				atenc.setMascota((String) cmbMascota.getSelectedItem());
				atenc.setTipo_consulta((String) cmbTipoConsulta.getSelectedItem());
				atenc.setDiagnostico(txtDiagnostico.getText());
				atenc.setFecha(fecha.getFechaString());
				
				JOptionPane.showMessageDialog(null, atenc.toString(),"Informacion",JOptionPane.INFORMATION_MESSAGE);
				
			}
		});
		btnAceptar.setBounds(308, 245, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(209, 245, 89, 23);
		contentPane.add(btnCancelar);
		
		
	}
	
	private void cargarMascotas(){
		//tiene que recibir las mascotas del storeprocedure y agregarlas a la variable mascotas.
		mascotas.addElement("Mascota prueba 1");
		mascotas.addElement("Mascota prueba 2");
		mascotas.addElement("Mascota prueba 3");
	}
	private void cargarVeterinarios(){
		veterinarios.addElement("Veterinario prueba 1");
		veterinarios.addElement("Veterinario prueba 2");
		veterinarios.addElement("Veterinario prueba 3");	
	}
	private void cargarClientes(){
		clientes.addElement("Cliente prueba 1");
		clientes.addElement("Cliente prueba 2");
		clientes.addElement("Cliente prueba 3");
	}
}
