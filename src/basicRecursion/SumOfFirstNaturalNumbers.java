package basicRecursion;

public class SumOfFirstNaturalNumbers {
    public static void main(String[] args) {
        int num = 10;

        int sum = 0;

        int sumValue = fun(num,sum);

        System.out.println("Sum of first N Natural Numbers : "+sumValue);

//        fun(num,sum);

    }

    public static int fun(int num, int sum){
        if(num==0){
            return sum;
        }

        fun(num-1,sum+num);

        return sum;
    }


//    public static void fun(int n, int sum){ you don't have to return the fun(n-1,sum) when you a void function
//        if(n==0){
//            return;
//        }
//
//        sum = sum+n;
//
//        fun(n-1, sum);
//
//        System.out.println("Sum is = "+sum);
//    }
}
