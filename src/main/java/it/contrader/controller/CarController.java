package it.contrader.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.CarDTO;
import it.contrader.model.Concessionaria;
import it.contrader.service.CarService;

@RestController
@RequestMapping("/cars")
public class CarController {

	@Autowired
	private CarService service;

	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		setAll(request);
		return "cars";
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("id") Long id) {
		service.delete(id);
		setAll(request);
		return "cars";
	}

	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("id") Long id) {
		request.getSession().setAttribute("dto", service.read(id));
		return "updatecar";
	}

	@PostMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("id") Long id, @RequestParam("carName") String carName,
			@RequestParam("displacement") String displacement,@RequestParam("colour") String colour,@RequestParam("brand") String brand,@RequestParam("licence_plate") String licence_plate, @RequestParam("concessionarie") Set<Concessionaria> concessionarie) {

		CarDTO dto = new CarDTO();
		dto.setId(id);
		dto.setCarName(carName);
		dto.setColour(colour);
		dto.setBrand(brand);
		dto.setDisplacement(displacement);
		dto.setLicence_plate(licence_plate);
		dto.setConcessionarie(concessionarie);
		service.update(dto);
		setAll(request);
		return "cars";

	}

	@PostMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("id") Long id, @RequestParam("carName") String carName,
			@RequestParam("displacement") String displacement,@RequestParam("colour") String colour,@RequestParam("brand") String brand,@RequestParam("licence_plate") String licence_plate, @RequestParam("concessionarie") Set<Concessionaria> concessionarie)
{

		CarDTO dto = new CarDTO();
		dto.setId(id);
		dto.setCarName(carName);
		dto.setColour(colour);
		dto.setBrand(brand);
		dto.setDisplacement(displacement);
		dto.setLicence_plate(licence_plate);
		dto.setConcessionarie(concessionarie);
		service.insert(dto);
		setAll(request);
		return "cars";
	}

	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("id") Long id) {
		request.getSession().setAttribute("dto", service.read(id));
		return "readCar";
	}
	
	private void setAll(HttpServletRequest request) {
		request.getSession().setAttribute("list", service.getAll());
	}
}
