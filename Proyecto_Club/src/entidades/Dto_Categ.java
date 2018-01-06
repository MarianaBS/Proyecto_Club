package entidades;

import java.util.Date;

public class Dto_Categ {
	
	private int id_dto;
	private Date fecha_validez;
	private float porcentaje;
	
	public int getId_dto() {
		return id_dto;
	}
	public void setId_dto(int id_dto) {
		this.id_dto = id_dto;
	}
	public Date getFecha_validez() {
		return fecha_validez;
	}
	public void setFecha_validez(Date fecha_validez) {
		this.fecha_validez = fecha_validez;
	}
	public float getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(float porcentaje) {
		this.porcentaje = porcentaje;
	}
	
	
	

}
