package com.graphql.StudentGraphql.service;

import com.graphql.StudentGraphql.model.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class StudentServiceImp implements StudentService {


    @Override
    public List<Student> getAllStudents() {
        List<Student> st = IntStream.range(0,2).mapToObj(f-> {
            Student student=new Student();
            student.setId(f);
            student.setStandard(Std.FIRST);
            return student;
        }).collect(Collectors.toList());

        st.get(0).setName("Abishek");
        st.get(1).setName("Karthick");

        return st;
    }

    @Override
    public Address fetchAddress(int id) {
        //throw new NullPointerException();
        return new Address(id,"ra","Chennai","TN");
    }

    @Override
    public List<Result> results(int year) {
        return IntStream.range(0,2).mapToObj(f-> {
            Result result =new Result();
            result.setPercentage("90%");
            result.setSuccess(true);
            result.setTopSubject("Maths");
            result.setYear(2000+f);
            return result;
        }).filter(result -> year==0 || result.getYear()==year)
                .collect(Collectors.toList());
    }

    @Override
    public List<String> getAllSubjects(int year) {
        return Arrays.asList("TAMIL","ENGLISH","MATHS");
    }

    @Override
    public StudentPayload createStudentDetails(StudentPost studentPost) {
        return StudentPayload.builder().payloadStatus(PayloadStatus.OK).build();
    }

}
