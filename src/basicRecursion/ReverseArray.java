package basicRecursion;

public class ReverseArray {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        array = reverseArray(array,0,array.length-1);

        for(Integer num : array){
            System.out.print(num+" ");
        }

    }

    public static int[] reverseArray(int[] array, int left, int right){
        if(left>=right){
            return array;
        }


        int temp = array[right];
        array[right] = array[left];
        array[left] = temp;
//        left++;
//        right--;

        return reverseArray(array,left+1, right-1);
    }
}
