package com.usa.reto3.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientEntity {
    @Id
    private int ID;
    private String NAME;
    private String EMAIL;
    private int AGE;
}
