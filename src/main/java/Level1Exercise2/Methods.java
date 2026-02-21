package Level1Exercise2;

import java.util.List;
import java.util.ListIterator;

public class Methods {
    private static Methods methods = new Methods();

    public Methods()
    {

    }

    public static Methods getInstance()
    {
        return methods;
    }

    /**
     * Fills a list with numbers
     * @param list The list
     * @param order Ascendent or descendent
     */
    public void fillList(List<Integer> list,boolean order){
        if(order)
        {
            for(int cont=1;cont<=20;cont++)
            {
                list.add(cont);
            }
        }
        else
        {
            for(int cont=20;cont>=1;cont--)
            {
                list.add(cont);
            }
        }
    }

    /**
     * Copies elements from one list to another one with listiterator.
     * @param lista List a
     * @param listb List b
     */
    public void addElementsToSecondList(List<Integer> lista, List<Integer> listb)
    {
        //I create a ListIterator for the first List
        ListIterator<Integer> listiterator = lista.listIterator();
        while(listiterator.hasNext())
        {
            listb.add(listiterator.next());
        }
    }

    /**
     * Show integers list on console
     * @param list
     */
    public void showIntegerList(List<Integer> list)
    {
        for(int cont=0;cont<list.size();cont++)
        {
            System.out.println(list.get(cont).toString());
        }
    }
}
