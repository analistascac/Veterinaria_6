package Clases;

public class Proveedor {
	private String identificador;
	private String razon_social;
	private String cuit;
	private String direccion;
	private String telefono;
	private String fax;
	private String email;
	private String fechaUltimaCompra;
	
	
	public Proveedor(){
		identificador= "";
		razon_social= "";
		cuit= "";
		direccion= "";
		telefono= "";
		fax= "";
		email= "";
	}
	
	public String toString(){
		String texto;
		texto = "identificador = "+ identificador +
				"\n razon_social = "+ razon_social +
				"\n cuit = "+ cuit +
				"\n direccion = "+ direccion +
				"\n telefono = "+ telefono +
				"\n fax = "+ fax +
				"\n email = "+ email;
		return texto;
	}

	public String getFechaUltimaCompra() {
		return fechaUltimaCompra;
	}

	public void setFechaUltimaCompra(String fechaUltimaCompra) {
		this.fechaUltimaCompra = fechaUltimaCompra;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public void setRazon_social(String razon_social) {
		this.razon_social = razon_social;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
