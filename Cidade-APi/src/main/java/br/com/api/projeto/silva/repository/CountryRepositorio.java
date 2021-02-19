package br.com.api.projeto.silva.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.api.projeto.silva.model.Country;

@Repository
public interface CountryRepositorio extends JpaRepository<Country, Long> {

}
