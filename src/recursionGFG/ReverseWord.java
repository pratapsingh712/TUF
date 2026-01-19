package recursionGFG;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word :");
        String word = sc.next();
        String reverse = "";

        System.out.println("Original String : "+word);
        System.out.println("After reversing : "+reverse(word,word.length()-1,reverse));
    }

    private static String reverse(String word, int size, String reverse) {
        if(size<0) return reverse;

        reverse += word.charAt(size);

        return reverse(word,size-1,reverse);
    }
}
