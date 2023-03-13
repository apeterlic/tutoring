package dev.beenary;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Version;
import java.math.BigDecimal;

@Data
@Entity
public class Item
{
    @Id
    private Long id;

    private String name;

    private BigDecimal price;

    private long stock;

    private long quantity;

    @Version
    private long version;

}
