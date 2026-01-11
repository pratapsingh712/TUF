package basicRecursion;

public class Palindrome {
    public static void main(String[] args) {

        String str = "moma";

        String result = "";

        String rev = reverse(str,result,str.length()-1);

        if(rev.equals(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome:");
        }
    }

    public static String reverse(String str,String result, int rightIndex){
        if(rightIndex<0){
            return result;
        }

        char temp = str.charAt(rightIndex);
        result = result+temp;
        rightIndex--;

        return reverse(str,result,rightIndex);
    }
}
