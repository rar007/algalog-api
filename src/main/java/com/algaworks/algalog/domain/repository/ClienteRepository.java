package com.algaworks.algalog.domain.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.algaworks.algalog.domain.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{
	
	List<Cliente> findByNome(String nome); //Faz uma consulta pelo nome completo
	List<Cliente> findByNomeContaining(String nome);
	Optional<Cliente> findByEmail(String email);


}
