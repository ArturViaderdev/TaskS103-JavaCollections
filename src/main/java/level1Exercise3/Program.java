package level1Exercise3;

import java.io.IOException;
import java.util.*;

public class Program {
    private final ConsoleUI consoleui;
    private HashMap<String, String> data;
    private final FilesInteraction filesInteraction;
    private ArrayList<String> questions;
    private String playerName;
    int points;

    /**
     * Initialization of variables in the constructor
     */
    public Program()
    {
        consoleui = new ConsoleUI();
        filesInteraction = new FilesInteraction("countries.txt","classificacio.txt");
        data = new HashMap<>();
        questions = new ArrayList<>();
    }

    public void start()
    {
        try
        {
            filesInteraction.readCountries(data);
            playerName = consoleui.getPlayerName();
            game();
        }
        catch(IOException ex)
        {
            consoleui.errorFile();
        }
    }

    /**
     * Game
     */
    private void game()
    {
        points = 0;
        ArrayList<String> countries;


        //I copy all the countries or keys in an arraylist
        countries = new ArrayList<>(data.keySet());
        //I have to shuffle the array and get 10 elements.
        Collections.shuffle(countries);

        //I copy the first 10 elements of shuffled keys array
        for(int cont=0;cont<10;cont++)
        {
            questions.add(countries.get(cont));
        }
        int question = 0;
        while(question<10)
        {
            String response = consoleui.showQuestion(questions.get(question), question+1);
            if(response.equalsIgnoreCase(data.get(questions.get(question))))
            {
                points++;
                consoleui.showSuccess();
            }
            else
            {
                consoleui.showIncorrect(questions.get(question),data.get(questions.get(question)));
            }
            question++;
        }
        consoleui.showEndGame(points);

        try
        {
            filesInteraction.writeScore(playerName,points);
            consoleui.showSavedScore();
        }
        catch(IOException ex)
        {
            consoleui.errorFile();
        }
    }
}
