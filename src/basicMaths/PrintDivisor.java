package basicMaths;

import java.util.ArrayList;
import java.util.List;

public class PrintDivisor {
    public static void main(String[] args) {

        int num = 36;

//        for(int i=1;i<=num;i++){
//            if(num%i==0){
//                System.out.print(i+" ");
//            }
//        }

        // The optimal solution for this is going to be

        List<Integer> divisors = new ArrayList<>();

        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0) {
                divisors.add(i);
            }
            if(i*i!=num){ // this is to protect adding the same number twice as 6*6 is 36 thus 6 is factor and will be added twice
                int coefficient = num / i;
                divisors.add(coefficient);
            }
        }

        divisors.sort(null);

        for(Integer number : divisors) {
            System.out.print(number+" ");
        }
    }
}
