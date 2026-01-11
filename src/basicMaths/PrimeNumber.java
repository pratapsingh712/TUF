package basicMaths;

public class PrimeNumber {
    public static void main(String[] args) {

        // here we are not considering 1 and 2 as prime as they already are prime by default

        int num = 14;

        int count = 0;

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                count++;
            }
        }

        if(count>0){
            System.out.println("Not Prime:");
        }else{
            System.out.println("Prime");
        }
    }
}
