package basicMaths;

public class CountDigit {

    public static void main(String[] args) {

        int num = 12345678;
        int count = 0;
        while(num>0){
            num = num/10;
            count++;
        }

        System.out.println("Number of digit in num = "+count);

        // now let's try an efficient way

        int num2 = 12345;

        int digit = (int) (Math.log10(num2)+1);
        System.out.println("Number of digit in num = "+digit);
    }
}
