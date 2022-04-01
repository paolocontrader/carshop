package it.contrader.dto;

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import it.contrader.model.Car;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property ="id")
public class CarDTO {

	
	private long id;
	
	private String carName;
	
	private String displacement;
	
	private String colour;
	
	private String brand;
	
	private String license_plate;
	
	boolean sell = false;
	
	boolean registered = false;

	private double prezzo;
}
