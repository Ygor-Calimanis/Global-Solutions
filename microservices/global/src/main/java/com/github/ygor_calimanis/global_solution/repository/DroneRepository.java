package com.github.ygor_calimanis.global_solution.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.ygor_calimanis.global_solution.model.Drone;

@Repository
public interface DroneRepository
	extends JpaRepository<Drone, Long> {

}
