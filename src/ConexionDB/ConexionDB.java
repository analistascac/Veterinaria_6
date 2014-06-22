package ConexionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.Iterator;

import Clases.Cliente;
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
		
		@SuppressWarnings("rawtypes")
		public ArrayList devolverClientes (){

			ArrayList<Cliente> a_Cliente = new ArrayList();
			
			try {
				CallableStatement cs = con.prepareCall("{call sp_return_clientes()}");
				rs = cs.executeQuery();
				while (rs.next()){
					Cliente p = new Cliente();
					p.setIdCliente(rs.getString(1));
					p.setNombre(rs.getString(2));
					p.setApellido(rs.getString(3));
					p.setTipoDocumento(rs.getString(4));
					p.setDocumento(rs.getString(5));
					p.setDireccionCompleta(rs.getString(6));
					p.setOcupacion(rs.getString(7));
					p.setTelefono(rs.getString(8));
					p.setDireccionMail(rs.getString(9));
					p.setTipoCuenta(rs.getString(10));
					a_Cliente.add(p);
				}
			} catch (SQLException e) {
				System.out.println(e.getStackTrace());
			}
			return a_Cliente;
			
		}
		
		@SuppressWarnings("rawtypes")
		public ArrayList devolverProveedores (){
			
			ArrayList<Proveedor> a_Proveedor = new ArrayList();
			
			try {
				CallableStatement cs = con.prepareCall("{call sp_return_proveedores}");
				rs = cs.executeQuery();
				while (rs.next()){
					Proveedor p = new Proveedor();
					p.setIdProveedor(Integer.valueOf(rs.getString(1)));
					p.setRazonSocial(rs.getString(2));
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
		
		@SuppressWarnings("rawtypes")
		public ArrayList devolverProductos (){
			
			ArrayList<Articulo> a_Producto = new ArrayList();
			
			try {
				CallableStatement cs = con.prepareCall("{call sp_return_productos}");
				rs = cs.executeQuery();
				while (rs.next()){
					Articulo a = new Articulo();
					a.setIdArticulo(Integer.valueOf(rs.getString(1)));
					a.setNombre(rs.getString(2));
					a.setMedida(rs.getString(3));
					a.setNombreCientifico(rs.getString(4));
					a.setNombreVulgar(rs.getString(5));
					a.setDescripcion(rs.getString(6));
					a.setPrecioVenta(Float.valueOf(rs.getString(7)));
					a.setCantidad(Integer.valueOf(rs.getString(8)));
					a_Producto.add(a);
				}
			} catch (SQLException e) {
				System.out.println(e.getStackTrace());
			}
			
			return a_Producto;
		}
		
		@SuppressWarnings("rawtypes")
		public ArrayList devolverVeterinarios (){
		
			ArrayList<Empleado> a_Veterinario = new ArrayList();
			
			try {
				CallableStatement cs = con.prepareCall("{call sp_return_veterinarios}");
				rs = cs.executeQuery();
				while (rs.next()){
					Empleado v = new Empleado();
					v.setIdEmpleado(Integer.valueOf(rs.getString(1)));
					v.setNombre(rs.getString(2));
					v.setApellido(rs.getString(3));
					v.setTipoDocumento(rs.getString(4));
					v.setDocumento(rs.getString(5));
					v.setDireccionCompleta(rs.getString(6));
					v.setTelefono(rs.getString(7));
					v.setDireccionMail(rs.getString(8));
					v.setMatricula(rs.getString(9));
					a_Veterinario.add(v);
				}
			} catch (SQLException e) {
				System.out.println(e.getStackTrace());
			}
			
			return a_Veterinario;
		}

		@SuppressWarnings("rawtypes")
		public ArrayList devolverEmpleados(){
		
			ArrayList<Empleado> a_Empleado = new ArrayList();
			
			try {
				CallableStatement cs = con.prepareCall("{call sp_return_empleados}");
				rs = cs.executeQuery();
				while (rs.next()){
					Empleado e = new Empleado();
					e.setIdEmpleado(Integer.valueOf(rs.getString(1)));
					e.setNombre(rs.getString(2));
					e.setApellido(rs.getString(3));
					e.setTipoDocumento(rs.getString(4));
					e.setDocumento(rs.getString(5));
					e.setDireccionCompleta(rs.getString(6));
					e.setTelefono(rs.getString(7));
					e.setFechaNacimiento(rs.getString(8));
					e.setDireccionMail(rs.getString(9));
					a_Empleado.add(e);
				}
			} catch (SQLException e){
				System.out.println(e.getStackTrace());
			}
			
			return a_Empleado;
		}

		@SuppressWarnings("rawtypes")
		public ArrayList devolverClienteMascotas(){
		
			ArrayList<Mascota> a_ClienteMascota = new ArrayList();
			
			try{
				CallableStatement cs = con.prepareCall("{call sp_return_cliente_mascotas}");
				rs = cs.executeQuery();
				while(rs.next()){
					Mascota m = new Mascota();
					m.setIdMascota(Integer.valueOf(rs.getString(1)));
					m.setNombreCientifico(rs.getString(2));
					m.setNombreVulgar(rs.getString(3));
					m.setDescripcion(rs.getString(4));
					m.setIdCliente(Integer.valueOf(rs.getString(5)));
					m.setNombreCliente(rs.getString(6));
					m.setApellidoCliente(rs.getString(7));
					a_ClienteMascota.add(m);
				}
			} catch(SQLException e){
				System.out.println(e.getStackTrace());
			}
			
			return a_ClienteMascota;
		}
		
		public void altaEmpleado(Empleado em) throws insertDBException{
			
			try {
				CallableStatement cs = con.prepareCall("{call sp_insert_empleado(?,?,?,?,?,?,?,?)}");
				cs.setString(1, em.getNombre());
				cs.setString(2, em.getApellido());
				cs.setString(3, em.getTipoDocumento());
				cs.setString(4, em.getDocumento());
				cs.setString(5, em.getDireccionCompleta());
				cs.setString(6, em.getTelefono());
				cs.setString(7, em.getFechaNacimiento());
				cs.setString(8, em.getMatricula());
				int i = cs.executeUpdate();
				if(i<=0){
					throw new insertDBException("Error al querer ingresar un registro");
				}
			} catch (SQLException e){
				System.out.println(e.getMessage());
			}
		}
		
		public void altaCliente(Cliente c) throws insertDBException{
			
			try{
				CallableStatement cs = con.prepareCall("{call sp_insert_cliente(?,?,?,?,?,?,?,?,?)}");
				cs.setString(1, c.getNombre());
				cs.setString(2, c.getApellido());
				cs.setString(3, c.getTipoDocumento());
				cs.setString(4, c.getDocumento());
				cs.setString(5, c.getDireccionCompleta());
				cs.setString(6, c.getOcupacion());
				cs.setString(7, c.getTelefono());
				cs.setString(8, c.getDireccionMail());
				cs.setString(9, c.getTipoCuenta());
				int i = cs.executeUpdate();	
				System.out.println("i: " + i);
				if(i<=0){
					throw new insertDBException("Error al querer ingresar un registro");
				}
				
			} catch (SQLException e) {
				System.out.println( e.getMessage());
			}
			
		}

		public void altaClienteMascota(Mascota m) throws insertDBException{
			
			try {
				CallableStatement cs = con.prepareCall("{call sp_insert_mascota(?,?,?,?)}");
				cs.setString(1, m.getNombreCientifico());
				cs.setString(2, m.getNombreVulgar());
				cs.setString(3, m.getDescripcion());
				cs.setString(4, String.valueOf(m.getIdCliente()));
				int i = cs.executeUpdate();
				if(i<=0){
					throw new insertDBException("Error al querer ingresar un registro");
				}
			} catch (SQLException e){
				System.out.println( e.getMessage());
			}
		}
		
		public void altaProveedor(Proveedor p) throws insertDBException{
			
			try {
				CallableStatement cs = con.prepareCall("{call sp_insert_proveedor(?,?,?,?,?,?,?)}");
				cs.setString(1, p.getRazonSocial());
				cs.setString(2, p.getCuit());
				cs.setString(3, p.getDireccion());
				cs.setString(4, p.getTelefono());
				cs.setString(5, p.getFax());
				cs.setString(6, p.getEmail());
				cs.setString(7, p.getFechaUltimaCompra());
				int i = cs.executeUpdate();
				if(i<=0){
					throw new insertDBException("Error al querer ingresar un registro");
				}
			} catch (SQLException e){
				System.out.println(e.getStackTrace());
			}
		}
		
		public void altaArticulo(Articulo ar) throws insertDBException{
			
			try {
				CallableStatement cs = con.prepareCall("{call sp_insert_articulo}");
			} catch (SQLException e){
				System.out.println(e.getStackTrace());
			}
		}
		
		public void altaAtencion(Atencion at) throws insertDBException{
			
			try {
				CallableStatement cs = con.prepareCall("{call sp_insert_atencion(?,?,?,?)}");
				cs.setString(1, String.valueOf(at.getIdVeterinario()));
				cs.setString(2, String.valueOf(at.getIdMascota()));
				cs.setString(3, at.getTipoConsulta());
				cs.setString(4, at.getDescripcion());
				int i = cs.executeUpdate();
				if(i<=0){
					throw new insertDBException("Error al querer ingresar un registro");
				}
			} catch (SQLException e){
				System.out.println(e.getStackTrace());
			}
		}
		
		public void altaVenta(ArrayList<Ventas> v) throws insertDBException{
			
			try {
				
				CallableStatement cs_ = con.prepareCall("{call sp_insert_log_ventas(?,?,?,?,?,?,?,?,?)}");
				Iterator<Ventas> it = v.iterator();
				Ventas tmp;
				while(it.hasNext()){
					tmp = it.next();
					cs_.setString(1, tmp.getTipoFactura());
					cs_.setString(2, String.valueOf(tmp.getIdCliente()));
					cs_.setString(3, String.valueOf(tmp.getIdEmpleado()));
					cs_.setString(4, String.valueOf(tmp.getIdArticulo()));
					cs_.setString(5, String.valueOf(tmp.getIdProveedor()));
					cs_.setString(6, String.valueOf(tmp.getCantidad()));
					cs_.setString(7, String.valueOf(tmp.getPrecio()));
					cs_.setString(8, tmp.getFecha());
					cs_.setString(9, tmp.getEstadoOperacion());
					int j = cs_.executeUpdate();
					if(j<=0){
						throw new insertDBException("Error al querer ingresar un registro");
					}
				}
				cs_.close();
				
				CallableStatement cs = con.prepareCall("{call sp_insert_compra_cliente}");
				int i = cs.executeUpdate();
				if(i<=0){
					throw new insertDBException("Error al querer ingresar un registro");
				}
				cs.close();
				
				/*CallableStatement cs_2 = con.prepareCall("{call sp_insert_compra_cliente_detalle}");
				int k = cs.executeUpdate();
				if(k<=0){
					throw new insertDBException("Error al querer ingresar un registro");
				}
				cs_2.close();*/
				
			} catch (SQLException e){
				System.out.println(e.getStackTrace());
				System.out.println(e.getMessage());
				System.out.println(e.getErrorCode());
				System.out.println(e.getNextException());
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


