package main.java.com.belatrix.distro.model;

import main.java.com.belatrix.distro.model.enumeration.TipoOrganizacion;

public class Proveedor extends BaseEntity implements Organizacion {

	private String direccion;
	private String telefono;
	private String email;
	private TipoOrganizacion tipo; 
	
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public TipoOrganizacion getTipo() {
		return this.tipo;
	}
	@Override
	public void setTipo(TipoOrganizacion tipo) {
		this.tipo = tipo;		
	}
	
}
