package main.java.com.belatrix.distro.model;

import java.util.ArrayList;
import java.util.List;

public class Deposito extends BaseEntity {

	private String ubicacion;
	private int capacidad;
	private List<ArrayList<Stock>> stockProductos;
	private List<ArrayList<Movimiento>> movimientosStock;
	
	
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	public List<ArrayList<Stock>> getStockProductos() {
		return stockProductos;
	}
	public void setStockProductos(List<ArrayList<Stock>> stockProductos) {
		this.stockProductos = stockProductos;
	}
	public List<ArrayList<Movimiento>> getMovimientosStock() {
		return movimientosStock;
	}
	public void setMovimientosStock(List<ArrayList<Movimiento>> movimientosStock) {
		this.movimientosStock = movimientosStock;
	}
	
}
