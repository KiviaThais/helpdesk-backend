package com.kivia.helpdesk.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kivia.helpdesk.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
