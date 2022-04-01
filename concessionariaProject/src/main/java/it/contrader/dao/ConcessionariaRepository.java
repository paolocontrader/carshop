package it.contrader.dao;

import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import it.contrader.model.Concessionaria;
@Repository
@Transactional
public interface ConcessionariaRepository extends CrudRepository<Concessionaria,Long>{

}
