package Level2Exercise2;

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

    /**
     * Equals method that is not allowing to have a two restaurants with the same name and score
     * @param o
     * @return
     */
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
        int orden =  this.name.compareTo(restaurant.name);
        if(orden==0)
        {
            return restaurant.getScore() - this.getScore();
        }
        else
        {
            return orden;
        }
    }
}
