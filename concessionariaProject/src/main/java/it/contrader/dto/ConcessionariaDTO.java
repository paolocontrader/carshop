package it.contrader.dto;


import java.util.HashSet;
import java.util.Set;


import it.contrader.model.Concessionaria;
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
	

}
