package com.hajdugellert.recipelens.mapper;

import com.hajdugellert.recipelens.dto.IngredientScanResponse;
import com.hajdugellert.recipelens.entity.IngredientScan;

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
