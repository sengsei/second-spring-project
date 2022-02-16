package de.neuefische.secondspringproject;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class StudentServiceTest {

    @Test
    void shouldNotReturnNullMock() {
        List<Student> students = List.of(new Student(), new Student());

        StudentDatabase studentDatabaseMock = mock(StudentDatabase.class);
        when(studentDatabaseMock.getStudents()).thenReturn(students);

        StudentService studentService = new StudentService(studentDatabaseMock);
        List<Student> result = studentService.getStudents();

        assertEquals(students, result);
    }

   @Test
    void testCreateStudent() {
       Student student = new Student();

       StudentDatabase dbMock = mock(StudentDatabase.class);

       StudentService service = new StudentService(dbMock);
       service.createStudent(student);

       verify(dbMock).createStudent(student);
   }

}