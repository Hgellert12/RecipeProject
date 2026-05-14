package com.hajdugellert.recipeproject.vision;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface IngredientDetectionClient {
    List<String> detectLabels(MultipartFile image);
}
