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
import Main.TFecha;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

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
	
	

	@SuppressWarnings("rawtypes")
	public frmNuevoCliente() {
		setTitle("Nuevo Cliente");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 470, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(151, 11, 246, 21);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setBounds(78, 11, 53, 21);
		contentPane.add(lblNombre);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		txtApellido.setBounds(151, 43, 246, 21);
		contentPane.add(txtApellido);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setHorizontalAlignment(SwingConstants.RIGHT);
		lblApellido.setBounds(80, 43, 51, 21);
		contentPane.add(lblApellido);
		
		lblTipoDoc = new JLabel("Tipo de documento:");
		lblTipoDoc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTipoDoc.setBounds(10, 75, 120, 21);
		contentPane.add(lblTipoDoc);
		
		cmbTipoDoc = new JComboBox();
		cmbTipoDoc.setModel(new DefaultComboBoxModel(new String[] {"DNI", "CI", "LC"}));
		cmbTipoDoc.setBounds(151, 75, 114, 21);
		contentPane.add(cmbTipoDoc);
		
		lblNumeroDoc = new JLabel("Numero de documento:");
		lblNumeroDoc.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNumeroDoc.setBounds(0, 107, 141, 24);
		contentPane.add(lblNumeroDoc);
		
		txtNumDoc = new JTextField();
		txtNumDoc.setColumns(10);
		txtNumDoc.setBounds(151, 104, 246, 21);
		contentPane.add(txtNumDoc);
		
		lblDireccion = new JLabel("Direccion:");
		lblDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccion.setBounds(35, 134, 96, 21);
		contentPane.add(lblDireccion);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(151, 136, 246, 21);
		contentPane.add(txtDireccion);
		
		lblFecha = new JLabel("Ocupacion:");
		lblFecha.setBounds(63, 170, 79, 21);
		contentPane.add(lblFecha);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ArrayList<String> errores=new ArrayList<String>();
				if(!Auxiliar.isValidDNI(txtNumDoc.getText()))errores.add("Numero de documento invalido.");
				if(errores.size()>0) JOptionPane.showMessageDialog(null,Auxiliar.contenarArrayList(errores));
				else
				{
					Cliente cl=new Cliente();
					cl.setApellido(txtApellido.getText());
					cl.setNombre(txtNombre.getText());
					cl.setDireccion(txtDireccion.getText());
					cl.setOcupacion(txtOcupacion.getText());
					cl.setTelefono(txtTelefono.getText());
					cl.setTipo_documento((String) cmbTipoDoc.getSelectedItem());
					cl.setDocumento(txtNumDoc.getText());
					cl.setTipo_pago((String)cmbTipoDePago.getSelectedItem());
					
				}
			}
		});
		btnAceptar.setBounds(308, 273, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(195, 273, 89, 23);
		contentPane.add(btnCancelar);
		
		cmbTipoDePago = new JComboBox();
		cmbTipoDePago.setModel(new DefaultComboBoxModel(new String[] {"Efectivo", "Tarjeta de credito", "Tarjeta de debito"}));
		cmbTipoDePago.setBounds(151, 241, 114, 21);
		contentPane.add(cmbTipoDePago);
		
		txtOcupacion = new JTextField();
		txtOcupacion.setColumns(10);
		txtOcupacion.setBounds(151, 170, 246, 21);
		contentPane.add(txtOcupacion);
		
		lblTipodepago = new JLabel("Tipo de Pago");
		lblTipodepago.setBounds(52, 241, 79, 21);
		contentPane.add(lblTipodepago);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(151, 209, 246, 21);
		contentPane.add(txtTelefono);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setBounds(35, 209, 96, 21);
		contentPane.add(lblTelefono);
	}
}
