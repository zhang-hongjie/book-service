/* Copyright © 2015 Oracle and/or its affiliates. All rights reserved. */
package com.example.spring.rest;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface BookRepository extends PagingAndSortingRepository<Book, Long> {
           
    Book findByIsbn(@Param("isbn") String isbn);
    
    @RestResource(path="getBooksByAuthor")
    List<Book> findByAuthorIgnoreCaseOrderByTitleAsc(@Param("author") String author);
    
    @Query("SELECT b FROM Book b WHERE b.published BETWEEN :startYear AND :endYear ORDER BY b.published")
    List<Book> getBooksBetweenYears(@Param("startYear") int startYear, @Param("endYear") int endYear);
    
    List<Book> findByTitleContaining(@Param("title") String title);
   
    int countByAuthor(@Param("author") String author);
}
