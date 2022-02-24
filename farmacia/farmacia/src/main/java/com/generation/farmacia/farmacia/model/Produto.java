package com.generation.farmacia.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table(name = "tb_produto")
public class Produto {
	// Atributos e variaveis
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		@NotNull
		private String nome;
		@NotNull
		private double preco;
		@NotNull
		private int quantidade;
		
		@OneToMany(mappedBy = "produto", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("produto")
		private List<Categoria> categoria;
		
		// Getters and Setters
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public double getPreco() {
			return preco;
		}
		public void setPreco(double preco) {
			this.preco = preco;
		}
		public int getQuantidade() {
			return quantidade;
		}
		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}
		public List<Categoria> getCategoria() {
			return categoria;
		}
		public void setCategoria(List<Categoria> categoria) {
			this.categoria = categoria;
		}
}
