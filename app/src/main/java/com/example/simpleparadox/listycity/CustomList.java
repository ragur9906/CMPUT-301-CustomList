package com.example.simpleparadox.listycity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    public CustomList(Context context, ArrayList<City> cities){
        super(context,0, cities);
        this.cities = cities;
        this.context = context;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
//        return super.getView(position, convertView, parent);
        View view = convertView;

        if(view == null){
            view = LayoutInflater.from(context).inflate(R.layout.content, parent,false);
        }

        City city = cities.get(position);

        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;

    }

    /**
     * this function will get the size of list
     * @return
     */
    @Override
    public int getCount() {
        return cities.size();
    }

    /**
     * this function will add a city object into the list
     * @param city
     */
    public void addCity(City city) {
        cities.add(city);
    }

    /**
     * When given a city, return whether or not it belongs in the list
     * @param city
     * @return
     *  Returns true only if the city is in the list
     */
    public boolean hasCity(City city) {
        // return cities.contains(city);
        return false;
    }

//    /**
//     * Removes the city if it's present in the list. Throws an
//     * exception if it's not in the list.
//     * @param city
//     */
//    public void delete(City city) {
//        if (!cities.contains(city)) {
//            throw new IllegalArgumentException();
//        }
//        cities.remove(city);
//        // return;
//    }

//    /**
//     * Return how many cities are in the list
//     * @return
//     *  Returns the number of cities
//     */
//    public int countCities() {
//        return cities.size();
//        // return 0;
//    }
}
