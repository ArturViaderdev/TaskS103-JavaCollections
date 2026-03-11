package level1Exercise3;

import java.util.Scanner;

/**
 * Class that manages the input and output by console
 */
public class ConsoleUI {
    private final Scanner scanner = new Scanner(System.in);
    public ConsoleUI()
    {

    }

    /**
     * Ask user to his name
     * @return The player name
     */
    public String getPlayerName()
    {
        System.out.println("Introdueix el teu nom.");
        return scanner.nextLine();
    }

    /**
     * Shows a question
     * @param question The question
     * @param numQuestion The number of question
     * @return The answer
     */
    public String showQuestion(String question, int numQuestion)
    {
        System.out.println("Pregunta " + Integer.toString(numQuestion) + " Pais: " + question + " Introdueix la capital.");
        return scanner.nextLine();
    }

    public void errorFile()
    {
        System.out.println("Error d'arxiu.");
    }

    public void showSuccess()
    {
        System.out.println("Resposta correcta, felicitats.");
    }

    /**
     * Incorrect answer
     * @param country The country
     * @param capital The capital introduced by the user
     */
    public void showIncorrect(String country, String capital)
    {
        System.out.println("Has fallat, la resposta correcta és país: " + country + " capital: " + capital);
    }

    public void showEndGame(int points)
    {
        System.out.println("Has acabat el joc. La teva puntuació és de " + Integer.toString(points));
    }

    public void showSavedScore()
    {
        System.out.println("Puntuació guardada.");
    }
}
