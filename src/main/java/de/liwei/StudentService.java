package de.liwei;

import de.liwei.controller.StudentDB;
import de.liwei.model.Student;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentService implements IStudentService {
    private HashMap<Integer, Student > allStudentMap;

    public Student getOneStudent(){
        return new Student("Daniel",2021002,19);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public int getStudentID() {
        return 0;
    }

    @Override
    public List<Student> getStudents( ) {
        for (Integer key: this.allStudentMap.keySet()) {
            System.out.println("Student: " + key + this.allStudentMap.get(key));
        }
        return List.copyOf(this.allStudentMap.values()) ;
    }


//    @Override
//    public int getStudentId () {
//        return studentID;
//    }
}
/*
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public boolean isMale() {
        return isMale;
    }

    @Override
    public String[] schwerPunkt() {
        String[] schwerPunkt = new String[]{"Mathe", "Infomatik", "ComputerAlgebra"};
        return schwerPunkt;
        }
 */