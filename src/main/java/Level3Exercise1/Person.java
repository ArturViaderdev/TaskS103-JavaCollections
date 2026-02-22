package Level3Exercise1;

public class Person {
    private String name;
    private String surnames;
    private String dni;
    public static int maxNamelength = 10;
    public static int maxSurnamesLength=20;
    public static int maxDniLength = 9;

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
        String namespaces="";
        String surnamespaces="";
        int cont;
        namespaces = generatespaces(name,maxNamelength);
        surnamespaces = generatespaces(surnames,maxSurnamesLength);
        return name + namespaces +  " " + surnames + surnamespaces + " " + dni;
    }

    /**
     * Generate the empty spaces for the console output columns used by toString
     * @param text
     * @param length
     * @return
     */
    private String generatespaces(String text,int length)
    {
        int cont = text.length();
        String spaces ="";
        while(cont<length)
        {
            spaces = spaces + " ";
            cont++;
        }
        return spaces;
    }

    public String toCSVLine()
    {
        return name + "," + surnames + "," + dni;
    }
}
