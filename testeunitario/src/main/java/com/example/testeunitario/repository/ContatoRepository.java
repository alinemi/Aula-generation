package com.example.testeunitario.repository;

	import org.springframework.data.jpa.repository.JpaRepository;
	import com.example.testeunitario.model.ContatoModel;

	public interface ContatoRepository extends JpaRepository<com.example.testeunitario.model.ContatoModel, Long> {

	}
