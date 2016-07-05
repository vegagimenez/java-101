package main.java.com.belatrix.distro.model;

import main.java.com.belatrix.distro.model.enumeration.TipoOrganizacion;

public class Cliente extends BaseEntity implements Organizacion {

	private TipoOrganizacion tipo;
	private String direccion = "sarasa 100";
	private String telefono;
	private String email;
	//FIXME: esto es una muestra del fixme, alguno me va a eliminar!
		

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
