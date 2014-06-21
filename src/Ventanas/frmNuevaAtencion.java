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
import Main.TFecha;

public class frmNuevaAtencion extends JFrame {

	private JPanel contentPane;
	private JLabel lblTipoDoc;
	private JLabel lblDiagnostico;
	private JLabel lblFecha;
	private JLabel lblDia;
	private JLabel lblMes;
	private JLabel lblAnio;
	private DefaultComboBoxModel tipodoc = null;
	private JComboBox cmbDia;
	private JComboBox cmbMes;
	private JComboBox cmbAnio;
	private JComboBox cmbTipoConsulta;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private TFecha fecha;
	private JComboBox cmbCliente;
	private JComboBox cmbVeterinario;
	private JComboBox cmbMascota;
	private JTextArea txtDiagnostico;
	
	
	@SuppressWarnings("rawtypes")
	public frmNuevaAtencion() {
		setTitle("Nueva Atencion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 461, 319);
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
		
		lblTipoDoc = new JLabel("Tipo de consulta");
		lblTipoDoc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDoc.setBounds(10, 75, 120, 21);
		contentPane.add(lblTipoDoc);
		
		cmbTipoConsulta = new JComboBox();
		cmbTipoConsulta.setModel(new DefaultComboBoxModel(new String[] {"Consulta General", "Operacion", "Aplicacion de medicamentos"}));
		cmbTipoConsulta.setBounds(151, 75, 114, 21);
		contentPane.add(cmbTipoConsulta);
		
		lblDiagnostico = new JLabel("Diagnostico");
		lblDiagnostico.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDiagnostico.setBounds(-8, 134, 141, 24);
		contentPane.add(lblDiagnostico);
		
		lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(35, 180, 131, 21);
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
		
		cmbDia = new JComboBox();
		cmbDia.setBounds(35, 213, 82, 21);
		contentPane.add(cmbDia);
		
		cmbMes = new JComboBox();
		cmbMes.setBounds(172, 213, 82, 21);
		contentPane.add(cmbMes);
		
		cmbAnio = new JComboBox();
		cmbAnio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		cmbAnio.setBounds(315, 213, 82, 21);
		contentPane.add(cmbAnio);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			Atencion atenc=new Atencion();
			atenc.setCliente((String) cmbCliente.getSelectedItem());
			atenc.setVeterinario((String) cmbVeterinario.getSelectedItem());
			atenc.setMascota((String) cmbMascota.getSelectedItem());
			atenc.setTipo_consulta((String) cmbTipoConsulta.getSelectedItem());
			atenc.setDiagnostico(txtDiagnostico.getText());
			
				
			}
		});
		btnAceptar.setBounds(298, 244, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(192, 244, 89, 23);
		contentPane.add(btnCancelar);
		
		fecha = new TFecha(cmbDia,cmbMes, cmbAnio);
		
		cmbCliente = new JComboBox();
		cmbCliente.setModel(new DefaultComboBoxModel(new String[] {"-", "John Doe", "Marcos mercury", "Sebastian tahl"}));
		cmbCliente.setBounds(150, 11, 115, 21);
		contentPane.add(cmbCliente);
		
		cmbVeterinario = new JComboBox();
		cmbVeterinario.setModel(new DefaultComboBoxModel(new String[] {"-", "Carlos Estevez", "Jose Peralta"}));
		cmbVeterinario.setBounds(150, 43, 115, 21);
		contentPane.add(cmbVeterinario);
		
		JLabel lblMascota = new JLabel("Mascota");
		lblMascota.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMascota.setBounds(13, 102, 120, 21);
		contentPane.add(lblMascota);
		
		cmbMascota = new JComboBox();
		cmbMascota.setModel(new DefaultComboBoxModel(new String[] {"-", "Scott", "Homero"}));
		cmbMascota.setBounds(151, 104, 115, 21);
		contentPane.add(cmbMascota);
		
		txtDiagnostico = new JTextArea();
		txtDiagnostico.setBounds(151, 134, 200, 50);
		contentPane.add(txtDiagnostico);
	}
}
