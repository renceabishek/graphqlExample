package com.graphql.StudentGraphql.service;

import com.graphql.StudentGraphql.model.*;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Address fetchAddress(int id);

    List<Result> results(int year);

    List<String> getAllSubjects(int year);

    StudentPayload createStudentDetails(StudentPost studentPost);
}
