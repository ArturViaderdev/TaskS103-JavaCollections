package level3Exercise1;
import level3Exercise1.comparators.ComparatorDNIAsc;
import level3Exercise1.comparators.ComparatorNameAsc;
import level3Exercise1.comparators.ComparatorSurnamesAsc;
import level3Exercise1.exceptions.CommaFieldException;
import level3Exercise1.exceptions.EmptyException;
import level3Exercise1.exceptions.MaxLengthException;

import java.util.List;

public class Program {
    ConsoleUI consoleUI;
    FilesAccess filesAccess;
    public Program()
    {
        consoleUI = new ConsoleUI();
        filesAccess = new FilesAccess("persones.csv");
    }

    /**
     * Start the app. Shows menu and execute option
     */
    public void start()
    {
        int option=10;
        do {
            try
            {
                option = consoleUI.showMenu();
                executeOption(option);
            }
            catch(Exception ex)
            {
                consoleUI.showIncorrectOption();
            }
        } while(option!=0);
    }

    /**
     * Execute options of the menu
     * @param option
     */
    private void executeOption(int option)
    {
        List<Person> persons;
        try
        {
            switch(option) {
                case 1:
                    insertPerson();
                    break;
                case 2:
                    persons = filesAccess.readPersons();
                    persons.sort(new ComparatorNameAsc());
                    consoleUI.showPersons(persons);
                    break;
                case 3:
                    persons = filesAccess.readPersons();
                    persons.sort(new ComparatorNameAsc());
                    persons = persons.reversed();
                    consoleUI.showPersons(persons);
                    break;
                case 4:
                    persons = filesAccess.readPersons();
                    persons.sort(new ComparatorSurnamesAsc());
                    consoleUI.showPersons(persons);
                    break;
                case 5:
                    persons = filesAccess.readPersons();
                    persons.sort(new ComparatorSurnamesAsc());
                    persons = persons.reversed();
                    consoleUI.showPersons(persons);
                    break;
                case 6:
                    persons = filesAccess.readPersons();
                    consoleUI.showPersons(persons);
                    break;
                case 7:
                    persons = filesAccess.readPersons();
                    persons.sort(new ComparatorDNIAsc());
                    persons = persons.reversed();
                    consoleUI.showPersons(persons);
                    break;
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    /**
     * Insert a person
     * @throws Exception
     */
    private void insertPerson() throws Exception {
        Person person = consoleUI.getPersonData();
        if(person.getName().isEmpty()||person.getSurnames().isEmpty()||person.getDni().isEmpty())
        {
            throw new EmptyException();
        }
        else if(person.getName().contains(",") || person.getSurnames().contains(",") || person.getDni().contains(","))
        {
            throw new CommaFieldException();
        }
        else if(person.getName().length()<=Person.maxNamelength && person.getSurnames().length()<=Person.maxSurnamesLength && person.getDni().length()<=Person.maxDniLength)
        {
            filesAccess.addPerson(person);
            consoleUI.personAddedMessage();
        }
        else
        {
            throw new MaxLengthException();
        }
    }
}
