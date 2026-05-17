package com.hajdugellert.recipelens.repository;

import com.hajdugellert.recipelens.entity.IngredientScan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientScanRepository extends JpaRepository<IngredientScan, Long> {
    
}
