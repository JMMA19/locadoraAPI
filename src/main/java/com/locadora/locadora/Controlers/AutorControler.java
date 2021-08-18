package com.locadora.locadora.Controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.locadora.locadora.models.Filme;
import com.locadora.locadora.repository.AutorRepository;
import com.locadora.locadora.repository.FilmeReposiory;


	@RestController
	@RequestMapping(value = "/AutorAPI")
	public class AutorControler {
	@Autowired
	AutorRepository AutorRepository;

	//Cadastro de Filmes / Atualiza caso passe a Id já cadastrada
	@PostMapping("/salvarfilme")
	public Filme salvarFilme(@RequestBody Filme Filme) {
		return FilmeRepository.save(Filme);
	}

	//listagem de Filmes Geral e por Id ///////////////////////
	@GetMapping("/Listar")
	public List<Filme> listarfilmes(){
	 return FilmeRepository.findAll();
	}
	@GetMapping("/listarfilmesid/{id}")
	public Filme listarporid(@PathVariable(value = "id" ) long id){
	 return FilmeRepository.findById(id);
	}


	//Deleta Filmes por Id e Geral  ///////////////////////
	@PostMapping("/deletefilme/{id}")
	public Filme deletarfilme(@PathVariable(value = "id" ) long id){
		return FilmeRepository.deleteById(id);
	}
	//deleta todos os dados da tabela.
	//@GetMapping("/deletarall")    
	//public void deletatodosfilmes(){
	//FilmeRepository.deleteAll();}
	}

}
