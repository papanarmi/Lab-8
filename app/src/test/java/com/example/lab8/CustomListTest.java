package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }

    /**
     * get the size of the list
     * increase the list by adding a new city
     * check if our current size matches the initial size
     plus one
     */
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(),listSize + 1);
    }

    /**
     * adds cities to the list
     * checks if correct number of cities in the list
     */
    @Test
    public void countCitiesTest() {
        list.addCity(new City("abc", "abcd"));
        list.addCity(new City("lmn", "lmno"));

        assertEquals(2, list.getCount());
    }

    /**
     * adds cities to the list
     * deletes a city
     * checks if correct number of cities in the list
     */
    @Test
    public void deleteCitiesTest() {
        list.addCity(new City("abc", "abcd"));
        list.addCity(new City("lmn", "lmno"));

        list.deleteCity(1);

        assertEquals(2, list.getCount());
    }
}
