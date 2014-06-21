package Clases;

public class Venta {
	private String tipo_factura;
	private String numero_factura;
	private String fecha;
	private String cliente;
	private String vendedor;
	private int importe_total;
	private String detalle;
	private String estado_operacion; 
	
	public Venta(){
		tipo_factura = "";
		numero_factura = "";
		fecha = "";
		cliente = "";
		vendedor = "";
		importe_total = 0;
		detalle = "";
		estado_operacion = "";
	}

	public String getTipo_factura() {
		return tipo_factura;
	}

	public void setTipo_factura(String tipo_factura) {
		this.tipo_factura = tipo_factura;
	}

	public String getNumero_factura() {
		return numero_factura;
	}

	public void setNumero_factura(String numero_factura) {
		this.numero_factura = numero_factura;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getVendedor() {
		return vendedor;
	}

	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}

	public int getImporte_total() {
		return importe_total;
	}

	public void setImporte_total(int importe_total) {
		this.importe_total = importe_total;
	}

	public String getDetalle() {
		return detalle;
	}

	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public String getEstado_operacion() {
		return estado_operacion;
	}

	public void setEstado_operacion(String estado_operacion) {
		this.estado_operacion = estado_operacion;
	}

	@Override
	public String toString() {
		return "Venta [tipo_factura=" + tipo_factura + ", \nnumero_factura="
				+ numero_factura + ", \nfecha=" + fecha + ", \ncliente=" + cliente
				+ ", \nvendedor=" + vendedor + ", \nimporte_total=" + importe_total
				+ ", \ndetalle=" + detalle + ", \nestado_operacion="
				+ estado_operacion + "]";
	}
	
	
}
