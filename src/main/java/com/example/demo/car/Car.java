package com.example.demo.car;

import lombok.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@AllArgsConstructor
@Getter
@Setter
@ApiModel(description="This is the Car model.")
public class Car {

	@ApiModelProperty(notes = "The car id", position = 1)
	private long id;

	@ApiModelProperty(notes = "The car brand", position = 2)
	private String brand;

	@ApiModelProperty(notes = "The car year", position = 3)
	private int year;
	
	@ApiModelProperty(notes = "The car color", position = 4)
	private String color;

}
