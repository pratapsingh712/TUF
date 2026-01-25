package arrayHard;

import java.util.*;

public class SumOfAllXorTotalInSubsetNotSubArray {
    public static void main(String[] args) {
        // my solution is working there is no duplicate array elements
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array :");
        int size = sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the array elements :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Enter the K :");
        int k = sc.nextInt();

        System.out.println("Original Array elements are :"+ Arrays.toString(array));

        Arrays.sort(array);

        List<List<Integer>> list = getSubSet(array);

        System.out.println("Subsets are : ");

        System.out.println(list);

        getXorSumSubSetCount(list,k);

    }

    private static void getXorSumSubSetCount(List<List<Integer>> list, int k) {
        int count = 0;

        Set<List<Integer>> seen = new HashSet<>();

        for (List<Integer> subset : list) {
            List<Integer> copy = new ArrayList<>(subset);
            Collections.sort(copy);   // normalize

            if (seen.contains(copy)) continue;

            seen.add(copy);

            int xor = 0;
            for (int x : copy) xor ^= x;

            if (xor == k) count++;
        }

        System.out.println("Total count of xor sum equals k : "+count);
    }

    private static List<List<Integer>> getSubSet(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(array, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] array, int index,
                                  List<Integer> current,
                                  List<List<Integer>> result) {

        // base case: reached end
        if (index == array.length) {
            result.add(new ArrayList<>(current)); // copy!
            return;
        }

        // choice 1: include element
        current.add(array[index]);
        backtrack(array, index + 1, current, result);

        // backtrack
        current.removeLast();

        // choice 2: exclude element
        backtrack(array, index + 1, current, result);
    }
}
