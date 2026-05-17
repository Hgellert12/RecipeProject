package com.hajdugellert.recipelens.controller;

import com.hajdugellert.recipelens.dto.IngredientScanResponse;
import com.hajdugellert.recipelens.dto.RecipeMatchResponse;
import com.hajdugellert.recipelens.dto.RecipeResponse;
import com.hajdugellert.recipelens.service.IngredientScanService;
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
    public ResponseEntity<List<RecipeMatchResponse>> getRecipeRecommendationsFromPicture(@PathVariable Long scanId)
    {
        return ResponseEntity.ok(ingredientScanService.getRecipeRecommendationsFromPicture(scanId));
    }




}
