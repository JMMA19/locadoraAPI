package com.locadora.locadora.Controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locadora.locadora.Service.CategoriaService;
import com.locadora.locadora.models.Categoria;

@RestController
@RequestMapping(value = "/CategoriaAPI")
public class CategoriaControler {

	@Autowired
	CategoriaService categoriaService;
	
	@PostMapping("/salvarCategoria")
	public Categoria CadastroCategoria(@RequestBody Categoria cat) {
		return categoriaService.salvarCategoria(cat);
	
	}
	
	@GetMapping("/ListarCategoria")
	public List<Categoria> ListaCategoria(){
		return categoriaService.listarCategoria();
		
	}
	@GetMapping("/ListarCategoria/{id}")
	public Categoria listarporid(@PathVariable(value = "id" )long id){
		 return categoriaService.listarporid(id);
		}
	
	
}
