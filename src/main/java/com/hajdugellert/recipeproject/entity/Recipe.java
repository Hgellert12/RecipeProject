package com.hajdugellert.recipeproject.entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import jakarta.validation.constraints.*;


@Getter
@Setter
@Entity
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String name;
    private String description;
    @NotBlank
    private String category;
    @NotBlank
    private String ingredients;
    @NotBlank
    private String instructions;
    @NotNull
    private Integer prepTime;
    @NotNull
    private Double cost;
    private Boolean favorite =false;


}
