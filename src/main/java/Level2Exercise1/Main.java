package Level2Exercise1;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args)
    {
        HashSet<Restaurant> restaurants = new HashSet<>();
        //I create two restaurants
        restaurants.add(new Restaurant("Gallo de oro",5));
        restaurants.add(new Restaurant("Gallina de plata",3));

        //I insert another restaurant that is repeated
        restaurants.add(new Restaurant("Gallo de oro",5));

        //I insert another restaurant with the same name but different score
        restaurants.add(new Restaurant("Gallina de plata",2));

        //I read the hashset to check the values

        Iterator<Restaurant> iterator = restaurants.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }
    }
}
