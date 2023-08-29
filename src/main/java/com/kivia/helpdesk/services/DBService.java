package com.kivia.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kivia.helpdesk.domain.Chamado;
import com.kivia.helpdesk.domain.Cliente;
import com.kivia.helpdesk.domain.Tecnico;
import com.kivia.helpdesk.domain.enums.Perfil;
import com.kivia.helpdesk.domain.enums.Prioridade;
import com.kivia.helpdesk.domain.enums.Status;
import com.kivia.helpdesk.repositories.ChamadoRepository;
import com.kivia.helpdesk.repositories.ClienteRepository;
import com.kivia.helpdesk.repositories.TecnicoRepository;

@Service
public class DBService {
	
	@Autowired
	private TecnicoRepository tecnicoRepository;
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Kivia Thais", "12842666054", "kiviathais@mail.com", "123");
		tec1.addPerfil(Perfil.ADMIN);
		
		Cliente cli1 = new Cliente(null, "Marcelo Oliveira", "45757853000", "marcelo@mail.com", "123");
		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado01", "Primeiro chamado", tec1, cli1);
		
		tecnicoRepository.saveAll(Arrays.asList(tec1));
		clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1));
		
	}

}