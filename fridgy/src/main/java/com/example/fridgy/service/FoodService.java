package com.example.fridgy.service;

import com.example.fridgy.dao.FoodDao;
import com.example.fridgy.model.Food;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FoodService {

    private final FoodDao foodDao;

    @Autowired
    public FoodService(@Qualifier("foodDao") FoodDao foodDao) {
        this.foodDao = foodDao;
    }

    public int addFood(Food food){
        return foodDao.insertFood(food);
    }

}
