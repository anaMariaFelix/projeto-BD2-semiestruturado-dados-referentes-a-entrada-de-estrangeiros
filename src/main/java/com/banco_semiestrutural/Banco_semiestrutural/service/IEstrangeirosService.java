package com.banco_semiestrutural.Banco_semiestrutural.service;

import java.util.List;

import com.banco_semiestrutural.Banco_semiestrutural.entity.Estrangeiro;

public interface IEstrangeirosService {

	List<Estrangeiro> saveAll(List<Estrangeiro> dadosList);
}
