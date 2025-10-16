package com.example.listycity;

/**
 * City class holds the information about the city, such as it name and province.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;

    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * Returns name of city
     * @return
     * Returns city as a string
     */
    public String getCityName(){
        return this.city;
    }

    /**
     * Returns the name of the province
     * @return
     * Returns the province as a string
     */
    public String getProvinceName(){
        return this.province;
    }

    /**
     * Overriden compareTo function to allow Collections to compare City objects for sorting
     * @param city
     * @return
     * Returns an integer based on the comparison of the city name
     */
    @Override
    public int compareTo(City city) {;
        return this.city.compareTo(city.getCityName());
    }

    /**
     * Overriden equals function to allow city objects to be equated to each other based on name and province
     * @param o
     * @return
     * Returns true if they have the same name and province and/or are the same object, and false otherwise
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        City city = (City) o;
        return this.city.equals(city.getCityName()) && this.province.equals(city.getProvinceName());
    }

    /**
     * Overriden hashCode function to generate a unique hashcode for city objects based on the name and province
     * @return
     * Returns the addition of the hashcodes for the city and province strings
     */
    @Override
    public int hashCode(){
        return city.hashCode() + province.hashCode();
    }
}

