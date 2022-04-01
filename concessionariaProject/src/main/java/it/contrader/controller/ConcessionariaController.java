package it.contrader.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import it.contrader.dto.ConcessionariaDTO;
import it.contrader.service.ConcessionariaService;
@RestController
@RequestMapping("/concessionarie")
public class ConcessionariaController extends AbstractController<ConcessionariaDTO>{

	@Autowired
	private ConcessionariaService service;
	@Autowired
	private RestTemplate template;

	@Override
	@GetMapping("/getall")
	public Iterable<ConcessionariaDTO> getAll() {
		return service.getAll();
	}

	@GetMapping("/carsAll")
	public List<Object> getCars(){
		 Object[] cars = template.getForObject("http://CAR-MICRO/cars/getall", Object[].class);
		 return Arrays.asList(cars);
	}
}
