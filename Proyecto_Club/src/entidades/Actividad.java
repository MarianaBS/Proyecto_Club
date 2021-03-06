package entidades;

import java.util.ArrayList;

public class Actividad {
	
private int id_actividad;
private String descripcion;
private String estado;
private double costo;
private ArrayList<Horarios_activ> horarios;
private int duracion_min;


public int getDuracion_min() {
	return duracion_min;
}
public void setDuracion_min(int duracion_min) {
	this.duracion_min = duracion_min;
}
public ArrayList<Horarios_activ> getHorarios() {
	return horarios;
}
public void setHorarios(ArrayList<Horarios_activ> horarios) {
	this.horarios = horarios;
}
public int getId_actividad() {
	return id_actividad;
}
public void setId_actividad(int id_actividad) {
	this.id_actividad = id_actividad;
}
public String getDescripcion() {
	return descripcion;
}
public void setDescripcion(String descripcion) {
	this.descripcion = descripcion;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
public double getCosto() {
	return costo;
}
public void setCosto(double costo) {
	this.costo = costo;
}

public Actividad(String desc,String est, double costo, ArrayList<Horarios_activ> h){
	this.setDescripcion(desc);
	this.setEstado(est);
	this.setCosto(costo);
	this.setHorarios(h);                                                                                                                                            
}

public Actividad(){}


}
