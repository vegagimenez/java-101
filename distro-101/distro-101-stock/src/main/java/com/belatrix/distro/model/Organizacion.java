package main.java.com.belatrix.distro.model;

import main.java.com.belatrix.distro.model.enumeration.TipoOrganizacion;

public interface Organizacion {
	
	public TipoOrganizacion getTipo();
	public void setTipo(TipoOrganizacion tipo);
}
