package com.idat.AbrilServicioTarea.modelo;

import java.io.Serializable;

public class Items implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5857320255723753938L;
	
	private int idItem;
	private String item;
	private int cantidad;
	private Double total;
	
	
	public Items() {
		super();
	}
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
