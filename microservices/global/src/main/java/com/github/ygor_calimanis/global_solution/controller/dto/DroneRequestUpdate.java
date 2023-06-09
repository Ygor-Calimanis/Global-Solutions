package com.github.ygor_calimanis.global_solution.controller.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class DroneRequestUpdate {
	private Long id;
	private String name;
	private double latitude;
	private double longitude;
	private int height;
	private int speed;
	private int direction;
	private LocalDate dateHour;
}

