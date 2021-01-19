package com.graphql.StudentGraphql.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentPost {

    private String name;
    private Std standard;
}
