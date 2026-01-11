package basicMaths;

public class GreatestCommonDivisor {
    public static void main(String[] args) {

        int n1 =90;
        int n2 = 12;

        int GCD = 1;

        for(int i=1;i<= Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                GCD = i;
            }
        }

        System.out.println("The GCD or Greatest Common Divisor for n1 and n2 = "+GCD);

        // best approach is through Euclidean Algorithm

        int a = 20, b = 15;

        while(a>0 && b>0){
            if(a>b){
                a = a%b;
            }else{
                b = b%a;
            }

            if(a==0){
                System.out.println("GCD of a and b is = "+b);
            }else {
                System.out.println("GCD of a and b is = "+a);
            }
        }
    }
}
