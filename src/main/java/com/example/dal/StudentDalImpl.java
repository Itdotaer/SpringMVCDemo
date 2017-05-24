package com.example.dal;

import com.example.beans.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt_hu on 2017/5/22.
 */
@Component
public class StudentDalImpl implements StudentDal {

    @Autowired
    public StudentDalImpl(){
    }

    public List<Student> getStudents(){
        List<Student> students = new ArrayList<Student>();

        Student student = new Student();
        student.setId(1);
        student.setName("jt_hu");
        student.setAge(27);
        student.setSex(false);
        student.setSchool("WIT");

        students.add(student);

        return students;
    }

}
