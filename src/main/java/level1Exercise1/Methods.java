package level1Exercise1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Methods {
    private static Methods methods = new Methods();

    public Methods()
    {

    }

    public static Methods getInstance()
    {
        return methods;
    }

    public void ShowMonths(ArrayList<Month> months)
    {
        for(Month month:months)
        {
            System.out.println(month.toString());
        }
    }

    public void copyArrayListToHashSet(ArrayList<Month> months, HashSet<Month> monthshashset)
    {
        monthshashset.addAll(months);
    }

    public void showHashSet(HashSet<Month> months)
    {
        for(Month element:months)
        {
            System.out.println(element.toString());
        }
    }

    public void showIteratorHashset(HashSet<Month> months)
    {
        Iterator<Month> iterator = months.iterator();
        while(iterator.hasNext())
        {
            System.out.println(iterator.next().toString());
        }
    }
}
