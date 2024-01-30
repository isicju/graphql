package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class QueryResolver {
//    @QueryMapping
    public List<User> users() {
        return Arrays.asList(
                new User(1L, "user1", "user1@example.com"),
                new User(2L, "user2", "user2@example.com"),
                new User(3L, "user3", "user3@example.com")
        );
    }
}