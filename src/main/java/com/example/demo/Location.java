package com.example.demo;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Location {
    private int locationId;
    private String name;
    private String region;
    private String description;
}
