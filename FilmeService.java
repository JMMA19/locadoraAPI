package com.locadora.locadora.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.locadora.locadora.models.Filme;
import com.locadora.locadora.repository.FilmeReposiory;



@Service
public class FilmeService {

@Autowired
FilmeReposiory FilmeRepository;
@Autowired
AutorService autorRepository;



	//Cadastro de Filmes / Atualiza caso passe a Id já cadastrada
		public Filme salvarFilme(Filme filme) {
			if (filme.autor != null) {
				autorRepository.salvarAutor(filme.autor);		
							}
			return FilmeRepository.save(filme);
	
	}

	//listagem de Filmes Geral e por Id ///////////////////////

	public List<Filme> listarfilmes(){
	 return FilmeRepository.findAll();
	}
	
	public Filme listarporid(long id){
	 return FilmeRepository.findById(id);
	}


	//Deleta Filmes por Id e Geral  ///////////////////////
	
	public Filme deletarfilme(long id){
		return FilmeRepository.deleteById(id);
	}
	//deleta todos os dados da tabela.
	//@GetMapping("/deletarall")    
	//public void deletatodosfilmes(){
	//FilmeRepository.deleteAll();}
	
	
	
	}
	
