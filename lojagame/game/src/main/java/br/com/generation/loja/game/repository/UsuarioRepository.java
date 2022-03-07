package br.com.generation.loja.game.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.generation.loja.game.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	public Optional<Usuario> findByUsuario(String usuario);
}
