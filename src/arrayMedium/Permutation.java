package arrayMedium;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println("Permutation of "+ Arrays.toString(nums));
        System.out.println(permute(nums));
    }

    private static List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        permutation(nums,result,new LinkedHashSet<>()); // hashset to maintain order and give 0(1) search time complexity
        return result;
    }

    private static void permutation(int[] nums, List<List<Integer>> result, Set<Integer> set){
        if(set.size()==nums.length){
            result.add(new ArrayList<>(set));
            return;
        }

        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);
                permutation(nums,result,set);
                set.remove(nums[i]);
            }
        }
    }
}
