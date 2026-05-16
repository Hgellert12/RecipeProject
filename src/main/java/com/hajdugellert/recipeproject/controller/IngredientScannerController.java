package com.hajdugellert.recipeproject.controller;

import com.hajdugellert.recipeproject.dto.IngredientScanResponse;
import com.hajdugellert.recipeproject.entity.IngredientScan;
import com.hajdugellert.recipeproject.service.IngredientScanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

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




}
