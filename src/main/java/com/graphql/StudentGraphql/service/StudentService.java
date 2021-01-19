package com.graphql.StudentGraphql.service;

import com.graphql.StudentGraphql.model.Address;
import com.graphql.StudentGraphql.model.Result;
import com.graphql.StudentGraphql.model.Student;
import com.graphql.StudentGraphql.model.Subject;

import java.util.List;

public interface StudentService {

    List<Student> getAllStudents();

    Address fetchAddress(int id);

    List<Result> results(int year);

    List<String> getAllSubjects(int year);
}
