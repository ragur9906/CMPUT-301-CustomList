package com.example.simpleparadox.listycity;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    private City mockCity() {
        return new City("Edmonton", "Alberta");
    }

    @BeforeEach
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(mockCity());
        assertEquals(listSize + 1, list.getCount());
    }

    @Test
    void hasCityTest() {
        assertFalse(list.hasCity(mockCity()));

        list.addCity(mockCity());

        assertTrue(list.hasCity(mockCity()));
    }

//    @Test
//    void deleteTest() {
//        list.addCity(mockCity());
//        list.delete(mockCity());
//        assertFalse(list.hasCity(mockCity()));
//
//        assertThrows(IllegalArgumentException.class, () -> {
//            list.delete(mockCity());
//        });
//    }
//
//    @Test
//    void countCitiesTest() {
//        assertEquals(0, list.countCities());
//
//        City city = new City("Regina", "Saskatchewan");
//        list.addCity(city);
//        assertEquals(1, list.countCities());
//
//        list.addCity(mockCity());
//        assertEquals(2, list.countCities());
//
//        list.delete(city);
//        assertEquals(1, list.countCities());
//    }
}
