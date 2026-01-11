package basicMaths;

public class CheckPalindrome {

    public static void main(String[] args) {

        int num = 165494589;
        int original = num;

        int digit, rev = 0;

        while(num>0){
            digit = num%10;
            rev = rev*10+digit;
            num /= 10;
        }

        if(original==rev){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome:");
        }
    }
}
