package com.hajdugellert.recipeproject.controller;

import com.hajdugellert.recipeproject.dto.IngredientScanResponse;
import com.hajdugellert.recipeproject.dto.RecipeResponse;
import com.hajdugellert.recipeproject.entity.IngredientScan;
import com.hajdugellert.recipeproject.service.IngredientScanService;
import io.opencensus.trace.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@RequestMapping("/ingredient-scans")
public class IngredientScannerController {
    private  final IngredientScanService ingredientScanService;
    public IngredientScannerController(IngredientScanService ingredientScanService) {
        this.ingredientScanService = ingredientScanService;
    }
    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<IngredientScanResponse> scanImage(@RequestParam("file") MultipartFile file)
    {
        return ResponseEntity.ok(ingredientScanService.scanImage(file));
    }
    @PostMapping("/recommendations/fromscan/{scanId}")
    public ResponseEntity<List<RecipeResponse>> getRecipeRecommendationsFromPicture(@PathVariable Long scanId)
    {
        return ResponseEntity.ok(ingredientScanService.getRecipeRecommendationsFromPicture(scanId));
    }




}
