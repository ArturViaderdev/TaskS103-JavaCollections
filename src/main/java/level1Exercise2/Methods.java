package level1Exercise2;

import java.util.List;
import java.util.ListIterator;

public class Methods {
    private static final Methods methods = new Methods();

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
     */
    public void fillList(List<Integer> list){

            for(int cont=1;cont<=20;cont++)
            {
                list.add(cont);
            }
    }

    public void copyReverseList(List<Integer> list, List<Integer> listB)
    {
        ListIterator iterator = list.listIterator(list.size());
        while(iterator.hasPrevious())
        {
            listB.add((int) iterator.previous());
        }
    }

    /**
     * Copies elements from one list to another one with listiterator.
     * @param listA List a
     * @param listB List b
     */
    public void addElementsToSecondList(List<Integer> listA, List<Integer> listB)
    {
        //I create a ListIterator for the first List
        ListIterator<Integer> listIterator = listA.listIterator();
        while(listIterator.hasNext())
        {
            listB.add(listIterator.next());
        }
    }

    /**
     * Show integers list on console
     * @param list The list
     */
    public void showIntegerList(List<Integer> list)
    {
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }
}
