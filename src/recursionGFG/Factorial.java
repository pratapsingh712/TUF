package recursionGFG;

public class Factorial {
    public static void main(String[] args) {
        factorial(5,1);
    }

    private static void factorial(int n,int fact){
        if(n==1){
            System.out.println("Factorial of Number is "+fact);
            return;
        }
        factorial(n-1,fact*n);
    }
}
