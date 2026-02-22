package Level3Exercise1;

import Level3Exercise1.Exceptions.IncorrectOptionException;

import java.util.Scanner;

public class ConsoleUI {
    public ConsoleUI()
    {

    }

    public int showMenu(boolean checkdni) throws Exception
    {
        System.out.println("1 - Introduir persona");
        System.out.println("2 - Mostrar persones ordenades per nom (A-Z)");
        System.out.println("3 - Mostrar persones ordenades per nom (Z-A");
        System.out.println("4 - Mostrar persones ordenades per cognoms (A-Z)");
        System.out.println("5 - Mostrar persones ordenades per cognoms (Z-A)");
        System.out.println("6 - Mostrar persones ordenades per DNI (1-9)");
        System.out.println("7 - Mostrar persones ordenades per DNI (9-1)");
        if(!checkdni)
        {
            System.out.println("8 - Activar comprovació de DNI al afegir. Actualment desactivada.");
        }
        else
        {
            System.out.println("8 - Desactivar comprovació de DNI al afegir. Actualment activada.");
        }
        System.out.println("0 - Sortir");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix una opció.");
        int opcio = scanner.nextInt();
        if(opcio>=0 && opcio<=8)
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
}
