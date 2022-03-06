package com.generation.blogpessoal.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

//notação que define que o objeto criado vai ser uma tabela
@Entity

//notação que dá um nome para a tabela
@Table(name="tb_postagens")
public class PostagemModel {
	
	//notação que indica que o campo vai ser um id-chave primaria
	@Id
	//notação que torna o id auto-incrementado -- corresponde ao auto-increment do mysql
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//notação que define que a coluna não poderá receber informações nulas
	@NotNull
	//notação para definir um tamanho minimo e maximo para o dado inserido na coluna 
	@Size(min= 4, max=100)
	private String titulo;

	@NotNull
	@Size(min= 4, max=100)
	private String texto;
	
	@Temporal(TemporalType.TIMESTAMP)
    private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("postagem")
	private Tema tema;

	//getters e setters dos atributos do nosso objeto/tabela, que define que através do spring poderemos consultar, inserir, atualizar e deletar cada um dos dados desses campos 
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

}
