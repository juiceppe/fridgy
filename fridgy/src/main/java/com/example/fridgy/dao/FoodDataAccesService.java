package com.example.fridgy.dao;

import com.example.fridgy.model.Food;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository("foodDao")
public class FoodDataAccesService implements FoodDao {

    private static List<Food> db = new ArrayList<>();

    @Override
    public int insertFood(UUID id, Food food) {
        db.add(new Food(id, food.getFoodName()));
        return 1;
    }
}
