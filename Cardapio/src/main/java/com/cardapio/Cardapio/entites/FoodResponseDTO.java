package com.cardapio.Cardapio.entites;

public record FoodResponseDTO (Long id, String title, String image, Integer price){
    public FoodResponseDTO (Food food){
        this(food.getId(),food.getTitle(), food.getImg(), food.getPrice());

    }
}
