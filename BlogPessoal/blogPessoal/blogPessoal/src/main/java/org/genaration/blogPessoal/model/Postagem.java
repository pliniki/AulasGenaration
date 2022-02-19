package org.genaration.blogPessoal.model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


//Anotacao @Entity e usada para dizer que a nossa classe trata-se de uma entidade que será mapeada como tabela em nosso banco
@Entity 
//Anotacao @Table serve para dar nome a nossa tabela que sera criada usando @Entity
@Table(name = "postagem")
public class Postagem {
	//Atributos das variaveis
	//Anotacao para criar o PrimeryKey
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//Anotacao para transformar o atributo em NotNull (campo obrigatorio) e definir o Size (quantidade de caracter)
	@NotNull
	@Size(min = 1, max = 500)
	private String titulo;
	@NotNull
	@Size(min = 1, max = 100)
	private String texto;
	//Anotacao para definir o tipo de tempo que passara na variavel
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis()); /* funcao para a variavel receber a data 
	exata que a publicacao esta sendo feita: "variavel" = new java.sql.Date(System.currentTimeMillis())*/
	
	//Metodos Getters e Setters
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
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
}
