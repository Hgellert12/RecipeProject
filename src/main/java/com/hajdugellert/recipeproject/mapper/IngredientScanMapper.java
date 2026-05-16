package com.hajdugellert.recipeproject.mapper;

import com.hajdugellert.recipeproject.dto.IngredientScanResponse;
import com.hajdugellert.recipeproject.entity.IngredientScan;

public class IngredientScanMapper {
    public static IngredientScanResponse toResponse(IngredientScan ingredientScan)
    {
        return new IngredientScanResponse(
                ingredientScan.getId(),
                ingredientScan.getDetectedIngredients(),
                ingredientScan.getDetectedLabels(),
                ingredientScan.getFileName(),
                ingredientScan.getCreatedAt()
        );
    }
}
