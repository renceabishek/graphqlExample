package com.graphql.StudentGraphql.service;

import com.graphql.StudentGraphql.model.*;

import java.io.IOException;
import java.util.List;

public interface StudentService {

    List<Student> getAllStudents() throws IOException;

    Address fetchAddress(int id);

    List<Result> results(int year);

    List<String> getAllSubjects(int year);

    StudentPayload createStudentDetails(StudentPost studentPost);
}
