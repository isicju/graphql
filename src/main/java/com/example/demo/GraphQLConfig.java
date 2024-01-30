package com.example.demo;

import graphql.GraphQL;
import graphql.schema.GraphQLSchema;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GraphQLConfig {
//
//    @Bean
//    public GraphQL graphQL(GraphQLSchema graphQLSchema) {
//        return GraphQL.newGraphQL(graphQLSchema).build();
//    }
//
//    @Bean
//    public GraphQLSchema graphQLSchema() {
//        return SchemaParser.newParser()
//                .file("schema.graphqls") // Load schema from the file
//                .resolvers(new QueryResolver().users())
//                .build()
//                .makeExecutableSchema();
//    }

//    @Bean
//    public GraphQL graphQL(GraphQLSchema graphQLSchema) {
//        return GraphQL.newGraphQL(graphQLSchema).build();
//    }
//
//    @Bean
//    public GraphQLSchema graphQLSchema(GraphQL queryResolver) {
//        return SchemaParser.newParser()
//                .file("schema.graphqls") // Load schema from the file
//                .resolvers(queryResolver)
//                .build()
//                .makeExecutableSchema();
//    }
}