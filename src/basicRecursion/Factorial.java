package basicRecursion;

public class Factorial {
    public static void main(String[] args) {

        int n = 5;

        int factValue = 1;

        int fact = factorial(n,factValue);

        System.out.println("Factorial of number "+n+" is = "+fact);

    }

    public static int factorial(int n,int factValue){
        if(n==0){
            return factValue;
        }

        return factorial(n-1,factValue*n);
    }
}
