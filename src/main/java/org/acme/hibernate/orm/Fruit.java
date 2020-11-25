package org.acme.hibernate.orm;


import javax.persistence.Cacheable;
import javax.persistence.Column;
import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Cacheable
public class Fruit extends PanacheEntity {

    @Column(length = 40, unique = true)
    public String name;

    public Fruit() {
    }

    public boolean isEmpty() {
        return name == null || name.trim().length() == 0;
    }

    public Fruit(String name) {
        this.name = name;
    }
}