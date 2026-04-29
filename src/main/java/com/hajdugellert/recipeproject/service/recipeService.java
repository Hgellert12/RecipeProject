package com.hajdugellert.recipeproject.service;
import com.hajdugellert.recipeproject.repository.RecipeRepository;
import com.hajdugellert.recipeproject.repository.UserRepository;
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
    return recipeRepository.findById(ID).orElseThrow(() -> new RuntimeException("Recipe not found"));

}
public List<Recipe> getByName(String name)
{
    return recipeRepository.findByNameContainingIgnoreCase(name);
}
public List<Recipe> getByCategory(String category)
{
    return recipeRepository.findByCategoryIgnoreCase(category);
}
public List<Recipe> getByFavorite(Boolean Favorite)
{
    return recipeRepository.findByFavorite(Favorite);
}
public Recipe updateRecipe(Long id, Recipe newRecipe)
{
    Recipe recipe = getRecipeById(id);
    recipe.setName(newRecipe.getName());
    recipe.setCost(newRecipe.getCost());
    recipe.setDescription(newRecipe.getDescription());
    recipe.setIngredients(newRecipe.getIngredients());
    recipe.setInstructions(newRecipe.getInstructions());
    recipe.setPrepTime(newRecipe.getPrepTime());
    recipe.setCategory(newRecipe.getCategory());
    recipe.setFavorite(newRecipe.getFavorite());
    return recipeRepository.save(recipe);
}
public void deleteRecipe(Long ID)
{
    Recipe recipe = getRecipeById(ID);
    recipeRepository.delete(recipe);


}
public List<Recipe> getByUser(String writtenby)
    {
        return recipeRepository.findByWrittenByUsernameIgnoreCase(writtenby);
    }

}
