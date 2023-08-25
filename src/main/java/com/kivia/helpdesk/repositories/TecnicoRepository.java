package com.kivia.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kivia.helpdesk.domain.Tecnico;

public interface TecnicoRepository extends JpaRepository<Tecnico, Integer>{

}
