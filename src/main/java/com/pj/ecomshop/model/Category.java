package com.pj.ecomshop.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_id",referencedColumnName = "id")
    private List<Product> products;
}
