package com.cardapio.Cardapio.controllers;

import com.cardapio.Cardapio.entites.Food;
import com.cardapio.Cardapio.entites.FoodRequestDTO;
import com.cardapio.Cardapio.entites.FoodResponseDTO;
import com.cardapio.Cardapio.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodControler {

    @Autowired
    private FoodRepository foodRepository;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void saveFood(@RequestBody FoodRequestDTO data){
        Food foodData = new Food(data);
        foodRepository.save(foodData);
        return;
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<FoodResponseDTO> getAll() {
        List<FoodResponseDTO> foodList = foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
        return foodList;
    }
}
