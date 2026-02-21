package Level1Exercise2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args)
    {
        Methods methods = Methods.getInstance();
        //I create a list
        List<Integer> list = new ArrayList<>();

        //I fill the list
        methods.fillList(list,true);

        //I create a second list
        List<Integer> listb = new ArrayList<>();
        //I fill the list with inverse order
        methods.fillList(listb,false);

        //I copy elements from the first lit to the second list with listiterator
        methods.addElementsToSecondList(list,listb);

        //I show the list b to check the result
        methods.showIntegerList(listb);
    }
}
