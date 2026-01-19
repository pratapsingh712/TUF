package recursionGFG;

public class PrintNto1 {
    public static void main(String[] args) {

        function(10);

    }

    private static void function(int num){
        if(num==0){
            return;
        }

        System.out.println(num);
        function(num-1);
    }
}
