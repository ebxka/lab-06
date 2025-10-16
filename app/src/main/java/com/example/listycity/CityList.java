package com.example.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();
    /**
     * This adds a city to the list if the city does not exist
     * @param city
     * This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }
    /**
     * This returns a sorted list of cities
     * @return
     * Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * Checks if a city is in the list
     * @param city
     * @return
     * Returns true if it is and false if it isn't
     */
    public boolean hasCity(City city){
        if(cities.contains(city)){
            return true;
        }
        return false;
    }

    /**
     * Deletes a city from the list if it is in the list
     * @param city
     */
    public void deleteCity(City city){
        if(hasCity(city)){
            cities.remove(city);
        }else{
            throw new IllegalArgumentException();
        }
    }

    /**
     * Returns how many cities are in the list
     * @return
     * Returns how many cities are in the list
     */
    public int countCities(){
        return cities.size();
    }
}
