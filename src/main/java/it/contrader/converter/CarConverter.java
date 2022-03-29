package it.contrader.converter;

import org.springframework.stereotype.Component;

import it.contrader.dto.CarDTO;
import it.contrader.model.Car;


@Component
public class CarConverter extends AbstractConverter <Car,CarDTO> {

	public Car toEntity(CarDTO carDTO) {
		Car car = null;
		if(carDTO!=null) {
			car = new Car(carDTO.getId(),carDTO.getBrand(),carDTO.getCarName(),carDTO.getColour(),carDTO.getDisplacement(),carDTO.getLicence_plate(),carDTO.isSell(),carDTO.isRegistered());
		}
		return car;
	}
	
	public CarDTO toDTO(Car car) {
		CarDTO carDTO = null;
		if(car!=null) {
			carDTO = new CarDTO(car.getId(),car.getBrand(),car.getCarName(),car.getColour(),car.getDisplacement(),car.getLicence_plate(),car.isSell(),car.isRegistered());
		}
		return carDTO;
	}
	
}