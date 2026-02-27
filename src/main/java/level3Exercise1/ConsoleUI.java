package level3Exercise1;

import level3Exercise1.exceptions.IncorrectOptionException;

import java.util.List;
import java.util.Scanner;

/**
 * Class that interacts with the user by console
 */
public class ConsoleUI {
    public ConsoleUI()
    {

    }

    /**
     * Shows the menu and gets the option selected by the user
     * @return The option selected by the user
     * @throws Exception Error
     */
    public int showMenu() throws Exception
    {
        System.out.println("1 - Introduir persona");
        System.out.println("2 - Mostrar persones ordenades per nom (A-Z)");
        System.out.println("3 - Mostrar persones ordenades per nom (Z-A");
        System.out.println("4 - Mostrar persones ordenades per cognoms (A-Z)");
        System.out.println("5 - Mostrar persones ordenades per cognoms (Z-A)");
        System.out.println("6 - Mostrar persones ordenades per DNI (1-9)");
        System.out.println("7 - Mostrar persones ordenades per DNI (9-1)");
        System.out.println("0 - Sortir");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix una opció.");
        int opcio = scanner.nextInt();
        if(opcio>=0 && opcio<=7)
        {
            return opcio;
        }
        else
        {
            throw new IncorrectOptionException();
        }
    }

    public void showIncorrectOption()
    {
        System.out.println("Opció incorrecta.");
    }

    /**
     * The user introduces the data of a person
     * @return The person introduced by the user
     */
    public Person getPersonData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el nom.");
        String name = scanner.nextLine();
        System.out.println("Introdueix els cognoms.");
        String surnames = scanner.nextLine();
        System.out.println("Introdueix el DNI.");
        String dni = scanner.nextLine();
        Person person = new Person(name,surnames,dni);
        return person;
    }

    public void personAddedMessage()
    {
        System.out.println("Persona afegida al csv.");
    }

    /**
     * Shows the list in the console
     * @param persons List of persons
     */
    public void showPersons(List<Person> persons)
    {
        System.out.println("___Nom____ ______Cognoms_______ ___DNI___");
        for(Person person:persons)
        {
            System.out.println(person.toString());
        }
    }
}
