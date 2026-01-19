package recursionGFG;

public class PrintDecreasingAndIncreasing {
    public static void main(String[] args) {

        function(10);

    }

    private static void function(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }

        System.out.print(n+" ");
        function(n-1);
        System.out.print(n+" ");
    }
}
