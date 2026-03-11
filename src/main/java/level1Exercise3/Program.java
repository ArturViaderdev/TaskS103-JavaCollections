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

    private void game()
    {
        points = 0;
        ArrayList<String> countries;

        countries = new ArrayList<>(data.keySet());
        Collections.shuffle(countries);

        for(int counter=0;counter<10;counter++)
        {
            questions.add(countries.get(counter));
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
