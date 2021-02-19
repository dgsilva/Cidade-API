package br.com.api.projeto.silva.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="paises")
public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPaises;
	private String nome;
	private String nomePt;
	private String sigla;
	private String bacen;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	

	

	public Long getIdPaises() {
		return idPaises;
	}

	public void setIdPaises(Long idPaises) {
		this.idPaises = idPaises;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomePt() {
		return nomePt;
	}

	public void setNomePt(String nomePt) {
		this.nomePt = nomePt;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getBacen() {
		return bacen;
	}

	public void setBacen(String bacen) {
		this.bacen = bacen;
	}


}
