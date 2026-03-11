package level2Exercise2;

import java.util.Objects;

public class Restaurant implements Comparable<Restaurant> {
    private String name;
    private int score;

    public Restaurant(String name, int score)
    {
        this.name = name;
        this.score = score;
    }

    public int getScore()
    {
        return score;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Restaurant that = (Restaurant) o;
        return score == that.score && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Nom de restaurant: '" + name + ", puntuació=" + Integer.toString(score);
    }

    @Override
    public int compareTo(Restaurant restaurant) {
        int order =  this.name.compareTo(restaurant.name);
        if(order==0)
        {
            return Integer.compare(restaurant.getScore(),this.getScore());
        }
        else
        {
            return order;
        }
    }
}
