package com.serengeti.lombok.entity;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Product
{
    private String name;
    private BigDecimal price;
    private BigDecimal weight;
}
