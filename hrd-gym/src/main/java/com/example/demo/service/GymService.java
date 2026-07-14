package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dao.GymDAO;
import com.example.demo.dto.MembershipPlanDTO;
import com.example.demo.dto.TrainerDTO;

@Service
public class GymService {

    private final GymDAO gymDAO;

    public GymService(GymDAO gymDAO) {
        this.gymDAO = gymDAO;
    }

    public List<MembershipPlanDTO> getPlans() {
        return gymDAO.findPlans();
    }

    public List<TrainerDTO> getTrainers() {
        return gymDAO.findTrainers();
    }
}
