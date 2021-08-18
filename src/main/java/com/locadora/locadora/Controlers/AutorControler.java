package com.locadora.locadora.Controlers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.locadora.locadora.models.Autor;
import com.locadora.locadora.repository.AutorRepository;

@RestController
@RequestMapping(value = "/autorAPI")
	public class AutorControler {
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
