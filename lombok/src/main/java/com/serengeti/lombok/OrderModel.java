package com.serengeti.lombok;

import com.serengeti.lombok.entity.OrderType;
import com.serengeti.lombok.entity.PaymentType;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.UUID;

@Data
public class OrderModel
{
    private Long id;

    private String name;

    private UUID code;

    private BigDecimal amount;

    private BigDecimal vat;

    private OrderType type;

    private boolean paid;

    private PaymentType paymentType;

    private LocalDate created;

}
