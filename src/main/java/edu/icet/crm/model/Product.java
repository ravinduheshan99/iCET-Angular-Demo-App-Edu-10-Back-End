package edu.icet.crm.model;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class Product {

    private String name;
    private String description;
    private BigDecimal price;

}
