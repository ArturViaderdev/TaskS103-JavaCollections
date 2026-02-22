package Level3Exercise1.Exceptions;

public class IncorrectOptionException extends Exception{
    public IncorrectOptionException()
    {
        super("Opció incorrecta.");
    }
}
