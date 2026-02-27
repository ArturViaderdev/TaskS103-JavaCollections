package level3Exercise1.exceptions;

public class IncorrectCSVFormatException extends Exception{
    public IncorrectCSVFormatException()
    {
        super("Format del csv incorrecte.");
    }
}
