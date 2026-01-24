package arrayHard;

import java.util.*;

public class Three3SumZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));

        getThree3SumZero(array);
    }

    private static void getThree3SumZero(int[] array) {

        HashSet<List<Integer>> result = new HashSet<>();

        for(int i=0;i<array.length;i++){
            HashSet<Integer> hashSet = new HashSet<>();
            for(int j=i+1;j<array.length;j++){
                int third = -(array[i]+array[j]);

                if(hashSet.contains(third)){
                    List<Integer> temp = new ArrayList<>(Arrays.asList(array[i],array[j],third));
                    Collections.sort(temp);
                    result.add(temp);
                }

                hashSet.add(array[j]);
            }
        }

        System.out.println("Three sum : ");
        System.out.println(result);
    }
}
