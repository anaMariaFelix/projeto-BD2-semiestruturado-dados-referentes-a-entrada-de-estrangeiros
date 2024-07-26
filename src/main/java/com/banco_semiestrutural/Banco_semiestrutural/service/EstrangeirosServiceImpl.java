package com.banco_semiestrutural.Banco_semiestrutural.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.banco_semiestrutural.Banco_semiestrutural.entity.Estrangeiro;
import com.banco_semiestrutural.Banco_semiestrutural.repository.EstrangeiroRepository;

@Service
public class EstrangeirosServiceImpl implements IEstrangeirosService{

	@Autowired
	private EstrangeiroRepository repository;
	
	public List<Estrangeiro> saveAll(List<Estrangeiro> dadosList) {
		
		
		return repository.saveAll(dadosList);
	}

}
