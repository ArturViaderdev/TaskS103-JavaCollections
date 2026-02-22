package Level3Exercise1;

public class Person {
    private String name;
    private String surnames;
    private String dni;

    public Person(String name, String surnames, String dni)
    {
        this.name = name;
        this.surnames = surnames;
        this.dni = dni;
    }

    public String getName()
    {
        return name;
    }

    public String getSurnames()
    {
        return surnames;
    }

    public String getDni()
    {
        return dni;
    }

    @Override
    public String toString() {
        return name + " " + surnames + " " + dni;
    }

    public String toCSVLine()
    {
        return name + "," + surnames + "," + dni;
    }
}
