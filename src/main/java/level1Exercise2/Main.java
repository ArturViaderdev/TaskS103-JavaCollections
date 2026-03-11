package level1Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Methods methods = Methods.getInstance();

        List<Integer> list = new ArrayList<>();

        methods.fillList(list);

        List<Integer> reversedList = new ArrayList<>();

        methods.copyReverseList(list,reversedList);

        //methods.addElementsToSecondList(list,reversedList);

        methods.showIntegerList(reversedList);
    }
}
