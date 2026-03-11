package level3Exercise1;

import level3Exercise1.exceptions.IncorrectOptionException;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner = new Scanner(System.in);
    public ConsoleUI()
    {

    }

    public void consumeNextLine()
    {
        scanner.nextLine();
    }

    public int showMenu() throws IncorrectOptionException, InputMismatchException
    {
        System.out.println("1 - Introduir persona");
        System.out.println("2 - Mostrar persones ordenades per nom (A-Z)");
        System.out.println("3 - Mostrar persones ordenades per nom (Z-A");
        System.out.println("4 - Mostrar persones ordenades per cognoms (A-Z)");
        System.out.println("5 - Mostrar persones ordenades per cognoms (Z-A)");
        System.out.println("6 - Mostrar persones ordenades per DNI (1-9)");
        System.out.println("7 - Mostrar persones ordenades per DNI (9-1)");
        System.out.println("0 - Sortir");
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

    public Person getPersonData()
    {
        System.out.println("Introdueix el nom.");
        String name = scanner.nextLine();
        System.out.println("Introdueix els cognoms.");
        String surnames = scanner.nextLine();
        System.out.println("Introdueix el DNI.");
        String dni = scanner.nextLine();
        return new Person(name,surnames,dni);
    }

    public void personAddedMessage()
    {
        System.out.println("Persona afegida al csv.");
    }

    public void showPersons(List<Person> persons)
    {
        System.out.println("___Nom____ ______Cognoms_______ ___DNI___");
        for(Person person:persons)
        {
            System.out.println(person.toString());
        }
    }
}
