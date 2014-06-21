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

import Clases.Auxiliar;
import Clases.Cliente;
import Main.Main;
import Main.TFecha;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frmNuevoCliente extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JLabel lblTipoDoc;
	private JLabel lblNumeroDoc;
	private JTextField txtNumDoc;
	private JLabel lblDireccion;
	private JTextField txtDireccion;
	private JLabel lblFecha;
	private DefaultComboBoxModel tipodoc = null;
	private JComboBox cmbTipoDoc;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private TFecha fecha;
	private JComboBox cmbTipoDePago;
	private JTextField txtOcupacion;
	private JLabel lblTipodepago;
	private JTextField txtTelefono;
	private JLabel lblTelefono;
	private JTextField txtEmail;
	
	

	@SuppressWarnings("rawtypes")
	public frmNuevoCliente() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				Main ventana = new Main();
				ventana.setVisible(true);
				dispose();
			}
		});
		setResizable(false);
		setTitle("Nuevo Cliente - Veterinaria CAC");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 415, 372);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(78, 11, 53, 21);
		contentPane.add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setBounds(80, 43, 51, 21);
		contentPane.add(lblApellido);
		
		lblTipoDoc = new JLabel("Tipo de documento:");
		lblTipoDoc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDoc.setBounds(10, 75, 120, 21);
		contentPane.add(lblTipoDoc);
		
		lblNumeroDoc = new JLabel("Numero de documento:");
		lblNumeroDoc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroDoc.setBounds(0, 107, 141, 24);
		contentPane.add(lblNumeroDoc);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccion.setBounds(35, 134, 96, 21);
		contentPane.add(lblDireccion);
		
		lblFecha = new JLabel("Ocupacion:");
		lblFecha.setBounds(63, 170, 79, 21);
		contentPane.add(lblFecha);
		
		lblTipodepago = new JLabel("Tipo de Pago");
		lblTipodepago.setBounds(52, 268, 79, 21);
		contentPane.add(lblTipodepago);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setBounds(35, 209, 96, 21);
		contentPane.add(lblTelefono);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(35, 241, 96, 21);
		contentPane.add(lblEmail);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(151, 11, 246, 21);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(151, 43, 246, 21);
		contentPane.add(txtApellido);
		
		cmbTipoDoc = new JComboBox();
		cmbTipoDoc.setModel(new DefaultComboBoxModel(new String[] {"DNI", "CI", "LC"}));
		cmbTipoDoc.setBounds(151, 75, 114, 21);
		contentPane.add(cmbTipoDoc);
		
		txtNumDoc = new JTextField();
		txtNumDoc.setColumns(10);
		txtNumDoc.setBounds(151, 104, 246, 21);
		contentPane.add(txtNumDoc);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(151, 136, 246, 21);
		contentPane.add(txtDireccion);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ArrayList<String> errores = new ArrayList<String>();
				
				if(!Auxiliar.isValidDNI(txtNumDoc.getText())) errores.add("Numero de documento invalido.");
				
				if(errores.size()>0){
					JOptionPane.showMessageDialog(null,Auxiliar.contenarArrayList(errores));
				}else{
					Cliente cl=new Cliente();
					cl.setApellido(txtApellido.getText());
					cl.setNombre(txtNombre.getText());
					cl.setDireccion(txtDireccion.getText());
					cl.setOcupacion(txtOcupacion.getText());
					cl.setTelefono(txtTelefono.getText());
					cl.setTipo_documento((String) cmbTipoDoc.getSelectedItem());
					cl.setDocumento(txtNumDoc.getText());
					cl.setTipo_pago((String)cmbTipoDePago.getSelectedItem());
					cl.setEmail(txtEmail.getText());
					
					JOptionPane.showMessageDialog(null, cl.toString(),"Información",JOptionPane.INFORMATION_MESSAGE);
				}
				
				
			}
		});
		
		txtOcupacion = new JTextField();
		txtOcupacion.setColumns(10);
		txtOcupacion.setBounds(151, 170, 246, 21);
		contentPane.add(txtOcupacion);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(151, 209, 246, 21);
		contentPane.add(txtTelefono);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(151, 241, 246, 21);
		contentPane.add(txtEmail);
		btnAceptar.setBounds(308, 300, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(195, 300, 89, 23);
		contentPane.add(btnCancelar);
		
		cmbTipoDePago = new JComboBox();
		cmbTipoDePago.setModel(new DefaultComboBoxModel(new String[] {"Efectivo", "Tarjeta de credito", "Tarjeta de debito"}));
		cmbTipoDePago.setBounds(151, 268, 114, 21);
		contentPane.add(cmbTipoDePago);
	}
}
