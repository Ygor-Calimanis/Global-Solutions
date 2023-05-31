package com.github.ygor_calimanis.global_solution.controller.dto;

import com.github.ygor_calimanis.global_solution.model.Drone;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class SearchDrone {
	private Long id;
	private String name;
	private double latitude;
	private double longitude;
	private int height;
	private int speed;
	private int direction;
	private LocalDateTime dateHour;

	public static  SearchDrone toDto(Drone drone){
		SearchDrone dto = new SearchDrone();
		dto.setId(drone.getId());
		dto.setName(drone.getName());
		dto.setLatitude(drone.getLatitude());
		dto.setLongitude(drone.getLongitude());
		dto.setHeight(drone.getHeight());
		dto.setSpeed(drone.getSpeed());
		dto.setDirection(drone.getDirection());
		dto.setDateHour(drone.getDateHour());
		return dto;
	}
}
