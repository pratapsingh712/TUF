package basicRecursion;

public class FibonacciSeries {
    public static void main(String[] args) {

        int n = 20;

//        int first = 0;
//        int second = 1;
//
//        String result = "";
//
//        System.out.println("Fibonacci series elements are : 0 1 "+fibonacciSeries(n,first,second,result));

        fibonacciSeries(n,0,1);

    }

//    public static String fibonacciSeries(int n, int first, int second,String result){
//        if(n==2){
//            return result;
//        }
//
//        int next = first+second;
//        first = second;
//        second = next;
//        result += next+" ";
//
//        return fibonacciSeries(n-1,first,second,result);
//    }

    public static void fibonacciSeries(int n, int first, int second){
        if(n==0){
            return;
        }

        System.out.print(first+" ");

        fibonacciSeries(n-1,second,first+second);
    }
}
