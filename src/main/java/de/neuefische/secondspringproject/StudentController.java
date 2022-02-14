package de.neuefische.secondspringproject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @GetMapping
    public List<Student> getStudents(){
        Student s1 = new Student("Klaus");
        Student s2 = new Student("Maria");
        List<Student> xs = new ArrayList<>();
        xs.add(s1);
        xs.add(s2);
        return xs;
    }
}
