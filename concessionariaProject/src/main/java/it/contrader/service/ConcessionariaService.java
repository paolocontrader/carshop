package it.contrader.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.contrader.converter.ConcessionariaConverter;
import it.contrader.dao.ConcessionariaRepository;
import it.contrader.dto.ConcessionariaDTO;
import it.contrader.model.Concessionaria;
@Service
public class ConcessionariaService extends AbstractService<Concessionaria,ConcessionariaDTO>{
	

	@Autowired
	private ConcessionariaConverter converter;
	@Autowired
	private ConcessionariaRepository repository;

	public ConcessionariaDTO findById(Long id) {
		return converter.toDTO(repository.findById(id).get());
	}

	}
