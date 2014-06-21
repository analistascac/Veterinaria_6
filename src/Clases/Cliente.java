package Clases;

public class Cliente {
	private String identificador;
	private String nombre;
	private String apellido;
	private String tipo_documento;
	private String documento;
	private String direccion;
	private String ocupacion;
	private String telefono;
	private String email;
	private String tipo_pago;
	
	
	
	public Cliente(String identificador, String nombre, String apellido,
			String tipo_documento, String documento, String direccion,
			String ocupacion, String telefono, String email, String tipo_pago) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipo_documento = tipo_documento;
		this.documento = documento;
		this.direccion = direccion;
		this.ocupacion = ocupacion;
		this.telefono = telefono;
		this.email = email;
		this.tipo_pago = tipo_pago;
	}
	
	public Cliente(){
		identificador = "";
		nombre = "";
		apellido = "";
		tipo_documento = "";
		documento = "";
		direccion = "";
		ocupacion ="";
		telefono = "";
		email = "";
		tipo_pago = "";
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setOcupacion(String ocupacion) {
		this.ocupacion = ocupacion;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTipo_pago(String tipo_pago) {
		this.tipo_pago = tipo_pago;
	}

	@Override
	public String toString() {
		String texto;
		
		texto = "\nidentificador = "+identificador+
				"\nnombre = "+nombre+
				"\napellido = "+apellido+
				"\ntipo_documento = "+tipo_documento+
				"\ndocumento = "+documento+
				"\ndireccion = "+direccion+
				"\nocupacion = "+ocupacion+
				"\ntelefono = "+telefono+
				"\nemail = "+email+
				"\ntipo_pago = "+tipo_pago;
		
		return texto;
	}
	
	
	
	
}
