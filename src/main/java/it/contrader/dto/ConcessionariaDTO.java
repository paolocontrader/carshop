package it.contrader.dto;


import java.util.Set;


import it.contrader.model.Car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConcessionariaDTO {
	private Long id;
	private String nomeConcessionaria;
	private String paese;
	private Set<Car> parcoAuto;
}
