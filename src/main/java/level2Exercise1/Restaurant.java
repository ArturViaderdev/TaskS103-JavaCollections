package level2Exercise1;

import java.util.Objects;

public class Restaurant {
    private final String name;
    private int score;

    public Restaurant(String name, int score)
    {
        this.name = name;
        this.score = score;
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
}