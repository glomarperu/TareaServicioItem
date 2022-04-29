package com.idat.AbrilServicioTarea.repositorio;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.idat.AbrilServicioTarea.modelo.Items;

@Repository
public class ItemRepositorioImpl implements ItemRepositorio {
	
	public List<Items> listar = new ArrayList<Items>();
	
	@Override
	public void guardarItem(Items item) {
		// TODO Auto-generated method stub
		listar.add(item);

	}

	@Override
	public void editarItem(Items item) {
		// TODO Auto-generated method stub
		listar.remove(obtenerItemId(item.getIdItem()));
		listar.add(item);

	}

	@Override
	public void eliminarItem(Integer id) {
		// TODO Auto-generated method stub
		listar.remove(obtenerItemId(id));

	}

	@Override
	public List<Items> listarItem() {
		// TODO Auto-generated method stub
		return listar;
	}

	@Override
	public Items obtenerItemId(Integer id) {
		// TODO Auto-generated method stub
		return listar.stream().filter(item -> item.getIdItem() == id).findFirst().orElse(null);
	}

}
