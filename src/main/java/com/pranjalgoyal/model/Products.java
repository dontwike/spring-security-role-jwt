package com.pranjalgoyal.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Products {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long id;

    public String name;

    public double price;
}
