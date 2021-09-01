package com.graphql.StudentGraphql.controller;

import com.graphql.StudentGraphql.model.Address;
import com.graphql.StudentGraphql.model.Std;
import com.graphql.StudentGraphql.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
@RequestMapping("/student")
public class StudentController {

    @GetMapping
    public List<Student> getAllStudents() {
        List<Student> st = IntStream.range(0,2).mapToObj(f-> {
            Student student=new Student();
            student.setId((short)f);
            student.setStandard(Std.FIRST);
            //student.setAddress(new Address(f,"ra","Chennai","TN"));
            return student;
        }).collect(Collectors.toList());

        st.get(0).setName("Abishek");
        st.get(1).setName("Karthick");

        return st;
    }
}
