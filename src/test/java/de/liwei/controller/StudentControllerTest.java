package de.liwei.controller;

import de.liwei.StudentService;
import de.liwei.model.Student;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.mockito.Mockito.*;

import static org.junit.jupiter.api.Assertions.*;

class StudentControllerTest {

    @Test
    void getStudents(){
        StudentService service = mock(StudentService.class);
        StudentController controller = new StudentController(service);
        Student testStudent = new Student();
        testStudent.setName("Anna");
        when (service.getStudents()).thenReturn(List.of(testStudent));
        List<Student> testList = controller.getStudents();
        assertEquals(1,testList.size());
        assertEquals(testStudent, testList.get(0));
    }


}