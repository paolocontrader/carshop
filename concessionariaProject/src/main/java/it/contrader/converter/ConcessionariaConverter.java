package it.contrader.converter;


import org.springframework.stereotype.Component;

import it.contrader.dto.ConcessionariaDTO;

import it.contrader.model.Concessionaria;
@Component
public class ConcessionariaConverter extends AbstractConverter<Concessionaria,ConcessionariaDTO>{
	@Override
	public Concessionaria toEntity(ConcessionariaDTO concessionariaDTO) {
		Concessionaria concessionaria = null;
		if (concessionariaDTO != null) {
			concessionaria = new Concessionaria(concessionariaDTO.getId(),concessionariaDTO.getNomeConcessionaria(),concessionariaDTO.getPaese());
		}
		return concessionaria;
	}
	@Override
	public ConcessionariaDTO toDTO(Concessionaria concessionaria) {
		ConcessionariaDTO concessionariaDTO = null;
		if (concessionaria != null) {
			concessionariaDTO = new ConcessionariaDTO(concessionaria.getId(),concessionaria.getNomeConcessionaria(),concessionaria.getPaese());

		}
		return concessionariaDTO;
}}
