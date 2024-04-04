package com.cardapio.Cardapio.entites;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name = "foods")
@Table(name = "foods")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String img;
    private Integer price;

    public Food(FoodRequestDTO data){
        this.title = data.title();
        this.img = data.img();
        this.price = data.price();
    }
}
