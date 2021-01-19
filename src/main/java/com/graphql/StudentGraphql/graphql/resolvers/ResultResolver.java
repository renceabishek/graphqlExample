package com.graphql.StudentGraphql.graphql.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.graphql.StudentGraphql.model.Result;
import com.graphql.StudentGraphql.model.Subject;
import com.graphql.StudentGraphql.service.StudentService;
import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Component;


import java.util.List;

@Component
public class ResultResolver implements GraphQLResolver<Result> {

    private final StudentService studentService;

    public ResultResolver(StudentService studentService) {
        this.studentService = studentService;
    }

    public List<String> getSubjects(Result result) {
        return studentService.getAllSubjects(result.getYear());
    }
}
