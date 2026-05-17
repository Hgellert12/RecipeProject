package com.hajdugellert.recipelens.dto;

import java.time.LocalDate;
import java.util.List;

public record IngredientScanResponse(
        Long id,
        List<String> detectedIngredients,
        List<String> detectedLabels,
        String fileName,
        LocalDate createdAt







)


{

}
