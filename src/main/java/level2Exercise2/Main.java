package level2Exercise2;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        HashSet<Restaurant> restaurants = new HashSet<>();
        restaurants.add(new Restaurant("Gallo de oro",5));
        restaurants.add(new Restaurant("Gallina de plata",3));

        restaurants.add(new Restaurant("Gallina de plata",2));

        List<Restaurant> listRestaurants = new ArrayList(restaurants);

        Collections.sort(listRestaurants);

        for(Restaurant restaurant: listRestaurants)
        {
            System.out.println(restaurant.toString());
        }
    }
}
