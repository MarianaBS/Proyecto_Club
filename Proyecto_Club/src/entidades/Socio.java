package entidades;

public class Socio {
	
	private int id_socio;
	private String dni;
	private String nombre_socio;
	private String apellido_socio;
	private String direccion;
	private String telefono;
	private String mail_socio;
	private String usuario_soc;
	private String password_soc;
	private String estado;
	private Categoria cat_soc;
	
	public int getId_socio() {
		return id_socio;
	}
	public void setId_socio(int id_socio) {
		this.id_socio = id_socio;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre_socio() {
		return nombre_socio;
	}
	public void setNombre_socio(String nombre_socio) {
		this.nombre_socio = nombre_socio;
	}
	public String getApellido_socio() {
		return apellido_socio;
	}
	public void setApellido_socio(String apellido_socio) {
		this.apellido_socio = apellido_socio;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getMail_socio() {
		return mail_socio;
	}
	public void setMail_socio(String mail_socio) {
		this.mail_socio = mail_socio;
	}
	public String getUsuario_soc() {
		return usuario_soc;
	}
	public void setUsuario_soc(String usuario_soc) {
		this.usuario_soc = usuario_soc;
	}
	public String getPassword_soc() {
		return password_soc;
	}
	public void setPassword_soc(String password_soc) {
		this.password_soc = password_soc;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Categoria getCat_soc() {
		return cat_soc;
	}
	public void setCat_soc(Categoria cat_soc) {
		this.cat_soc = cat_soc;
	}
	
	

}
