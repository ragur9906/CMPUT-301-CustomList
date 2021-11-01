package com.example.simpleparadox.listycity;

public class City implements Comparable<City> {
    private String city;
    private String province;

    /**
     * City constructor
     * @param city
     * @param province
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This is used to get the name of the city
     * @return
     *  Returns the name of the city
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This is used to get the name of the province
     * @return
     *  Returns the name of the province
     */
    String getProvinceName(){
        return this.province;
    }

    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }

    @Override
    public boolean equals(Object obj) {
        return this.compareTo((City) obj) == 0;
    }
}
