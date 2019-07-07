package com.example.demo.car;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Example;
import io.swagger.annotations.ExampleProperty;

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
			value="Workaround: {\"when\":\"2010-01-01\",\"where\":\"Auto Repair Shop\"}",
			examples = @Example(value = {
				@ExampleProperty(value = "{\"when\":\"2010-01-01\",\"where\":\"Auto Repair Shop\"}")
			})
		)
		@RequestBody Map<String, String> body
	) {
		
		return String.format(
			"Your car will be repaired at \"%s\" on %s.",
			body.get("where"),
			body.get("when")
		);

	}

}
