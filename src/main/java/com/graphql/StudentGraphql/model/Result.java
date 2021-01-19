package com.graphql.StudentGraphql.model;

import lombok.*;

import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result {

    private int year;
    private String percentage;
    private Boolean success;
    private String topSubject;
    private List<Subject> subjects;
}
