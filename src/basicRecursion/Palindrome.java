package basicRecursion;

public class Palindrome {
    public static void main(String[] args) {

        String str = "mom";

        String result = "";

        if(reverse(str,0,str.length()-1)){
            System.out.println("Palindrome:");
        }else{
            System.out.println("Not a Palindrome:");
        }

//        String rev = reverse(str,result,str.length()-1);
//
//        if(rev.equals(str)){
//            System.out.println("Palindrome");
//        }
//        else{
//            System.out.println("Not a Palindrome:");
//        }
//    }
//
//    public static String reverse(String str,String result, int rightIndex){
//        if(rightIndex<0){
//            return result;
//        }
//
//        char temp = str.charAt(rightIndex);
//        result = result+temp;
//        rightIndex--;
//
//        return reverse(str,result,rightIndex);
//    }
    }

    // alright there is another optimal solution

    public static boolean reverse(String str, int left, int right){
        if(left>=right){
            return true;
        }

        if(str.charAt(left)!=str.charAt(right)){
            return false;
        }

        return reverse(str,left+1,right-1);
    }
}
