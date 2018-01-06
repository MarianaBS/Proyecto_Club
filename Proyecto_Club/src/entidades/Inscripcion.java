package entidades;

import java.sql.Time;
import java.util.Date;

public class Inscripcion {

	private int id_inscripcion;
	private Socio socio;
	private Actividad actividad;
	private Time hora_ini;
	private String dia_semana;
	private String estado;
	private Date fecha_insc;
	
	
	public Date getFecha_insc() {
		return fecha_insc;
	}
	public void setFecha_insc(Date fecha_insc) {
		this.fecha_insc = fecha_insc;
	}
	public int getId_inscripcion() {
		return id_inscripcion;
	}
	public void setId_inscripcion(int id_inscripcion) {
		this.id_inscripcion = id_inscripcion;
	}
	public Socio getSocio() {
		return socio;
	}
	public void setSocio(Socio socio) {
		this.socio = socio;
	}
	public Actividad getActividad() {
		return actividad;
	}
	public void setActividad(Actividad actividad) {
		this.actividad = actividad;
	}
	public Time getHora_ini() {
		return hora_ini;
	}
	public void setHora_ini(Time hora_ini) {
		this.hora_ini = hora_ini;
	}
	public String getDia_semana() {
		return dia_semana;
	}
	public void setDia_semana(String dia_semana) {
		this.dia_semana = dia_semana;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
