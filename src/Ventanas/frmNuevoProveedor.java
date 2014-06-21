// 
// Envia  a la otra capa  : Obejto Proveedor

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
import javax.swing.JList;

import Clases.Auxiliar;
import Clases.Proveedor;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;

public class frmNuevoProveedor extends JFrame {

	private JPanel contentPane;
	private JTextField txtDireccion;
	private JTextField txtTelefono;
	private JLabel lblDireccion;
	private JTextField txtFax;
	private DefaultComboBoxModel tipodoc = null;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private JLabel lblTelefono;
	private JLabel lblFax;
	private JLabel lblCUIT;
	private JTextField txtCUIT;
	private JLabel txtNombre;
	private JTextField txtRazonSocial;
	private JList list_2;
	private JTextField txtEmail;
	
	public frmNuevoProveedor() {
		setTitle("Nuevo Proveedor");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 443, 305);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtDireccion = new JTextField();
		txtDireccion.setColumns(10);
		txtDireccion.setBounds(141, 75, 246, 23);
		contentPane.add(txtDireccion);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(141, 109, 246, 23);
		contentPane.add(txtTelefono);
		
		lblDireccion = new JLabel("Direccion");
		lblDireccion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDireccion.setBounds(55, 77, 72, 21);
		contentPane.add(lblDireccion);
		
		txtFax = new JTextField();
		txtFax.setColumns(10);
		txtFax.setBounds(141, 143, 246, 21);
		contentPane.add(txtFax);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//validaciones
				
				ArrayList<String> errores=new ArrayList<String>();
				if(!Auxiliar.isValidCUIT(txtCUIT.getText()))errores.add("Numero de CUIT invalido.");
				if(!Auxiliar.isValidTelephone(txtTelefono.getText()))errores.add("Numero de Telefono invalido.");
				if(!Auxiliar.isValidTelephone(txtFax.getText()))errores.add("Numero de Fax invalido.");
				if(!Auxiliar.isValidEmail(txtEmail.getText()))errores.add("Email invalido.");
				//si hay errores los muestra
				if(errores.size()>0) JOptionPane.showMessageDialog(null,Auxiliar.contenarArrayList(errores));
				else
				{
					//si no hubo errores,crea el objeto proveedor
					Proveedor pv=new Proveedor();
					pv.setCuit(txtCUIT.getText());
					pv.setEmail(txtEmail.getText());
					pv.setDireccion(txtDireccion.getText());
					pv.setFax(txtFax.getText());
					pv.setTelefono(txtTelefono.getText());
					pv.setRazon_social(txtRazonSocial.getText());
				}
				
				
			}
		});
		btnAceptar.setBounds(267, 233, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(153, 233, 89, 23);
		contentPane.add(btnCancelar);
		
		lblTelefono = new JLabel("Telefono");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setBounds(24, 110, 107, 21);
		contentPane.add(lblTelefono);
		
		lblFax = new JLabel("Fax");
		lblFax.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFax.setBounds(24, 143, 107, 21);
		contentPane.add(lblFax);
		
		lblCUIT = new JLabel("CUIT");
		lblCUIT.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCUIT.setBounds(24, 45, 107, 21);
		contentPane.add(lblCUIT);
		
		txtCUIT = new JTextField();
		txtCUIT.setColumns(10);
		txtCUIT.setBounds(141, 45, 246, 21);
		contentPane.add(txtCUIT);
		
		txtNombre = new JLabel("Razon social");
		txtNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		txtNombre.setBounds(24, 12, 107, 21);
		contentPane.add(txtNombre);
		
		txtRazonSocial = new JTextField();
		txtRazonSocial.setColumns(10);
		txtRazonSocial.setBounds(141, 11, 246, 23);
		contentPane.add(txtRazonSocial);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(141, 172, 246, 21);
		contentPane.add(txtEmail);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setBounds(20, 175, 107, 21);
		contentPane.add(lblEmail);
		
		
	}
}
