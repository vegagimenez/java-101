package main.java.com.belatrix.distro.model;

import java.util.Date;

import main.java.com.belatrix.distro.model.enumeration.TipoMovimiento;

public class Movimiento extends BaseEntity {

	private int cantidad;
	private Stock stockProducto;
	private Date fechaDeIngreso;
	private Organizacion organizacion;
	private TipoMovimiento tipo;
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Stock getStockProducto() {
		return stockProducto;
	}
	public void setStockProducto(Stock stockProducto) {
		this.stockProducto = stockProducto;
	}
	public Date getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	public void setFechaDeIngreso(Date fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	public Organizacion getOrganizacion() {
		return organizacion;
	}
	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}
	public TipoMovimiento getTipo() {
		return tipo;
	}
	public void setTipo(TipoMovimiento tipo) {
		this.tipo = tipo;
	}
	
}
