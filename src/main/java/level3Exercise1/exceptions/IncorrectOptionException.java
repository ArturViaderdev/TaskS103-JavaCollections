package level3Exercise1.exceptions;

public class IncorrectOptionException extends Exception{
    public IncorrectOptionException()
    {
        super("Opció incorrecta.");
    }
}
