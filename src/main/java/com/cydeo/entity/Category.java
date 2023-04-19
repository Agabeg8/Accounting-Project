package com.cydeo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "categories")
public class Category extends BaseEntity{

    private String description;
    @ManyToOne(fetch = FetchType.LAZY)
    private Company company;
}
