package com.example.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Show {
    private final String title;
    private final Integer releaseYear;
}
