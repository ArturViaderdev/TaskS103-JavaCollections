package level3Exercise1.exceptions;

public class MaxLengthException extends Exception{
    public MaxLengthException()
    {
        super("Has superat el màxim de longitud d'algún dels camps.");
    }
}
