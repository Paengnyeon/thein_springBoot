package com.example.demo.dto;

public class TrainerDTO {

    private String name;
    private String specialty;
    private String intro;

    public TrainerDTO() {
    }

    public TrainerDTO(String name, String specialty, String intro) {
        this.name = name;
        this.specialty = specialty;
        this.intro = intro;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getIntro() {
        return intro;
    }

    public void setIntro(String intro) {
        this.intro = intro;
    }
}
