package com.kivia.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kivia.helpdesk.domain.Chamado;

public interface ChamadoRepository extends JpaRepository<Chamado, Integer>{

}
