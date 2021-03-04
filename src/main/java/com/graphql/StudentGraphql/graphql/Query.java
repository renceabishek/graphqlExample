package com.graphql.StudentGraphql.graphql;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.graphql.StudentGraphql.model.Student;
import com.graphql.StudentGraphql.service.StudentService;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

    private final StudentService studentService;

    public Query(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<Student> students() throws IOException {
        return studentService.getAllStudents();
    }

}
