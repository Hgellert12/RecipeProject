package com.hajdugellert.recipeproject.dto;

import java.util.List;

public record RecipeMatchResponse
        (
                RecipeResponse recipe,
                List<String> matchedIngredients,
                List<String> missingIngredients,
                Double matchPercentage



        ){
}
