package com.kivia.helpdesk.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.kivia.helpdesk.domain.Chamado;
import com.kivia.helpdesk.domain.Cliente;
import com.kivia.helpdesk.domain.Tecnico;
import com.kivia.helpdesk.domain.enums.Perfil;
import com.kivia.helpdesk.domain.enums.Prioridade;
import com.kivia.helpdesk.domain.enums.Status;
import com.kivia.helpdesk.repositories.ChamadoRepository;
import com.kivia.helpdesk.repositories.PessoaRepository;

@Service
public class DBService {
	
	@Autowired
	private PessoaRepository pessoaRepository;
	@Autowired
	private ChamadoRepository chamadoRepository;
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	public void instanciaDB() {
		
		Tecnico tec1 = new Tecnico(null, "Kivia Thais", "12842666054", "kiviathais@mail.com", encoder.encode("123"));
		tec1.addPerfil(Perfil.ADMIN);
		Tecnico tec2 = new Tecnico(null, "Richard Teste", "47090750000", "richard@mail.com", encoder.encode("123"));
		Tecnico tec3 = new Tecnico(null, "Claude Teste", "12567894020", "claude@mail.com", encoder.encode("123"));
		Tecnico tec4 = new Tecnico(null, "Tim Teste", "31228953074", "tim@mail.com", encoder.encode("123"));
		Tecnico tec5 = new Tecnico(null, "Linus Teste", "35250696007", "linus@mail.com", encoder.encode("123"));
		
		Cliente cli1 = new Cliente(null, "Marcelo Oliveira", "45757853000", "marcelo@mail.com", encoder.encode("123"));
		Cliente cli2 = new Cliente(null, "Marie Curie", "45580162049", "marieo@mail.com", encoder.encode("123"));
		Cliente cli3 = new Cliente(null, "Charles Darwim", "15195224013", "charles@mail.com", encoder.encode("123"));
		Cliente cli4 = new Cliente(null, "Stephen Teste", "50428963099", "stephen@mail.com", encoder.encode("123"));
		Cliente cli5 = new Cliente(null, "Albertin Einstein", "25624409001", "albertin@mail.com", encoder.encode("123"));

		
		Chamado c1 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 1", "Teste chamado 1", tec1, cli1);
		Chamado c2 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 2", "Teste chamado 2", tec1, cli2);
		Chamado c3 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 3", "Teste chamado 3", tec2, cli3);
		Chamado c4 = new Chamado(null, Prioridade.ALTA, Status.ABERTO, "Chamado 4", "Teste chamado 4", tec3, cli3);
		Chamado c5 = new Chamado(null, Prioridade.MEDIA, Status.ANDAMENTO, "Chamado 5", "Teste chamado 5", tec2, cli1);
		Chamado c6 = new Chamado(null, Prioridade.BAIXA, Status.ENCERRADO, "Chamado 6", "Teste chamado 6", tec1, cli5);

		
		pessoaRepository.saveAll(Arrays.asList(tec1, tec2, tec3, tec4, tec5, cli1, cli2, cli3, cli4, cli5));
		//clienteRepository.saveAll(Arrays.asList(cli1));
		chamadoRepository.saveAll(Arrays.asList(c1, c2, c3, c4, c5, c6));
				
	}

}
