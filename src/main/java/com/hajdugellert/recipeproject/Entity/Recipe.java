package com.hajdugellert.recipeproject.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private String category;
    private String ingredients;
    private String instructions;
    private Integer prepTime;
    private Double cost;
    private Boolean favorite =false;


}
