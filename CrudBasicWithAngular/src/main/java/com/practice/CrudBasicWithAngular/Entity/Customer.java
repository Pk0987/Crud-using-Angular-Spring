package com.practice.CrudBasicWithAngular.Entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    private String phone;
}
