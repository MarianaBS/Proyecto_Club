package entidades;

import java.util.Date;

public class Cuota {
	
	private int id_cuota;
	private Socio socio;
	private int mes;
	private int anio;
	private Date fecha_vto;
	private Date fecha_pago;
	private float importe;
	
	public int getId_cuota() {
		return id_cuota;
	}
	public void setId_cuota(int id_cuota) {
		this.id_cuota = id_cuota;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public Date getFecha_vto() {
		return fecha_vto;
	}
	public void setFecha_vto(Date fecha_vto) {
		this.fecha_vto = fecha_vto;
	}
	public Date getFecha_pago() {
		return fecha_pago;
	}
	public void setFecha_pago(Date fecha_pago) {
		this.fecha_pago = fecha_pago;
	}
	public float getImporte() {
		return importe;
	}
	public void setImporte(float importe) {
		this.importe = importe;
	}
	
	

}
