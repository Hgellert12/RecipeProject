package com.hajdugellert.recipelens.dto;

import java.time.LocalDate;
import java.util.List;

public record RecipeResponse(Long id,
                             String name,
                             String description,
                             String category,
                             List<String> ingredients,
                             String instructions,
                             Integer prepTime,
                             Double cost,
                             Boolean favorite,
                             String writtenByUsername,
                             LocalDate createdAt) {}
