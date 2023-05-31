package com.github.ygor_calimanis.global_solution.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "Drones")
public class Drone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	@Column(name = "Drone")
	private String name;
	@Column(name = "Latitude")
	private double latitude;
	@Column(name = "Longitude")
	private double longitude;
	@Column(name = "Altura")
	private int height;
	@Column(name = "Velocidade")
	private int speed;
	@Column(name = "Direção")
	private int direction;
	@Column(name = "Data_Hora")
	private LocalDateTime dateHour;
}