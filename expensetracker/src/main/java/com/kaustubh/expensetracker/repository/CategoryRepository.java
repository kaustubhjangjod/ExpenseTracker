package com.kaustubh.expensetracker.repository;

import com.kaustubh.expensetracker.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

//<entity, ID type>
public interface CategoryRepository extends JpaRepository <Category, Integer>{
    
}
