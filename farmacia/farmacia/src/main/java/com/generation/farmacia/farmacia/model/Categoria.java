package com.generation.farmacia.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_categoria")
public class Categoria {
	// Atributos e variaveis
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@NotNull
	private String Dermatologia;
	@NotNull
	private String Oncologia;
	@NotNull
	private String Neurologia;
	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Produto produto;

	// Getters and Setters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDermatologia() {
		return Dermatologia;
	}

	public void setDermatologia(String dermatologia) {
		Dermatologia = dermatologia;
	}

	public String getOncologia() {
		return Oncologia;
	}

	public void setOncologia(String oncologia) {
		Oncologia = oncologia;
	}

	public String getNeurologia() {
		return Neurologia;
	}

	public void setNeurologia(String neurologia) {
		Neurologia = neurologia;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
}
