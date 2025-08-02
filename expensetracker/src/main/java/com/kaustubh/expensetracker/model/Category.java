package com.kaustubh.expensetracker.model;

// Needed to make this a database entity
import jakarta.persistence.*;

@Entity // Tells JPA this class maps to a table
@Table(name = "categories") // Optional if class name differs from table name
public class Category{

    @Id //for primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-increment ID
    private int id;

    @Column(nullable = false, length = 50) // Maps to name VARCHAR(50) NOT NULL
    private String name;

    public int getId() {
    return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

}