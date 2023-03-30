package com.usa.reto3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "car")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarEntity {
    @Id
    private int ID;
    private String BRAND;
    private int MODEL;
    private int CATEGORY_ID;
}
