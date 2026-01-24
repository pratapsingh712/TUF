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

        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> seen = new HashSet<>();

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                for (int k = j + 1; k < array.length; k++) {

                    if (array[i] + array[j] + array[k] == 0) {

                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(array[i]);
                        triplet.add(array[j]);
                        triplet.add(array[k]);

                        // sort the triplet to normalize order
                        Collections.sort(triplet);

                        // add only if not seen before
                        if (!seen.contains(triplet)) {
                            seen.add(triplet);
                            result.add(triplet);
                        }
                    }
                }
            }
        }

        System.out.println("Three sum : ");
        System.out.println(result);
    }
}
