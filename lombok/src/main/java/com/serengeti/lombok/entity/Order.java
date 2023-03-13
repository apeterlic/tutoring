package com.serengeti.lombok.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;
import java.util.UUID;

public class Order
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
    private LocalDate updated;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public UUID getCode() {return code;}
    public void setCode(UUID code) {this.code = code;}
    public BigDecimal getAmount() {return amount;}
    public void setAmount(BigDecimal amount) {this.amount = amount;}
    public BigDecimal getVat() {return vat;}
    public void setVat(BigDecimal vat) {this.vat = vat;}
    public OrderType getType() {return type;}
    public void setType(OrderType type) {this.type = type;}
    public boolean isPaid() {return paid;}
    public void setPaid(boolean paid) {this.paid = paid;}
    public PaymentType getPaymentType() {return paymentType;}
    public void setPaymentType(PaymentType paymentType) {this.paymentType = paymentType;}
    public LocalDate getCreated() {return created;}
    public void setCreated(LocalDate created) {this.created = created;}
    public LocalDate getUpdated() {return updated;}
    public void setUpdated(LocalDate updated) {this.updated = updated;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return Objects.equals(id, order.id) &&
                Objects.equals(name, order.name) &&
                Objects.equals(code, order.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, code);
    }
    @Override
    public String toString() {
        return "Order{" + "id=" + id + ", name='" + name + "}";
    }
}
