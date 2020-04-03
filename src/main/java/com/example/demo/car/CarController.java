package com.example.demo.car;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RestController
@RequestMapping("/cars")
@Api(value="Car Controller")
public class CarController {

	@ApiOperation(value = "Get the list of cars")
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

	@ApiOperation(value = "Repair the car", consumes = "application/json")
	@PostMapping("/repair")
	public String repairCar(
		@ApiParam(
			required = true,
			value="When and where the service should be provided."
		)
		@RequestBody ServiceRequest request
	) {
		
		return String.format(
			"Your car will be repaired on '%s' at '%s'.",
			request.getWhen(),
			request.getWhere()
		);

	}

}
