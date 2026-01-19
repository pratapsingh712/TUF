package recursionGFG;

public class Print1toN {
    public static void main(String[] args) {
        function(10);
    }

    private static void function(int num){
        if(num==0){
            return;
        }

        function(num-1);

        System.out.println(num);
    }
}
