package level1Exercise1;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Month> months= new ArrayList<>();

        months.add(new Month("Gener"));
        months.add(new Month("Febrer"));
        months.add(new Month("Març"));
        months.add(new Month("Abril"));
        months.add(new Month("Maig"));
        months.add(new Month("Juny"));
        months.add(new Month("Juliol"));
        months.add(new Month("Setembre"));
        months.add(new Month("Octubre"));
        months.add(new Month("Novembre"));
        months.add(new Month("Desembre"));

        months.add(7,new Month("Agost"));

        Methods methods = Methods.getInstance();

        System.out.println("Mostro el arraylist.");
        methods.ShowMonths(months);

        HashSet<Month> monthshashset = new HashSet<Month>();

        methods.copyArrayListToHashSet(months,monthshashset);

        monthshashset.add(new Month("Juliol"));
        System.out.println("Mostro el hashset");

        methods.showHashSet(monthshashset);
        System.out.println("Mostro el hashset amb iterator");

        methods.showIteratorHashset(monthshashset);
    }
}
