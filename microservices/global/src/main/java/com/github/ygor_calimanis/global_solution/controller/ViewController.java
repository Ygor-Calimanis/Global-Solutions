package com.github.ygor_calimanis.global_solution.controller;

import com.github.ygor_calimanis.global_solution.model.Drone;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/drones")
public class ViewController {
    // thymeleaf
    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String form() {
        return "form";
    }

    @RequestMapping(value = "list", method = RequestMethod.GET)
    public String list() {
        return "list";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Drone drone) {
        System.out.println(drone.getId());
        System.out.println(drone.getName());
        System.out.println(drone.getLatitude());
        System.out.println(drone.getLongitude());
        System.out.println(drone.getHeight());
        System.out.println(drone.getSpeed());
        System.out.println(drone.getDirection());
        System.out.println(drone.getDateHour());
        return "form";
    }
}
