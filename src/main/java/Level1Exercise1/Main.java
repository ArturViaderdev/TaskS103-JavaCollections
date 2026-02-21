package Level1Exercise1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)
    {
        //I create and initialize the arrayList of months
        ArrayList<Month> months= new ArrayList<>();

        //I add the months
        months.add(new Month("Gener"));
        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("Juny"));
        months.add(new Month("Juliol"));
        months.add(new Month("Septembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Novembre"));
        months.add(new Month("Deçembre"));

        //I add august

        months.add(7,new Month("Agost"));

        //I get the instance of singleton with methods
        Methods methods = Methods.getInstance();

        //I show the months
        System.out.println("Mostro el arraylist.");
        methods.ShowMonths(months);

        //I create a hashset
        HashSet<Month> monthshashset = new HashSet<Month>();

        //I copy the arraylist to the hashset
        methods.copyArrayListToHashSet(months,monthshashset);
        //The method does not return anything because hashset is passed for reference by default. ArrayList also is passed for reference.

        //I add duplicates
        monthshashset.add(new Month("Juliol"));
        System.out.println("Mostro el hashset");
        //I show the hashset with a for each bucle
        methods.showHashSet(monthshashset);
        System.out.println("Mostro el hashset amb iterator");
        //I show the hashset using a bucle with iterator
        methods.showIteratorHashset(monthshashset);
        //The july month is not repeated because I implemented the equals in Month class with the name variable.
        //If not would be repeated because the month added is another instance of the class.
    }
}
