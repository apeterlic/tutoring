package com.serengeti.lombok.service;

import com.serengeti.lombok.entity.Order;
import com.serengeti.lombok.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class DefaultOrderService implements OrderService
{

    private final OrderRepository orderRepository;

    public DefaultOrderService(OrderRepository orderRepository)
    {
        this.orderRepository = orderRepository;
    }

    @Override
    public void add(Order order)
    {
        log.info("Adding new order: {}", order);
        orderRepository.save(order);
    }

    @Override
    public void remove(UUID code)
    {
        log.info("Removing order by code: {}", code);
        orderRepository.deleteByCode(code);
    }
}
