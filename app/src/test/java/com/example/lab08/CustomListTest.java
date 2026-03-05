package com.example.lab08;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City vancouver = new City("Vancouver", "BC");
        list.addCity(vancouver);
        list.deleteCity(vancouver);

        assertFalse(list.hasCity(vancouver));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City vancouver = new City("Vancouver", "BC");

        list.addCity(calgary);
        list.addCity(vancouver);

        assertEquals(2, list.countCities(list));

    }
}
