package com.Entity;

import java.time.LocalDate;

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
@Table(name = "artista")
public class ArtistaEntity {
	
	@Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	private String nome;
	
	@Column(name = "data_m")
    private LocalDate dataM;
	
	@Column(name = "data_n")
    private LocalDate dataN;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_citta")
    private CittaEntity idCitta;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataN() {
		return dataN;
	}

	public void setDataN(LocalDate dataN) {
		this.dataN = dataN;
	}

	public LocalDate getDataM() {
		return dataM;
	}

	public void setDataM(LocalDate dataM) {
		this.dataM = dataM;
	}

	public CittaEntity getIdCitta() {
		return idCitta;
	}

	public void setIdCitta(CittaEntity idCitta) {
		this.idCitta = idCitta;
	}

	public ArtistaEntity(Integer id, String nome, LocalDate dataN, LocalDate dataM, CittaEntity idCitta) {
		super();
		this.id = id;
		this.nome = nome;
		this.dataN = dataN;
		this.dataM = dataM;
		this.idCitta = idCitta;
	}

	public ArtistaEntity() {
		super();
	}
	
}
