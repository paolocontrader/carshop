package it.contrader.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import it.contrader.dto.UserDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Car {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String carName;
	
	private String displacement;
	
	private String colour;
	
	private String brand;
	
	private String licence_plate;
	
	boolean sell = false;
	
	boolean registered = false;
	
	@ManyToMany
	Set<Concessionaria> concessionaria = new HashSet<>();
	
	
	private double prezzo;
	
	
}
