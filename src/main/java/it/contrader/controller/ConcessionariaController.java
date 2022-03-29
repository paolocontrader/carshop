package it.contrader.controller;

import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.contrader.dto.ConcessionariaDTO;
import it.contrader.model.Car;
import it.contrader.service.ConcessionariaService;
@Controller
@RequestMapping("/concessionarie")
public class ConcessionariaController {

	@Autowired
	private ConcessionariaService service;

	
	

	@GetMapping("/getall")
	public String getAll(HttpServletRequest request) {
		setAll(request);
		return "concessionarie";
	}

	@GetMapping("/delete")
	public String delete(HttpServletRequest request, @RequestParam("id") Long id) {
		service.delete(id);
		setAll(request);
		return "concessionarie";
	}

	@GetMapping("/preupdate")
	public String preUpdate(HttpServletRequest request, @RequestParam("id") Long id) {
		request.getSession().setAttribute("dto", service.read(id));
		return "updateuser";
	}

	@PostMapping("/update")
	public String update(HttpServletRequest request, @RequestParam("id") Long id, @RequestParam("nomeConcessionaria") String nomeConcessionaria,
			@RequestParam("paese") String paese, @RequestParam("parcoAuto") Set<Car> parcoAuto) {

		ConcessionariaDTO dto = new ConcessionariaDTO();
		dto.setId(id);
		dto.setNomeConcessionaria(nomeConcessionaria);
		dto.setPaese(paese);
		dto.setParcoAuto(parcoAuto);
		service.update(dto);
		setAll(request);
		return "concessionarie";

	}

	@PostMapping("/insert")
	public String insert(HttpServletRequest request, @RequestParam("nomeConcessionaria") String nomeConcessionaria,
			@RequestParam("paese") String paese, @RequestParam("parcoAuto") Set<Car> parcoAuto)
{
		ConcessionariaDTO dto = new ConcessionariaDTO();
		dto.setNomeConcessionaria(nomeConcessionaria);;
		dto.setPaese(paese);
		dto.setParcoAuto(parcoAuto);
		service.insert(dto);
		setAll(request);
		return "concessionarie";
	}

	@GetMapping("/read")
	public String read(HttpServletRequest request, @RequestParam("id") Long id) {
		request.getSession().setAttribute("dto", service.read(id));
		return "readConcessionaria";
	}

	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		request.getSession().invalidate();
		return "index";
	}

	private void setAll(HttpServletRequest request) {
		request.getSession().setAttribute("list", service.getAll());
	}
}
