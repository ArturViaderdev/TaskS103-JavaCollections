package Level3Exercise1;
import Level3Exercise1.Exceptions.CommaFieldException;
import Level3Exercise1.Exceptions.EmptyException;

public class Program {
    ConsoleUI consoleUI;
    Boolean checkdni;
    FilesAccess filesAccess;
    public Program()
    {
        consoleUI = new ConsoleUI();
        checkdni = false;
        filesAccess = new FilesAccess("persones.csv");
    }

    public void start()
    {
        int option=10;
        do {
            try
            {
                option = consoleUI.showMenu(checkdni);
                executeOption(option);
            }
            catch(Exception ex)
            {
                consoleUI.showIncorrectOption();
            }
        } while(option!=0);
    }

    private void executeOption(int option)
    {
        try
        {
            switch(option) {
                case 1:
                    insertPerson();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
            }
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

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
        else
        {
            filesAccess.addPerson(person);
            consoleUI.personAddedMessage();
        }
    }
}
