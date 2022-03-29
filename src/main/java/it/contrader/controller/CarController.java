package it.contrader.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.CarDTO;
import it.contrader.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	
	CarService service;
	
	@GetMapping("/getAllCars")
	public Iterable<CarDTO> list(){
		return service.getAll();
	}
}
