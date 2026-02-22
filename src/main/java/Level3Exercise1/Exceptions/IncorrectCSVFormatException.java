package Level3Exercise1.Exceptions;

public class IncorrectCSVFormatException extends Exception{
    public IncorrectCSVFormatException()
    {
        super("Format del csv incorrecte.");
    }
}
