package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.service.GymService;

@Controller
public class GymController {

    private final GymService gymService;

    public GymController(GymService gymService) {
        this.gymService = gymService;
    }

    @GetMapping({"/", "/home", "/gym"})
    public String home(Model model) {
        model.addAttribute("plans", gymService.getPlans());
        model.addAttribute("trainers", gymService.getTrainers());

        return "gym";
    }
}
