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
import Clases.Empleado;
import Main.Main;
import Main.TFecha;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class frmNuevoEmpleado extends JFrame {

	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JLabel lblTipoDoc;
	private JLabel lblNumeroDoc;
	private JTextField txtNumDoc;
	private JLabel lblDomicilio;
	private JTextField txtDomicilio;
	private JTextField txtMatricula;
	private JLabel lblFecha;
	private JLabel lblDia;
	private JLabel lblMes;
	private JLabel lblAnio;
	private DefaultComboBoxModel tipodoc = null;
	private JComboBox cmbDia;
	private JComboBox cmbMes;
	private JComboBox cmbAnio;
	private JComboBox cmbTipoDoc;
	private JCheckBox chkVeterinario;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private TFecha fecha;
	private JLabel lvlEmail;
	private JTextField txtEmail;
	private JTextField txtTelefono;
	private JLabel lblTelefono;
	
	@SuppressWarnings("rawtypes")
	public frmNuevoEmpleado() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
				Main v = new Main();
				v.setVisible(true);
				dispose();
			}
		});
		setResizable(false);
		setTitle("Nuevo Empleado - Veterinaria CAC");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 417, 379);
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
		
		lblDomicilio = new JLabel("Domicilio:");
		lblDomicilio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDomicilio.setBounds(35, 134, 96, 21);
		contentPane.add(lblDomicilio);
		
		lblFecha = new JLabel("Fecha de nacimiento");
		lblFecha.setBounds(20, 223, 131, 21);
		contentPane.add(lblFecha);
		
		lblDia = new JLabel("Dia");
		lblDia.setBounds(20, 245, 23, 21);
		contentPane.add(lblDia);
		
		lblMes = new JLabel("Mes");
		lblMes.setBounds(150, 245, 23, 21);
		contentPane.add(lblMes);
		
		lblAnio = new JLabel("A\u00F1o");
		lblAnio.setBounds(282, 245, 23, 21);
		contentPane.add(lblAnio);
		
		lvlEmail = new JLabel("Email:");
		lvlEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lvlEmail.setBounds(35, 166, 96, 21);
		contentPane.add(lvlEmail);
		
		lblTelefono = new JLabel("Telefono:");
		lblTelefono.setHorizontalAlignment(SwingConstants.RIGHT);
		lblTelefono.setBounds(35, 198, 96, 21);
		contentPane.add(lblTelefono);
		
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
		
		txtDomicilio = new JTextField();
		txtDomicilio.setColumns(10);
		txtDomicilio.setBounds(151, 136, 246, 21);
		contentPane.add(txtDomicilio);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(151, 168, 246, 21);
		contentPane.add(txtEmail);
		
		cmbDia = new JComboBox();
		cmbDia.setBounds(45, 245, 82, 21);
		contentPane.add(cmbDia);
		
		cmbMes = new JComboBox();
		cmbMes.setBounds(183, 245, 82, 21);
		contentPane.add(cmbMes);
		
		cmbAnio = new JComboBox();
		cmbAnio.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				
			}
		});
		cmbAnio.setBounds(315, 245, 82, 21);
		contentPane.add(cmbAnio);
		
		fecha = new TFecha(cmbDia,cmbMes, cmbAnio);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ArrayList<String> errores=new ArrayList<String>();
				if(!Auxiliar.isValidDNI(txtNumDoc.getText()))errores.add("Numero de documento invalido.");
				if(!Auxiliar.isValidDNI(txtMatricula.getText())&&chkVeterinario.isSelected())errores.add("Numero de Matricula invalido.");
				
				if(errores.size()>0){
					JOptionPane.showMessageDialog(null,Auxiliar.contenarArrayList(errores));
				}else{
					Empleado emp = new Empleado();
					emp.setApellido(txtApellido.getText());
					emp.setDoc(txtNumDoc.getText());
					emp.setDomicilio(txtDomicilio.getText());
					emp.setEmail(txtEmail.getText());
					emp.setFecha_nacimiento(fecha.getFechaString());
					emp.setMatricula(txtMatricula.getText());
					emp.setNombre(txtNombre.getText());
					emp.setTelefono(txtTelefono.getText());
					emp.setTipo_doc((String)cmbTipoDoc.getSelectedItem());
					
					JOptionPane.showMessageDialog(null, emp.toString(),"Informacion",JOptionPane.INFORMATION_MESSAGE);
					
				}
			}
		});
		
		chkVeterinario = new JCheckBox("Matricula de Veterinario");
		chkVeterinario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				if(chkVeterinario.isSelected()){
					txtMatricula.setEnabled(true);
				}else{
					txtMatricula.setEnabled(false);
					txtMatricula.setText("");
				}
				
			}
		});
		chkVeterinario.setBounds(16, 276, 139, 23);
		contentPane.add(chkVeterinario);
		
		txtMatricula = new JTextField();
		txtMatricula.setEnabled(false);
		txtMatricula.setColumns(10);
		txtMatricula.setBounds(160, 277, 237, 21);
		contentPane.add(txtMatricula);
		btnAceptar.setBounds(308, 309, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(202, 309, 89, 23);
		contentPane.add(btnCancelar);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		txtTelefono.setBounds(151, 200, 246, 21);
		contentPane.add(txtTelefono);
		
		
	}
}
