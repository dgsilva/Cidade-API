package br.com.api.projeto.silva.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.api.projeto.silva.model.Country;
import br.com.api.projeto.silva.repository.CountryRepositorio;

@RestController
@RequestMapping("/paisese")
public class CountryController {
	@Autowired
	CountryRepositorio countryRepositorio;
	
	@GetMapping
	public List<Country>listar(){
		return countryRepositorio.findAll();
	}

}
