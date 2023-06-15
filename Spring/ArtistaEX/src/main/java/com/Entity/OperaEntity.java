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
@Table(name = "opera")
public class OperaEntity {
	
	@Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "titolo", nullable = false)
    private String titolo;
	
	@Column(name = "valore", nullable = false)
    private Integer valore;
	
	@Column(name = "anno", nullable = false, length = 4)
    private Integer anno;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_artista")
    private ArtistaEntity idArtista;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_museo")
    private MuseoEntity idMuseo;
	
	@Column(name = "img")
    private String img;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Integer getValore() {
		return valore;
	}

	public void setValore(Integer valore) {
		this.valore = valore;
	}

	public Integer getAnno() {
		return anno;
	}

	public void setAnno(Integer anno) {
		this.anno = anno;
	}

	public ArtistaEntity getIdArtista() {
		return idArtista;
	}

	public void setIdArtista(ArtistaEntity idArtista) {
		this.idArtista = idArtista;
	}

	public MuseoEntity getIdMuseo() {
		return idMuseo;
	}

	public void setIdMuseo(MuseoEntity idMuseo) {
		this.idMuseo = idMuseo;
	}
	
	
	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public OperaEntity(Integer id, String titolo, Integer valore, Integer anno, ArtistaEntity idArtista,
			MuseoEntity idMuseo, String img) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.valore = valore;
		this.anno = anno;
		this.idArtista = idArtista;
		this.idMuseo = idMuseo;
		this.img = img;
	}

	public OperaEntity() {
		super();
	}

}
