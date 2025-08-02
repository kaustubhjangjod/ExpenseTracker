package com.kaustubh.expensetracker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.kaustubh.expensetracker.repository.CategoryRepository;
import com.kaustubh.expensetracker.model.Category;

import java.util.*;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    
    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping
    public List<Category> getAllCategories(){
        return categoryRepository.findAll();  //Spring Boot sees that you returned a List<Category> and: Automatically converts it to JSON
    }
}
