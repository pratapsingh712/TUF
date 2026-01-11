package basicRecursion;

public class Print1ToN {

    public static void main(String[] args) {

        int N = 5;

        fun(N);

    }

    private static void fun(int n) {

        if(n==0){
            return;
        }

        fun(n-1);

        System.out.println(n);
    }
}
