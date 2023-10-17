package pkg;

public class Movimiento {
	private double importe;
	private TipoSigno tipo;
	private String detalle;
	
	public Movimiento(double importe, TipoSigno tipo, String detalle)
	{
		this.detalle=detalle;
		this.importe=importe;
		this.setTipo(tipo);
	}
	
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}

	public TipoSigno getTipo() {
		return tipo;
	}

	public void setTipo(TipoSigno tipo) {
		this.tipo = tipo;
	}
}
enum TipoSigno {
    D, H;
}