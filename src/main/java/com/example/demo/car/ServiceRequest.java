package com.example.demo.car;

import lombok.*;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@AllArgsConstructor
@Getter
@Setter
@ApiModel(description="Request for repair service.")
public class ServiceRequest {

	@ApiModelProperty(notes = "When", example="2020-04-02", position = 1)
	private String when;

	@ApiModelProperty(notes = "Where", example="Auto Zone", position = 2)
	private String where;

}
