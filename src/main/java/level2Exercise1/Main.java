package level2Exercise1;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args)
    {
        HashSet<Restaurant> restaurants = new HashSet<>();

        restaurants.add(new Restaurant("Gallo de oro",5));
        restaurants.add(new Restaurant("Gallina de plata",3));

        restaurants.add(new Restaurant("Gallo de oro",5));

        restaurants.add(new Restaurant("Gallina de plata",2));

        Iterator<Restaurant> iterator = restaurants.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }
    }
}
