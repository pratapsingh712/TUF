package arrayMedium;

import java.util.*;

public class Permutation {
    public static void main(String[] args) {
        int[] nums = {3,2,1};

        List<Integer> current = new ArrayList<>();
        for(Integer num : nums){
            current.add(num);
        }

        System.out.println("Current : "+current);
        System.out.println("Permutation of "+ Arrays.toString(nums));
        Arrays.sort(nums);

//        System.out.println(permute(nums));

        List<List<Integer>> listOfList;

        listOfList = permute(nums);

        for(int i=0;i<listOfList.size();i++){
            if(listOfList.get(i).equals(current)){
                if(i== listOfList.size()-1){
                    System.out.println("Next : "+listOfList.get(0));
                    break;
                }else {
                    System.out.println("Next : "+listOfList.get(i+1));
                    break;
                }
            }
        }

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
