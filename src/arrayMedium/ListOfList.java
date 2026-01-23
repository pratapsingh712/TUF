package arrayMedium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOfList {
    public static void main(String[] args) {

        List<List<Integer>> listOfList = new ArrayList<>();

        ArrayList<Integer> arrayList  = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(3);
        arrayList1.add(2);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(2);
        arrayList2.add(1);
        arrayList2.add(3);

        listOfList.add(arrayList);
        listOfList.add(arrayList1);
        listOfList.add(arrayList2);

//        System.out.println(listOfList);

        for(List<Integer> list : listOfList){
            for(Integer num : list){
                System.out.print(num+" ");
            }
            System.out.println();
        }
    }
}
