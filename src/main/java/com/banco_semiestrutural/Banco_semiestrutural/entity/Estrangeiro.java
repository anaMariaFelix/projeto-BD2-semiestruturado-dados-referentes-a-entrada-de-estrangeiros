package com.banco_semiestrutural.Banco_semiestrutural.entity;

import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Entity
@Data
public class Estrangeiro {

	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "Nome_Fundo")
	@JsonProperty("NomeFundo")
	private String nomeFundo;
	
	@Column(name = "Notação")
	@JsonProperty("Notação")
	private String notação;
	
	@Column(name = "Sobrenome")
	@JsonProperty("Sobrenome")
	private String sobrenome;
	
	@Column(name = "Porto_de_Embarque")
	@JsonProperty("Porto de Embarque")
	private String portoEmbarque;
	
	@Column(name = "Porto_de_Chegada")
	@JsonProperty("Porto de Chegada")
	private String portoChegada;
	
	@Column(name = "Procedencia")
	@JsonProperty("Procedencia")
	private String procedencia;
	
	@Column(name = "Destino")
	@JsonProperty("Destino")
	private String destino;
	
	@Column(name = "Data_Chegada")
	@JsonProperty("datachegada")
	private String datachegada;
	
	@Column(name = "Datasistema")
	@JsonProperty("Datasistema")
	private String Datasistema;
	
	
}
