package com.github.ygor_calimanis.global_solution.service;

import java.util.List;

import com.github.ygor_calimanis.global_solution.model.Drone;
import com.github.ygor_calimanis.global_solution.repository.DroneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DroneService {

	@Autowired
	private DroneRepository droneRepository;

	public List<Drone> list(){
		return droneRepository.findAll();
	}
	public Drone save(Drone drone){
		return droneRepository.save(drone);
	}
}
