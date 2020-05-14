package com.springcloudproducerrest.producer.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Product {

    private String name;

    private String category;

    private Double value;

    private Integer quantity;

    public Product () {
    }

    public Product (String name, String category, Double value, Integer quantity) {
        super();
        this.name = name;
        this.category = category;
        this.value = value;
        this.quantity = quantity;
    }
    //Getters & Setters omitidos
}
