package de.neuefische.secondspringproject;

import java.util.List;
import java.util.UUID;

public class Student {
    private String id;
    private String name;


    public Student() {
        this.id = UUID.randomUUID().toString();
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
