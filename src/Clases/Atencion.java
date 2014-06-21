package Clases;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Atencion {
	private String identificador;
	private String veterinario;
	private String cliente;
	private String mascota;
	private String tipo_consulta;
	private String diagnostico;
	private String fecha;
	
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	public void setVeterinario(String veterinario) {
		this.veterinario = veterinario;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getIdentificador() {
		return identificador;
	}
	public String getVeterinario() {
		return veterinario;
	}
	public String getCliente() {
		return cliente;
	}
	public String getMascota() {
		return mascota;
	}
	public String getTipo_consulta() {
		return tipo_consulta;
	}
	public String getDiagnostico() {
		return diagnostico;
	}
	public String getFecha() {
		return fecha;
	}
	public void setMascota(String mascota) {
		this.mascota = mascota;
	}
	public void setTipo_consulta(String tipo_consulta) {
		this.tipo_consulta = tipo_consulta;
	}
	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	@Override
	public String toString() {
		String texto;
		
		texto = "Identificador = "+identificador+
				"\nVeterinario = "+veterinario+
				"\nCliente = "+cliente+
				"\nMascota = "+mascota+
				"\nTipo de consulta = "+tipo_consulta+
				"\nDiagnostico = "+diagnostico+
				"\nFecha = "+fecha;

		return texto;
	}
	
	
}
