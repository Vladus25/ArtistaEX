package com.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "museo")
public class MuseoEntity {
	
	@Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "nome")
    private String nome;
	
	@Column(name = "via")
    private String via;
	
	@Column(name = "civico")
    private Integer civico;
	
	@Column(name = "telefono", nullable = false, length = 50)
    private Integer telefono;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_citta")
    private CittaEntity idCitta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public Integer getCivico() {
		return civico;
	}

	public void setCivico(Integer civico) {
		this.civico = civico;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	public CittaEntity getIdCitta() {
		return idCitta;
	}

	public void setIdCitta(CittaEntity idCitta) {
		this.idCitta = idCitta;
	}

	public MuseoEntity(Integer id, String nome, String via, Integer civico, Integer telefono, CittaEntity idCitta) {
		super();
		this.id = id;
		this.nome = nome;
		this.via = via;
		this.civico = civico;
		this.telefono = telefono;
		this.idCitta = idCitta;
	}

	public MuseoEntity() {
		super();
	}
	
	
}
