package entidades;

import java.util.Date;

public class Carnet {

	private int nro_carnet;
	private String estado;
	private Date fecha_vigencia;
	
	public Date getFecha_vigencia() {
		return fecha_vigencia;
	}
	public void setFecha_vigencia(Date fecha_vigencia) {
		this.fecha_vigencia = fecha_vigencia;
	}
	public int getNro_carnet() {
		return nro_carnet;
	}
	public void setNro_carnet(int nro_carnet) {
		this.nro_carnet = nro_carnet;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
