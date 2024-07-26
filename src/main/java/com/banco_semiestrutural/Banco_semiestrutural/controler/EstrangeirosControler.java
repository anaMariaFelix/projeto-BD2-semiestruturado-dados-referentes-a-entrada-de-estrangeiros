package com.banco_semiestrutural.Banco_semiestrutural.controler;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.banco_semiestrutural.Banco_semiestrutural.entity.Estrangeiro;
import com.banco_semiestrutural.Banco_semiestrutural.mapper.EstrangeirosMapper;
import com.banco_semiestrutural.Banco_semiestrutural.service.EstrangeirosServiceImpl;
import com.fasterxml.jackson.databind.JsonNode;



@RestController
@RequestMapping("/estrangeiro")
public class EstrangeirosControler {

	@Autowired
	private EstrangeirosServiceImpl service;
	
	@PostMapping("/save")
    public ResponseEntity<List<Estrangeiro>> create(@RequestBody JsonNode jsonNode) {
        try {
            List<Estrangeiro> dadosList = EstrangeirosMapper.mapJsonToEstrangeiroList(jsonNode);
            
            List<Estrangeiro> savedDadosList = service.saveAll(dadosList);
            
            return new ResponseEntity<>(savedDadosList, HttpStatus.CREATED);
            
        } catch (IOException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
	
}
