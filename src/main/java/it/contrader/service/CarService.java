package it.contrader.service;

import org.springframework.stereotype.Service;

import it.contrader.dao.CarRepository;
import it.contrader.dto.CarDTO;
import it.contrader.model.Car;

@Service
public class CarService extends AbstractService<Car,CarDTO> {

	public CarDTO findById(long id) {
		return converter.toDTO(((CarRepository)repository).findById(id));
	}
}
