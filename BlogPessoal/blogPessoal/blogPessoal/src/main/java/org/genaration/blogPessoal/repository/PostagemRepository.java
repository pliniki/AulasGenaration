package org.genaration.blogPessoal.repository;

import java.util.List;

import org.genaration.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Anotacao para dizer que essa e uma classe de repositorio: @Repository
@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long>{
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	
}
