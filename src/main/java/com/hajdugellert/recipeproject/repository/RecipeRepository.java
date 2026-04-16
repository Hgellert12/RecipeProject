package com.hajdugellert.recipeproject.repository;
import com.hajdugellert.recipeproject.entity.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    List<Recipe> findByNameIgnoringCase(String name);
    List<Recipe> findByCategoryIgnoringCase(String category);
    List<Recipe> findByFavorite(Boolean favorite);




}
