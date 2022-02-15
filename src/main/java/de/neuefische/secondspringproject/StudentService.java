package de.neuefische.secondspringproject;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void createStudent(Student student) {
        students.add(student);
    }

    public Student getSpezialStudent(String searchValue) {
        for (Student student : students){
            if (student.getName().equals(searchValue)){
                return student;
            }
        }
        return null;
    }
}
