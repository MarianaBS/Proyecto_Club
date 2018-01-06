package entidades;

import java.util.Date;

public class Costo_Cuotas {

	private int id_costo_cuota;
	private Date fecha_validez;
	private double valor;
	
	public int getId_costo_cuota() {
		return id_costo_cuota;
	}
	public void setId_costo_cuota(int id_costo_cuota) {
		this.id_costo_cuota = id_costo_cuota;
	}
	public Date getFecha_validez() {
		return fecha_validez;
	}
	public void setFecha_validez(Date fecha_validez) {
		this.fecha_validez = fecha_validez;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
