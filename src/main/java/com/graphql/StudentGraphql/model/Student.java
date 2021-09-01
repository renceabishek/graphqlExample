package com.graphql.StudentGraphql.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Short id;
    private String name;
    private Std standard;
}
