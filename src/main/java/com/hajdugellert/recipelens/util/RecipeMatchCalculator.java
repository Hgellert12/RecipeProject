package com.hajdugellert.recipelens.util;

import com.hajdugellert.recipelens.dto.RecipeMatchResponse;
import com.hajdugellert.recipelens.entity.Recipe;
import com.hajdugellert.recipelens.mapper.RecipeMapper;

import java.util.List;

public class RecipeMatchCalculator {
    private RecipeMatchCalculator(){}
    public static RecipeMatchResponse calculateMatch(
            Recipe recipe,
            List<String> detectedIngredients
    )
    {
        
        List<String> ingredients = recipe.getIngredients().stream().map(ingredient -> ingredient.toLowerCase()).toList();
        List<String> detectedSafeIngredients = detectedIngredients.stream().map(ingredient -> ingredient.toLowerCase().trim()).toList();
        List<String> matchedIngredients = ingredients.stream().filter(detectedSafeIngredients::contains).toList();
        List<String> missingIngredients = ingredients.stream().filter(ingredient -> !detectedSafeIngredients.contains(ingredient)).toList();
        double matchPercentage = (double) matchedIngredients.size()/ingredients.size()*100;
        return new RecipeMatchResponse(RecipeMapper.toResponse(recipe),matchedIngredients,missingIngredients,matchPercentage);
    }
}
