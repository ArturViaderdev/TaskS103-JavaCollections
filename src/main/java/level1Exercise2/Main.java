package level1Exercise2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args)
    {
        Methods methods = Methods.getInstance();

        List<Integer> list = new ArrayList<>();

        methods.fillList(list,true);

        List<Integer> listB = new ArrayList<>();

        methods.fillList(listB,false);

        methods.addElementsToSecondList(list,listB);

        methods.showIntegerList(listB);
    }
}
