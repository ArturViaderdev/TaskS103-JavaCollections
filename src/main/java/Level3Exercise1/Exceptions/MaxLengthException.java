package Level3Exercise1.Exceptions;

public class MaxLengthException extends Exception{
    public MaxLengthException()
    {
        super("Has superat el màxim de longitud d'algún dels camps.");
    }
}
