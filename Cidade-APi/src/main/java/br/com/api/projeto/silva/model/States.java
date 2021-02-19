package br.com.api.projeto.silva.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
@Entity
@Table(name = "estados")
public class States {
	
	@Id
	private Long idEstado;
	private String nome;
	private String uf;
	private Integer ibge;
	@ManyToOne
	@JoinColumn(name = "paises",referencedColumnName = "idPaises")
	private Country countries;
	
	public Long getId() {
		return idEstado;
	}
	public void setId(Long id) {
		this.idEstado = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getUf() {
		return uf;
	}
	public void setUf(String uf) {
		this.uf = uf;
	}
	public Integer getIbge() {
		return ibge;
	}
	public void setIbge(Integer ibge) {
		this.ibge = ibge;
	}
	public Country getCountries() {
		return countries;
	}
	public void setCountries(Country countries) {
		this.countries = countries;
	}
	
	

}
