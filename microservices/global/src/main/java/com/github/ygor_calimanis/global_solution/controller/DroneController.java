package com.github.ygor_calimanis.global_solution.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.github.ygor_calimanis.global_solution.controller.dto.DroneRequestCreate;
import com.github.ygor_calimanis.global_solution.controller.dto.DroneRequestUpdate;
import com.github.ygor_calimanis.global_solution.controller.dto.SearchDrone;
import com.github.ygor_calimanis.global_solution.repository.DroneRepository;
import com.github.ygor_calimanis.global_solution.service.DroneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.github.ygor_calimanis.global_solution.model.Drone;

@RestController
@RequestMapping("/drones")
public class DroneController {

    // swagger ui doc
    @Autowired
    private DroneService droneService;
    @Autowired
    private DroneRepository droneRepository;

    // listagem dos dados
    @GetMapping
    public ResponseEntity<List<SearchDrone>> listAll() {
        List<SearchDrone> result =
                droneService.list().stream().map(SearchDrone::toDto).collect(Collectors.toList());
        return ResponseEntity.ok(result);
    }

    // cadastro dos dados
    @PostMapping
    public ResponseEntity<Drone> create(@RequestBody DroneRequestCreate dto) {
        Drone drone = new Drone();
        drone.setName(dto.getName());
        drone.setLatitude(dto.getLatitude());
        drone.setLongitude(dto.getLongitude());
        drone.setHeight(dto.getHeight());
        drone.setSpeed(dto.getSpeed());
        drone.setDirection(dto.getDirection());
        drone.setDateHour(dto.getDateHour());

        Drone result = droneService.save(drone);

        return ResponseEntity.status(HttpStatus.CREATED).body(result);
    }

    // alteração dos dados
    @PutMapping
    public ResponseEntity<Drone> update(@RequestBody DroneRequestUpdate dto) {

        // verifica se o id já foi informado

        boolean exists = droneRepository.existsById(dto.getId());
        if (!exists) {
            return ResponseEntity.notFound().build();
        }

        Drone drone = new Drone();
        // mapping
        drone.setId(dto.getId());
        drone.setName(dto.getName());
        drone.setLatitude(dto.getLatitude());
        drone.setLongitude(dto.getLongitude());
        drone.setHeight(dto.getHeight());
        drone.setSpeed(dto.getSpeed());
        drone.setDirection(dto.getDirection());
        drone.setDateHour(dto.getDateHour());

        Drone result = droneService.save(drone);
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(result);
    }

    // deleta os dados

    @DeleteMapping(value = "{id}")
    public ResponseEntity<String> delete(@PathVariable Long id) {
        boolean exists = droneRepository.existsById(id);
        if (!exists) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body("ID not found");
        }
        droneRepository.deleteById(id);
        return ResponseEntity.accepted().build();
    }

//    // thymeleaf
//    @RequestMapping("/")
//    public String index() {
//        return "index";
//    }
//
//    @RequestMapping(value = "/form", method = RequestMethod.GET)
//    public String form() {
//        return "/form.html";
//    }
//
//    @RequestMapping(value = "/list", method = RequestMethod.GET)
//    public String list() {
//        return "/list.html";
//    }
//
//    @RequestMapping(value = "/save", method = RequestMethod.POST)
//    public String save(Drone drone) {
//        System.out.println(drone.getId());
//        System.out.println(drone.getName());
//        System.out.println(drone.getLatitude());
//        System.out.println(drone.getLongitude());
//        System.out.println(drone.getHeight());
//        System.out.println(drone.getSpeed());
//        System.out.println(drone.getDirection());
//        System.out.println(drone.getDateHour());
//        return "/form.html";
//    }
}
