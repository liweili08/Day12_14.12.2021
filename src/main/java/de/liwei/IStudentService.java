package de.liwei;

import de.liwei.model.Student;

import java.util.List;

public interface IStudentService {
    public static final String name = "Daniel";
    public static final int studentID = 2021002;
    public static final int age = 18;

      String getName();
     int getAge();
      int getStudentID();

    List<Student> getStudents();
}

