package entidades;

import java.util.ArrayList;
import java.util.Date;

public class Categoria {
	private int id_categoria;
	private String descripcion_cat;
	private Date fecha_baja;
	private ArrayList<Dto_Categ> descuentos;
	
	public ArrayList<Dto_Categ> getDescuentos() {
		return descuentos;
	}
	public void setDescuentos(ArrayList<Dto_Categ> descuentos) {
		this.descuentos = descuentos;
	}
	public int getId_categoria() {
		return id_categoria;
	}
	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}
	public String getDescripcion_cat() {
		return descripcion_cat;
	}
	public void setDescripcion_cat(String descripcion_cat) {
		this.descripcion_cat = descripcion_cat;
	}
	public Date getFecha_baja() {
		return fecha_baja;
	}
	public void setFecha_baja(Date fecha_baja) {
		this.fecha_baja = fecha_baja;
	}

	public Categoria(String desc, ArrayList<Dto_Categ>dtos){
		this.setDescripcion_cat(desc);
		this.setDescuentos(dtos);
	}
}
