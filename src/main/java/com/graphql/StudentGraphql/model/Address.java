package com.graphql.StudentGraphql.model;

import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Address {

    private long id;
    private String street;
    private String city;
    private String state;
    private static String country="INDIA";
}
