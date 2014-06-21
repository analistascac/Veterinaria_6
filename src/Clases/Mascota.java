package Clases;

public class Mascota {
	private String identificador;
	private String dueno;
	private String nombre_cientifico;
	private String nombre_vulgar;
	private String descripcion;
	
	public Mascota(){
		identificador = "";
		dueno = "";
		nombre_cientifico = "";
		nombre_vulgar = "";
		descripcion ="";
	}

	@Override
	public String toString() {
		return "Mascota [identificador=" + identificador + ",\ndueno=" + dueno
				+ ",\nnombre_cientifico=" + nombre_cientifico
				+ ",\nnombre_vulgar=" + nombre_vulgar + ",\ndescripcion="
				+ descripcion + "]";
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}

	public String getDueno() {
		return dueno;
	}

	public void setDueno(String dueno) {
		this.dueno = dueno;
	}

	public String getNombre_cientifico() {
		return nombre_cientifico;
	}

	public void setNombre_cientifico(String nombre_cientifico) {
		this.nombre_cientifico = nombre_cientifico;
	}

	public String getNombre_vulgar() {
		return nombre_vulgar;
	}

	public void setNombre_vulgar(String nombre_vulgar) {
		this.nombre_vulgar = nombre_vulgar;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
	
	
}
