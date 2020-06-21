package com.example.fridgy.dao;

import com.example.fridgy.model.Food;
import java.util.UUID;

public interface FoodDao {

    int insertFood(UUID id, Food food);

    default int insertFood(Food food){
        UUID id = UUID.randomUUID();
                return insertFood(id, food);
    }
}
