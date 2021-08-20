package com.locadora.locadora.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.locadora.locadora.models.Autor;
import com.locadora.locadora.repository.AutorRepository;
@Service
@RequestMapping(value = "/autorAPI")
public class AutorService {

@Autowired
AutorRepository AutorRepository;


//Cadastro de autor / Atualiza caso passe a Id já cadastrada
@PostMapping("/salvarautor")
public Autor salvarAutor(@RequestBody Autor Autor) {
		return AutorRepository.save(Autor);
	}

	//listagem de Filmes Geral e por Id ///////////////////////
@GetMapping("/Listar")
public List<Autor> listarAutor(){
return AutorRepository.findAll();
	}
}
