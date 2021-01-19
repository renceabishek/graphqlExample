package com.graphql.StudentGraphql.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.StudentGraphql.model.Address;
import com.graphql.StudentGraphql.model.Result;
import com.graphql.StudentGraphql.model.Student;
import com.graphql.StudentGraphql.service.StudentService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentResolver implements GraphQLResolver<Student> {

    private final StudentService studentService;

    public StudentResolver(StudentService studentService) {
        this.studentService = studentService;
    }

    public Address address(Student student) {
        return studentService.fetchAddress(student.getId());
    }

    public List<Result> results(Student student, int year) {
        return studentService.results(year);
    }
}
