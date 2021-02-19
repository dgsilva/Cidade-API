package br.com.api.projeto.silva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.projeto.silva.model.States;
import br.com.api.projeto.silva.repository.StatesRepository;

@RestController
@RequestMapping("estados")
public class StatesController {
	
	@Autowired
	StatesRepository statesRepository;
	
	@GetMapping
	public List<States>listar(){
		return statesRepository.findAll();
	}

}
