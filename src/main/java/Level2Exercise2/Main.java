package Level2Exercise2;

import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        HashSet<Restaurant> restaurants = new HashSet<>();
        //I create two restaurants
        restaurants.add(new Restaurant("Gallo de oro",5));
        restaurants.add(new Restaurant("Gallina de plata",3));

        //I insert another restaurant with the same name but different score
        restaurants.add(new Restaurant("Gallina de plata",2));

        //I convert the hashset to an arraylist because hashset has no defined order.
        List<Restaurant> listRestaurants = new ArrayList(restaurants);

        //I order the list
        Collections.sort(listRestaurants);

        //I read the list to check the values
        for(Restaurant restaurant: listRestaurants)
        {
            System.out.println(restaurant.toString());
        }
    }
}
