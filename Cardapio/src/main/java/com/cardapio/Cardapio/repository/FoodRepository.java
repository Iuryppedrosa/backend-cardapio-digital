package com.cardapio.Cardapio.repository;

import com.cardapio.Cardapio.entites.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
