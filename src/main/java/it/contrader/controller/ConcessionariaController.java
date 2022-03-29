package it.contrader.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import it.contrader.dto.ConcessionariaDTO;
import it.contrader.model.Car;
import it.contrader.service.ConcessionariaService;
@RestController
@RequestMapping("/concessionarie")
public class ConcessionariaController {

	@Autowired
	private ConcessionariaService service;

	
	

	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		setAll(request);
		return "concessionarie";
	}


	private void setAll(HttpServletRequest request) {
		request.getSession().setAttribute("list", service.getAll());
	}
}
