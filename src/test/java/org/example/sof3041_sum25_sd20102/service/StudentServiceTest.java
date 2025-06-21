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
    void addStudentWithInvalidName() {
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.addStudent(new Student(1, "", 20, 9.0)));
        assertEquals("Name must not be null or empty", exception.getMessage());
    }

    @Test
    void addStudentWithInvalidAge() {

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                studentService.addStudent(new Student(1, "Alice", 15, 9.0)));
        assertEquals("Age must be greater than 18", exception.getMessage());
    }

    @Test
    void addStudentWithInvalidMark() {

        Exception exception = assertThrows(IllegalArgumentException.class, () ->
                studentService.addStudent(new Student(1, "Alice", 20, 11.0)));

        assertEquals("Mark must be between 0 and 10", exception.getMessage());
    }

    // update
    @Test
    void updateStudentWithValidStudent() {

        Student student = new Student(1, "Alice", 20, 9.0);
        studentService.addStudent(student);

        student.setName("Bob");
        student.setAge(21);
        student.setMark(8);

        studentService.updateStudent(student);

        assertEquals("Bob", studentService.getStudentById(1).getName());
        assertEquals(21, studentService.getStudentById(1).getAge());
        assertEquals(8.0, studentService.getStudentById(1).getMark());

    }

    @Test
    void updateStudentWithNull() {

        Exception exception = assertThrows(IllegalArgumentException.class, () -> studentService.updateStudent(null));
        assertEquals("Student can not be null", exception.getMessage());
    }

    @Test
    void updateStudentWithInvalidName() {
        Student student = new Student(1, "Alice", 20, 9.0);
        studentService.addStudent(student);
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.updateStudent(new Student(1, "", 20, 9.0)));
        assertEquals("Name must not be null or empty", exception.getMessage());
    }

    @Test
    void updateStudentWithInvalidAge() {
        Student student = new Student(1, "Alice", 20, 9.0);
        studentService.addStudent(student);
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.updateStudent(new Student(1, "Alice", 17, 9.0)));
        assertEquals("Age must be greater than 18", exception.getMessage());
    }

    @Test
    void updateStudentWithInvalidId() {
        Student student = new Student(1, "Alice", 20, 9.0);
        studentService.addStudent(student);
        Exception exception = assertThrows(IllegalArgumentException.class,
                () -> studentService.updateStudent(new Student(2, "Bob", 21, 8.0)));
        assertEquals("Student with id 2 does not exist", exception.getMessage());

        Exception exceptionV2 = assertThrows(IllegalArgumentException.class,
                () -> studentService.updateStudentV2(new Student(2, "Bob", 21, 8.0)));
        assertEquals("Student with id 2 does not exist", exceptionV2.getMessage());
    }

}