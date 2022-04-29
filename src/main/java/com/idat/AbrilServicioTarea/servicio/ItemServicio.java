package com.idat.AbrilServicioTarea.servicio;

import java.util.List;

import com.idat.AbrilServicioTarea.modelo.Items;

public interface ItemServicio {
	
	public void guardarItem(Items item);
	public void editarItem(Items item);
	public void eliminarItem(Integer id);
	public List<Items> listarItem();
	public Items obtenerItemId(Integer id);
}
