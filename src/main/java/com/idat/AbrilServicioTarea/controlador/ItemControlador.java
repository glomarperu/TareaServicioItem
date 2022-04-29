package com.idat.AbrilServicioTarea.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.idat.AbrilServicioTarea.modelo.Items;
import com.idat.AbrilServicioTarea.servicio.ItemServicio;

@RestController
@RequestMapping("/item/v1")
public class ItemControlador {
	

	@Autowired
	private ItemServicio servicio;
	
	@RequestMapping(path = "/listar", method = RequestMethod.GET)
	public ResponseEntity<List<Items>> listarItem(){
		return new ResponseEntity<List<Items>>(servicio.listarItem(), HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/guardar", method = RequestMethod.POST)
	public ResponseEntity<Void> guardar(@RequestBody Items item){
		servicio.guardarItem(item);
		return new  ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@RequestMapping(path = "/listar/{id}")
	public ResponseEntity<Items> listarPorId(@PathVariable int id){
		
		Items i = servicio.obtenerItemId(id);
		if(i != null)
			return new ResponseEntity<Items>(i, HttpStatus.OK);
		
		return new ResponseEntity<Items>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/editar", method = RequestMethod.PUT)
	public ResponseEntity<Items> editar(@RequestBody Items item){
		
		Items i = servicio.obtenerItemId(item.getIdItem());
		if(i != null) {
			servicio.editarItem(item);
			return new ResponseEntity<Items> (i, HttpStatus.OK);
		}
		
		return new ResponseEntity<Items>(HttpStatus.NOT_FOUND);
	}
	
	@RequestMapping(path = "/eliminar/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Items> eliminar(@PathVariable int id){
		
		Items i = servicio.obtenerItemId(id);
		if(i != null) {
			servicio.eliminarItem(id);
			return new ResponseEntity<Items> (i, HttpStatus.OK);
		}
		
		return new ResponseEntity<Items>(HttpStatus.NOT_FOUND);
	}
	

}
