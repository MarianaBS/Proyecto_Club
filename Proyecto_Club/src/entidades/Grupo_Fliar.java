package entidades;

import java.util.ArrayList;

public class Grupo_Fliar {
	
	private int idGpo_Fliar;
	private Socio responsable;
	private ArrayList<Socio> integrantes;
	
	public int getIdGpo_Fliar() {
		return idGpo_Fliar;
	}
	public void setIdGpo_Fliar(int idGpo_Fliar) {
		this.idGpo_Fliar = idGpo_Fliar;
	}
	public Socio getResponsable() {
		return responsable;
	}
	public void setResponsable(Socio responsable) {
		this.responsable = responsable;
	}
	public ArrayList<Socio> getIntegrantes() {
		return integrantes;
	}
	public void setIntegrantes(ArrayList<Socio> integrantes) {
		this.integrantes = integrantes;
	}
	
	
	

}
