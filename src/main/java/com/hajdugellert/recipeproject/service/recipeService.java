package com.hajdugellert.recipeproject.service;
import com.hajdugellert.recipeproject.repository.RecipeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hajdugellert.recipeproject.entity.*;

import java.util.List;

@Service
public class recipeService {
@Autowired
private RecipeRepository recipeRepository;

public Recipe createRecipe(Recipe recipe)
{
    return recipeRepository.save(recipe);
}
public List<Recipe> getAllRecipes()
{
    return recipeRepository.findAll();
}
public Recipe getRecipeById(Long ID)
{
    return recipeRepository.findById(ID).orElse(null);
}
public List<Recipe> getByName(String name)
{
    return recipeRepository.findByNameContainingIgnoringCase(name);
}
public List<Recipe> getByCategory(String category)
{
    return recipeRepository.findByCategoryIgnoringCase(category);
}
public List<Recipe> getByFavorite(Boolean Favorite)
{
    return recipeRepository.findByFavorite(Favorite);
}
}
