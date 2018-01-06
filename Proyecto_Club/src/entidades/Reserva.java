package entidades;

import java.sql.Time;
import java.util.Date;

public class Reserva {
	
	private int id_reserva;
	private Date feha_reserva;
	private Time hora_ini;
	private Time hora_fin;
	private Socio socio;
	private Actividad activ;
	private String estado;
	
	public int getId_reserva() {
		return id_reserva;
	}
	public void setId_reserva(int id_reserva) {
		this.id_reserva = id_reserva;
	}
	public Date getFeha_reserva() {
		return feha_reserva;
	}
	public void setFeha_reserva(Date feha_reserva) {
		this.feha_reserva = feha_reserva;
	}
	public Time getHora_ini() {
		return hora_ini;
	}
	public void setHora_ini(Time hora_ini) {
		this.hora_ini = hora_ini;
	}
	public Time getHora_fin() {
		return hora_fin;
	}
	public void setHora_fin(Time hora_fin) {
		this.hora_fin = hora_fin;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Actividad getActiv() {
		return activ;
	}
	public void setActiv(Actividad activ) {
		this.activ = activ;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	

}
