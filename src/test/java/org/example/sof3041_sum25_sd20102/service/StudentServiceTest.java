package org.example.sof3041_sum25_sd20102.service;

import org.example.sof3041_sum25_sd20102.entity.Student;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentServiceTest {

    private StudentService studentService;

    @BeforeEach
    void setUp() {

        studentService = new StudentService();
    }

    // add
    @Test
    void addStudentWithValidStudent() {

        Student student = new Student(1, "Alice", 20, 9.0);
        studentService.addStudent(student);

        assertEquals(1, studentService.getAllStudents().size());
        assertEquals(20, studentService.getStudentById(1).getAge());
    }

    @Test
    void addStudentWithNull() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> studentService.addStudent(null));
        assertEquals("Student can not be null", exception.getMessage());
    }

    @Test
    void addStudentWithInvalidAge() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Student(1, "Alice", 15, 9.0));
        assertEquals("Age must be greater than 18", exception.getMessage());
    }

    @Test
    void addStudentWithInvalidMark() {

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                studentService.addStudent(new Student(1, "Alice", 20, 11.0)));

        assertEquals("Mark must be between 0 and 10", exception.getMessage());
    }
}