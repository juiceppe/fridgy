package com.example.fridgy.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public class Food {
    private final UUID id;
    private final String foodName;

    public Food(@JsonProperty("id") UUID id,
                @JsonProperty("name") String foodName) {
        this.id = id;
        this.foodName = foodName;
    }

    public UUID getId() {
        return id;
    }

    public String getFoodName() {
        return foodName;
    }
}
