package com.rakadiou.domain;

import lombok.ToString;

@ToString
public class Team {
    private float id;
    private String name;

    public String getTla() {
        return tla;
    }

    public void setTla(String tla) {
        this.tla = tla;
    }

    private String tla;


    // Getter Methods

    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    // Setter Methods

    public void setId(float id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
