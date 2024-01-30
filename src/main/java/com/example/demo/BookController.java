package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    private EmployeeService employeeService;

    @QueryMapping
    public Book bookById(@Argument String id) {
        return Book.getById(id);
    }

    @QueryMapping
    public List<Author> allAuthors() {
        return Author.getAllAuthors();
    }

    @QueryMapping
    public Author authorByName(@Argument String firstName, @Argument String lastName) {
        return Author.getByName(firstName, lastName);
    }

    @SchemaMapping
    public Author author(Book book) {
        return Author.getById(book.authorId());
    }

    @QueryMapping
    public List<Employee> allEmployees(){
        return employeeService.getAllEmployees();
    }


}