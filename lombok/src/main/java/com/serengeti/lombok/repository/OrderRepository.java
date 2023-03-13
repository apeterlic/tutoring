package com.serengeti.lombok.repository;

import com.serengeti.lombok.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>
{
    void deleteByCode(UUID code);
}
