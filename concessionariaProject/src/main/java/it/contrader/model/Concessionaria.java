package it.contrader.model;

	
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
	
	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	@Entity
public class Concessionaria {
		
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String nomeConcessionaria;
		private String paese;
		//relazione Concessionaria - Car 

	
	}


