package com.cydeo.entity;

import com.cydeo.enums.ProductUnit;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //DB tables created
@Data
@NoArgsConstructor
@Table(name = "products")
public class Product extends BaseEntity{

    private String name;
    private int quantityInStock;
    private int lowLimitAlert;
    @Enumerated(EnumType.STRING)
    private ProductUnit productUnit;
    @ManyToOne(fetch = FetchType.EAGER)
    private Category category;
}
