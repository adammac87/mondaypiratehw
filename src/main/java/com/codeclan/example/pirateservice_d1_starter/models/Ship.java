package com.codeclan.example.pirateservice_d1_starter.models;

import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

public class Ship {

    String name;
    @OneToMany(mappedBy = "ship")
    List<Pirate> pirates;


    public Ship(String name, List<Pirate> pirates) {
        this.name = name;
        this.pirates = new ArrayList<Pirate>();
    }
}
