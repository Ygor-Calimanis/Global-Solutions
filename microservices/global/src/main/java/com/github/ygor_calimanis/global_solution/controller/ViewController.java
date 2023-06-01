package com.github.ygor_calimanis.global_solution.controller;

import com.github.ygor_calimanis.global_solution.model.Drone;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/drones")
public class ViewController {
    // thymeleaf
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public String form(Model model) {
        model.addAttribute("drone", new Drone());
        return "form";
    }

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public String list() {
        return "list";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save() {
        return "form";
    }
}
