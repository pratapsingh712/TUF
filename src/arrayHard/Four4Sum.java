package arrayHard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Four4Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of your array :");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the element of your array :");
        for(int i=0;i<size;i++){
            array[i] = sc.nextInt();
        }

        System.out.println("Original Array :"+ Arrays.toString(array));

        System.out.println("Enter a Target you want to search in the array :");
        int target = sc.nextInt();

        getTargetSum(array,target);
    }

    private static void getTargetSum(int[] array, int target) {

        List<List<Integer>> ans = new ArrayList<>();
        int n = array.length;

        Arrays.sort(array);

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                long target2 = (long)target-(long)array[i]-array[j];
                int left = j+1;
                int right = n-1;

                while(left<right){
                    int s = array[left]+array[right];
                    if(s<target2){
                        left++;
                    }else if(s>target2){
                        right--;
                    }else{
                        List<Integer> list = Arrays.asList(array[i],array[j],array[left],array[right]);
                        ans.add(list);
                        while (left <right && array[left]==list.get(2)){
                            left++;
                        }
                        while(left<right && array[right]==list.get(3)){
                            right--;
                        }
                    }
                }

                while (j+1<n && array[j]==array[j+1]){
                    j++;
                }
            }
            while(i+1<n && array[i]==array[i+1]){
                i++;
            }
        }

        System.out.println("List of Target element : ");

        System.out.println(ans);

//        for(List<Integer> num : ans){
//            for(Integer ele : num){
//                System.out.print(ele+" ");
//            }
//            System.out.println();
//        }
    }
}
