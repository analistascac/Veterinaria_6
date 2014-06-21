package ConexionDB;

import java.sql.*;
import java.util.ArrayList;

import Clases.Cliente;
import Clases.Empleado;
import Clases.Producto;
import Clases.Proveedor;


public class ConexionDB {

		String url = "jdbc:sqlserver://SUBZERO:1433"+";databaseName=db_Veterinaria"; 
		Connection con ;
		Statement select;
		Statement st;
		ResultSet rs;
		String user = "sa";
		String pass = "sa";

		public ConexionDB () {

		}

		public boolean conectarDB() {

	        try {
	    		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
				con = DriverManager.getConnection(url,user,pass);
	        } catch (ClassNotFoundException e){
	        	e.printStackTrace();
	        	return false;
	        } catch (SQLException e) {
	        	e.printStackTrace();
	        	return false;
	        }

	        if (con != null){
	        	return true;
	        } else
	        	return false;

		}

		public ArrayList devolverClientes (){

			ArrayList<Cliente> a_Cliente = new ArrayList();

			try {
				CallableStatement cs = con.prepareCall("{call sp_return_clientes()}");
				rs = cs.executeQuery();
				while (rs.next()){
					Cliente p = new Cliente();
					p.setNombre(rs.getString(2));
					p.setApellido(rs.getString(3));
					p.setTipo_documento(rs.getString(4));
					p.setDocumento(rs.getString(5));
					p.setDireccion(rs.getString(6));
					p.setOcupacion(rs.getString(7));
					p.setTelefono(rs.getString(8));
					p.setEmail(rs.getString(9));
					p.setTipo_pago(rs.getString(10));
					a_Cliente.add(p);
				}
			} catch (SQLException e) {
				System.out.println(e.getStackTrace());
			}
			return a_Cliente;

		}

		public ArrayList devolverProveedores (){

			ArrayList<Proveedor> a_Proveedor = new ArrayList();

			try {
				CallableStatement cs = con.prepareCall("{call sp_return_proveedores}");
				rs = cs.executeQuery();
				while (rs.next()){
					Proveedor p = new Proveedor();
					p.setRazon_social(rs.getString(2));
					p.setCuit(rs.getString(3));
					p.setDireccion(rs.getString(4));
					p.setTelefono(rs.getString(5));
					p.setFax(rs.getString(6));
					p.setEmail(rs.getString(7));
					p.setFechaUltimaCompra(rs.getString(8));
					a_Proveedor.add(p);
				}
			} catch (SQLException e){
				System.out.println(e.getStackTrace());
			}

			return a_Proveedor;
		}

		public ArrayList devolverProductos (){

			ArrayList<Producto> a_Producto = new ArrayList();

			try {
				CallableStatement cs = con.prepareCall("{call sp_return_productos}");
				rs = cs.executeQuery();
				while (rs.next()){
					Producto a = new Producto();
					a.setNombre(rs.getString(2));
					a.setMedida(rs.getString(3));
					a.setNombre_cientifico(rs.getString(4));
					a.setNombre_vulgar(rs.getString(5));
					a.setDescripcion(rs.getString(6));
					a.setPrecio_venta(Float.valueOf(rs.getString(7)));
					a.setCantidad(Integer.valueOf(rs.getString(8)));
					a_Producto.add(a);
				}
			} catch (SQLException e) {
				System.out.println(e.getStackTrace());
			}

			return a_Producto;
		}

		public ArrayList devolverVeterinarios (){

			ArrayList<Empleado> a_Veterinario = new ArrayList();

			try {
				CallableStatement cs = con.prepareCall("{call sp_return_veterinarios}");
				rs = cs.executeQuery();
				while (rs.next()){
					Empleado v = new Empleado();
					v.setNombre(rs.getString(2));
					v.setApellido(rs.getString(3));
					v.setTipo_doc(rs.getString(4));
					v.setDoc(rs.getString(5));
					v.setDomicilio(rs.getString(6));
					v.setTelefono(rs.getString(7));
					v.setEmail(rs.getString(8));
					v.setMatricula(rs.getString(9));
					a_Veterinario.add(v);
				}
			} catch (SQLException e) {
				System.out.println(e.getStackTrace());
			}

			return a_Veterinario;
		}

		public void altaCliente(Cliente c) throws insertDBException{

			int i=0;

			try{
				CallableStatement cs = con.prepareCall("{call sp_insert_cliente(?,?,?,?,?,?,?,?,?)}");
				cs.setString(1, c.getNombre());
				//System.out.println(c.getNombre());
				cs.setString(2, c.getApellido());
				//System.out.println(c.getApellido());
				cs.setString(3, c.getTipoDocumento());
				//System.out.println(c.getTipoDocumento());
				cs.setString(4, c.getDocumento());
				//System.out.println(c.getDocumento());
				cs.setString(5, c.getDireccionCompleta());
				//System.out.println(c.getDireccionCompleta());
				cs.setString(6, c.getOcupacion());
				//System.out.println(c.getOcupacion());
				cs.setString(7, c.getTelefono());
				//System.out.println(c.getTelefono());
				cs.setString(8, c.getDireccionMail());
				//System.out.println(c.getDireccionMail());
				cs.setString(9, c.getTipoCuenta());
				//System.out.println(c.getTipoCuenta());
				i = cs.executeUpdate();	
				if(i<=0){
					throw new insertDBException("Error al querer ingresar un registro");
				}

			} catch (SQLException e) {
				System.out.println(e.getStackTrace());
			}

		}

		public void cerrarBusqueda(){
			try {
				rs.close();
				select.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
