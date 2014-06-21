// Necesita Lista de Proveedores
// Envia  a la otra capa  : ObejtoMascotaEnVenta , Cantidad,  

package Ventanas;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class frmNuevaVenta extends JFrame {

	private JPanel contentPane;
	private JLabel lblEspecie;
	private JLabel lblDescripcion;
	private DefaultComboBoxModel tipodoc = null;
	private JButton btnCancelar;
	private JButton btnAceptar;
	private JLabel lblPrecioCosto;
	private JLabel lblPrecioDeVenta;
	private JLabel lblCantidad;
	private JTextField txtCant1;
	private JList list_2;
	private JTextField txtCant2;
	private JTextField txtCant3;
	private JLabel lblProveedor;
	private JComboBox cmbProducto1;
	private JComboBox cmbProducto3;
	private JComboBox cmbProducto2;
	private JLabel lblPrecio;
	private JLabel label_6;
	private JLabel label_7;
	private JButton btnEliminar;
	private JButton btnLimpiar;
	private JButton btnLimpiar_1;
	private JLabel label_4;
	private JLabel label_3;
	private JLabel lblCant;
	private JLabel label_5;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JTextArea txtDescripcion2;
	private JTextArea txtDescripcion1;
	private JTextArea txtDescripcion3;
	
	
	@SuppressWarnings("rawtypes")
	public frmNuevaVenta() {
		setTitle("Nueva Venta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 703, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblEspecie = new JLabel("Stock");
		lblEspecie.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEspecie.setBounds(459, 7, 34, 27);
		contentPane.add(lblEspecie);
		
		cmbProducto2 = new JComboBox();
		cmbProducto2.setBounds(126, 79, 107, 23);
		contentPane.add(cmbProducto2);
		
		lblDescripcion = new JLabel("Descripcion");
		lblDescripcion.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDescripcion.setBounds(247, 10, 72, 21);
		contentPane.add(lblDescripcion);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				
			}
		});
		btnAceptar.setBounds(588, 206, 89, 23);
		contentPane.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(459, 206, 89, 23);
		contentPane.add(btnCancelar);
		
		lblPrecioCosto = new JLabel(" TOTAL : $");
		lblPrecioCosto.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecioCosto.setBounds(513, 162, 107, 21);
		contentPane.add(lblPrecioCosto);
		
		lblPrecioDeVenta = new JLabel("subtotal");
		lblPrecioDeVenta.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecioDeVenta.setBounds(607, 8, 48, 24);
		contentPane.add(lblPrecioDeVenta);
		
		lblProveedor = new JLabel("Producto");
		lblProveedor.setHorizontalAlignment(SwingConstants.RIGHT);
		lblProveedor.setBounds(89, 10, 71, 21);
		contentPane.add(lblProveedor);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCantidad.setBounds(372, 4, 79, 27);
		contentPane.add(lblCantidad);
		
		txtCant1 = new JTextField();
		txtCant1.setColumns(10);
		txtCant1.setBounds(416, 43, 34, 21);
		contentPane.add(txtCant1);
		
		cmbProducto3 = new JComboBox();
		cmbProducto3.setBounds(126, 108, 107, 21);
		contentPane.add(cmbProducto3);
		
		txtCant2 = new JTextField();
		txtCant2.setColumns(10);
		txtCant2.setBounds(416, 76, 34, 21);
		contentPane.add(txtCant2);
		
		txtCant3 = new JTextField();
		txtCant3.setColumns(10);
		txtCant3.setBounds(416, 111, 34, 21);
		contentPane.add(txtCant3);
		
		label = new JLabel("$");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setBounds(648, 39, 17, 28);
		contentPane.add(label);
		
		label_1 = new JLabel("$");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setBounds(648, 78, 17, 24);
		contentPane.add(label_1);
		
		label_2 = new JLabel("$");
		label_2.setHorizontalAlignment(SwingConstants.RIGHT);
		label_2.setBounds(648, 106, 17, 24);
		contentPane.add(label_2);
		
		lblCant = new JLabel("cant");
		lblCant.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCant.setBounds(459, 42, 34, 23);
		contentPane.add(lblCant);
		
		label_3 = new JLabel("cant");
		label_3.setHorizontalAlignment(SwingConstants.RIGHT);
		label_3.setBounds(459, 79, 34, 23);
		contentPane.add(label_3);
		
		label_4 = new JLabel("cant");
		label_4.setHorizontalAlignment(SwingConstants.RIGHT);
		label_4.setBounds(459, 105, 34, 27);
		contentPane.add(label_4);
		
		cmbProducto1 = new JComboBox();
		cmbProducto1.setBounds(126, 42, 107, 23);
		contentPane.add(cmbProducto1);
		
		btnEliminar = new JButton("Limpiar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDescripcion1.setText("");
				txtCant1.setText("");
			}
		});
		btnEliminar.setBounds(27, 42, 89, 23);
		contentPane.add(btnEliminar);
		
		btnLimpiar = new JButton("Limpiar");
		btnLimpiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			txtDescripcion2.setText("");
			txtCant2.setText("");
			}
		});
		btnLimpiar.setBounds(27, 79, 89, 23);
		contentPane.add(btnLimpiar);
		
		btnLimpiar_1 = new JButton("Limpiar");
		btnLimpiar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				txtDescripcion3.setText("");
				txtCant3.setText("");
			}
		});
		btnLimpiar_1.setBounds(27, 107, 89, 23);
		contentPane.add(btnLimpiar_1);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPrecio.setBounds(553, 7, 34, 27);
		contentPane.add(lblPrecio);
		
		label_5 = new JLabel("$");
		label_5.setHorizontalAlignment(SwingConstants.RIGHT);
		label_5.setBounds(563, 46, 24, 27);
		contentPane.add(label_5);
		
		label_6 = new JLabel("$");
		label_6.setHorizontalAlignment(SwingConstants.RIGHT);
		label_6.setBounds(553, 76, 38, 28);
		contentPane.add(label_6);
		
		label_7 = new JLabel("$");
		label_7.setHorizontalAlignment(SwingConstants.RIGHT);
		label_7.setBounds(563, 111, 28, 28);
		contentPane.add(label_7);
		
		txtDescripcion1 = new JTextArea();
		txtDescripcion1.setBounds(257, 41, 130, 28);
		contentPane.add(txtDescripcion1);
		
		txtDescripcion3 = new JTextArea();
		txtDescripcion3.setBounds(257, 113, 130, 28);
		contentPane.add(txtDescripcion3);
		
		txtDescripcion2 = new JTextArea();
		txtDescripcion2.setBounds(257, 78, 130, 28);
		contentPane.add(txtDescripcion2);
		
		
	}
}
