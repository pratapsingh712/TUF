package arrayMedium;

import java.util.ArrayList;
import java.util.Arrays;

public class D2DArrayList {
    public static void main(String[] args) {
        ArrayList<String> bakeryList = new ArrayList<>(Arrays.asList("pasta", "garlic bread","donut"));
        ArrayList<String> produceList = new ArrayList<>(Arrays.asList("tomatoes","zucchini","peppers"));
        ArrayList<String> drinkList = new ArrayList<>(Arrays.asList("soda","coffee"));

        ArrayList<ArrayList<String>> listOfList = new ArrayList<>();

        listOfList.add(bakeryList);
        listOfList.add(produceList);
        listOfList.add(drinkList);

        System.out.println(listOfList.get(0).get(0));
    }
}
