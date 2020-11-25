package org.acme.hibernate.orm;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FruitTest {

    @Test
    public void shouldReturnEmpty() {
        Assertions.assertTrue(new Fruit("").isEmpty());
        Assertions.assertTrue(new Fruit(null).isEmpty());
    }

    @Test
    public void shouldReturnNotEmpty() {
        Assertions.assertFalse(new Fruit("Apple").isEmpty());
    }

}