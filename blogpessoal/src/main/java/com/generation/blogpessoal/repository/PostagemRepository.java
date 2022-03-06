package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.PostagemModel;


// mostra para o spring que o arquivo é um repository
@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {

	public List<PostagemModel> findAllByTituloContainingIgnoreCase(String titulo);

}

