package Level1Exercise3;

import java.util.Scanner;

/**
 * Class that manages the input and output by console
 */
public class ConsoleUI {
    public ConsoleUI()
    {

    }

    /**
     * Ask user to his name
     * @return
     */
    public String getPlayerName()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix el teu nom.");
        String name = scanner.nextLine();
        return name;
    }

    /**
     * Shows a question
     * @param question
     * @param numquestion
     * @return
     */
    public String showQuestion(String question, int numquestion)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pregunta " + Integer.toString(numquestion) + " Pais: " + question + " Introdueix la capital.");
        String response = scanner.nextLine();
        return response;
    }

    public void errorFile()
    {
        System.out.println("Error d'arxiu.");
    }

    public void showSuccess()
    {
        System.out.println("Has acertat, felicitats.");
    }

    /**
     * Incorrect answer
     * @param pais
     * @param capital
     */
    public void showIncorrect(String pais, String capital)
    {
        System.out.println("Has fallat, la resposta correcta és pais: " + pais + " capital: " + capital);
    }

    /**
     * End game
     * @param points
     */
    public void showEndGame(int points)
    {
        System.out.println("Has acabat el joc. La teva puntuació és de " + Integer.toString(points));
    }

    public void showSavedScore()
    {
        System.out.println("Puntuació guardada.");
    }
}
