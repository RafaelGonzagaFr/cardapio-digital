package com.example.cardapio.food;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record FoodRequestDTO(String id, @NotBlank String title, @NotBlank String image, @NotNull Integer price) {

}