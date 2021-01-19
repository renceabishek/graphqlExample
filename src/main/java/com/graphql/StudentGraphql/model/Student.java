package com.graphql.StudentGraphql.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private int id;
    private String name;
    private Std standard;
}
