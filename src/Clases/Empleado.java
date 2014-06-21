package Clases;

public class Empleado {
	private String identificador;
	private String apellido;
	private String nombre;
	private String tipo_doc;
	private String doc;
	private String domicilio;
	private String telefono;
	private String fecha_nacimiento;
	private String matricula;
	private String email;
	


	public Empleado(){
		identificador = "";
		apellido = "";
		nombre = "";
		tipo_doc = "";
		doc = "";
		domicilio = "";
		telefono = "";
		fecha_nacimiento = "";
		matricula = "";
	}
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setTipo_doc(String tipo_doc) {
		this.tipo_doc = tipo_doc;
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public void setDoc(String doc) {
		this.doc = doc;
	}
	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getIdentificador() {
		return identificador;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public String getTipo_doc() {
		return tipo_doc;
	}

	public String getDoc() {
		return doc;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public String getTelefono() {
		return telefono;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public String getMatricula() {
		return matricula;
	}

	public String toString(){
		String texto;
		
		texto = "identificador = "+ identificador +
				"\napellido = "+ apellido +
				"\nnombre = "+ nombre +
				"\ntipo_doc = "+ tipo_doc +
				"\ndoc = "+ doc +
				"\ndomicilio = "+ domicilio +
				"\ntelefono = "+ telefono +
				"\nfecha_nacimiento = "+ fecha_nacimiento +
				"\nmatricula = "+ matricula;
		
		return texto;
	}
	
}


