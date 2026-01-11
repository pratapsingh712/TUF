package basicMaths;

public class ArmstrongNumber {
    public static void main(String[] args) {

        int num = 152;

        int original = num;

        int digitCount = (int) Math.log10(num)+1;

        int sum = 0;

        while(num>0){
            int digit = num%10;
            sum += Math.pow(digit,digitCount);
            num /= 10;
        }

        if(original==sum){
            System.out.println("Number is an Armstrong Number: ");
        }else{
            System.out.println("Number is not an Armstrong Number: ");
        }
    }
}
