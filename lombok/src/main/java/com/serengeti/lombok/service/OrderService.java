package com.serengeti.lombok.service;

import com.serengeti.lombok.entity.Order;

import java.util.UUID;

public interface OrderService
{

    void add(Order order);

    void remove(UUID code);
}
