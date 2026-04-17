package com.hajdugellert.recipeproject.controller;
import com.hajdugellert.recipeproject.entity.Recipe;
import jakarta.validation.Valid;
import com.hajdugellert.recipeproject.service.recipeService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/recipes")
public class recipeController {
    private final recipeService recipeService;


    public recipeController(recipeService recipeService) {
        this.recipeService = recipeService;
    }
    @PostMapping
    public Recipe createRecipe(@Valid @RequestBody Recipe newRecipe)
    {
        return recipeService.createRecipe(newRecipe);
    }
    @GetMapping
    public List<Recipe> getAllRecipes()
    {
        return recipeService.getAllRecipes();
    }
    @GetMapping("/{id}")
    public Recipe getRecipeById(@PathVariable Long id)
    {
        return recipeService.getRecipeById(id);
    }
    @PutMapping("/{id}")
    public Recipe updateRecipe(@PathVariable Long id, @Valid @RequestBody Recipe recipe)
    {
        return recipeService.updateRecipe(id, recipe);
    }
    @DeleteMapping("/{id}")
    public void deleteRecipe(@PathVariable Long id)
    {
        recipeService.deleteRecipe(id);
    }
    @GetMapping("/search")
    public List<Recipe> getRecipeByName(@RequestParam String name)
    {
        return recipeService.getByName(name);
    }

    @GetMapping("/category/{category}")
    public List<Recipe> getRecipeByCategory(@PathVariable String category)
    {
        return recipeService.getByCategory(category);
    }

    @GetMapping("/favorites")
    public List<Recipe> getFavoriteRecipes()
    {
        return recipeService.getByFavorite(true);
    }




}
