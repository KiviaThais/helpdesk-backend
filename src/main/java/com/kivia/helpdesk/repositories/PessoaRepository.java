package com.kivia.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kivia.helpdesk.domain.Pessoa;

public interface PessoaRepository extends JpaRepository<Pessoa, Integer>{

}
