package com.example.demo.car;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {

	@GetMapping
	public List<Car> getCars() {
		return Arrays.asList(new Car[]{
			new Car(1, "Ford", 2011, "Black"),
			new Car(2, "Honda", 2012, "Red"),
			new Car(3, "Chevrolet", 2013, "Green"),
			new Car(4, "Nissan", 2014, "Blue"),
			new Car(5, "Toyota", 2015, "Yellow"),
		});
	}

	@PostMapping("/repair/")
	public void repairCar(@RequestBody Car car) {
		
	}

}
