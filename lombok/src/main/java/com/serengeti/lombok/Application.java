package com.serengeti.lombok;

import com.serengeti.lombok.entity.Order;
import com.serengeti.lombok.entity.Product;

import java.util.UUID;

public class Application
{
    public static void main(String[] args)
    {
Order order = Order.builder().name("Apple").code(UUID.randomUUID()).build();
order.setName("Apple");
order.setCode(UUID.randomUUID());

System.out.printf("Name: %s %n", order.getName());
System.out.println(order);
    }
}
