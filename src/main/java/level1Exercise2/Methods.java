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

    public void fillList(List<Integer> list){

            for(int counter=1;counter<=20;counter++)
            {
                list.add(counter);
            }
    }

    public void copyReverseList(List<Integer> list, List<Integer> reversedList)
    {
        ListIterator iterator = list.listIterator(list.size());
        while(iterator.hasPrevious())
        {
            reversedList.add((int) iterator.previous());
        }
    }

    @Deprecated
    public void addElementsToSecondList(List<Integer> list, List<Integer> secondList)
    {
        secondList.addAll(list);
    }

    public void showIntegerList(List<Integer> list)
    {
        ListIterator<Integer> listIterator = list.listIterator();
        while(listIterator.hasNext())
        {
            System.out.println(listIterator.next());
        }
    }
}
