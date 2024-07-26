package com.banco_semiestrutural.Banco_semiestrutural.mapper;

import java.io.IOException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import com.banco_semiestrutural.Banco_semiestrutural.entity.Estrangeiro;
import com.fasterxml.jackson.databind.JsonNode;

public class EstrangeirosMapper {
	
	  public static Estrangeiro mapJsonToEstrangeiro(JsonNode jsonNode) {
	        Estrangeiro estrangeiro = new Estrangeiro();
	        
	     
	        estrangeiro.setNomeFundo(jsonNode.get("NomeFundo").asText());
	        
	        estrangeiro.setNotação(jsonNode.get("Notação").asText());
	        
	        estrangeiro.setSobrenome(jsonNode.get("Sobrenome").asText());
	        
	        estrangeiro.setPortoEmbarque(jsonNode.get("Porto de Embarque").asText());
	        
	        estrangeiro.setPortoChegada(jsonNode.get("Porto de Chegada").asText());
	        
	        estrangeiro.setProcedencia(jsonNode.get("Procedencia").asText());
	        
	        estrangeiro.setDestino(jsonNode.get("Destino").asText());
	        
	        estrangeiro.setDatachegada(jsonNode.get("datachegada").asText());
	        
	        estrangeiro.setDatasistema(jsonNode.get("Datasistema").asText());
	        
	        return estrangeiro;
	        
	    }

	  public static List<Estrangeiro> mapJsonToEstrangeiroList(JsonNode jsonNode) throws IOException {
		  
	        List<Estrangeiro> estrangeiroList = new ArrayList<>();

	        if (jsonNode.isArray()) {
	            for (JsonNode node : jsonNode) {
	            	estrangeiroList.add(mapJsonToEstrangeiro(node));
	            }
	            
	        } else {
	        	estrangeiroList.add(mapJsonToEstrangeiro(jsonNode));
	        }

	        return estrangeiroList;
	    }
	  
}
