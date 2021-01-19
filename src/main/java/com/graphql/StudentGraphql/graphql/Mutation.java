package com.graphql.StudentGraphql.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.graphql.StudentGraphql.model.StudentPayload;
import com.graphql.StudentGraphql.model.StudentPost;
import com.graphql.StudentGraphql.service.StudentService;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    private final StudentService studentService;

    public Mutation(StudentService studentService) {
        this.studentService = studentService;
    }

    public StudentPayload createStudentDetails(StudentPost studentPost) {
        return studentService.createStudentDetails(studentPost);
    }
}
