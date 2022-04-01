package it.contrader.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import it.contrader.dto.CarDTO;
import it.contrader.service.CarService;

@RestController
@RequestMapping("/cars")
@CrossOrigin("*")
public class CarController extends AbstractController<CarDTO>{

	@Autowired
	private CarService service;
	
	@Autowired
	private RestTemplate template;

	@Override
	@GetMapping("/getall")
	public Iterable<CarDTO> getAll() {
		return service.getAll();
	}

	@GetMapping("/concAll")
	public List<Object> getCars(){
		 Object[] conc = template.getForObject("http://CONC-MICRO/concessionarie/getall", Object[].class);
		 return Arrays.asList(conc);
	}
}


