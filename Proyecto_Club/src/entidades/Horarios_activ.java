package entidades;

import java.sql.Time;
import java.util.Date;

public class Horarios_activ {
	
	private int id_horario_activ;
	private Time hora_ini;
	private String dia_semana;
	private String profesor;
	private Instalacion instalacion;
	
	public int getId_horario_activ() {
		return id_horario_activ;
	}
	public void setId_horario_activ(int id_horario_activ) {
		this.id_horario_activ = id_horario_activ;
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
	public String getProfesor() {
		return profesor;
	}
	public void setProfesor(String profesor) {
		this.profesor = profesor;
	}
	public Instalacion getInstalacion() {
		return instalacion;
	}
	public void setInstalacion(Instalacion instalacion) {
		this.instalacion = instalacion;
	}

}
