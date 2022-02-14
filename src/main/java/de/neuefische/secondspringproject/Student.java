package de.neuefische.secondspringproject;

import java.util.List;
import java.util.UUID;

public class Student {
    private UUID id;
    private String name;


    public Student(String name) {
        this.id = UUID.randomUUID() ;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public UUID getId() {
        return id;
    }
}
