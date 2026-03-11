package level1Exercise3;

import java.util.Scanner;

public class ConsoleUI {
    private final Scanner scanner = new Scanner(System.in);
    public ConsoleUI()
    {

    }

    public String getPlayerName()
    {
        System.out.println("Introdueix el teu nom.");
        return scanner.nextLine();
    }

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
