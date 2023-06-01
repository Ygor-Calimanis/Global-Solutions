package com.github.ygor_calimanis.global_solution.repository;

import com.github.ygor_calimanis.global_solution.model.Drone;

import java.util.ArrayList;
import java.util.List;

public class DroneMockup {

    public static List<Drone> list(){
        List<Drone> drones = new ArrayList<>();

        drones.add(new Drone());

        return drones;
    }

}
