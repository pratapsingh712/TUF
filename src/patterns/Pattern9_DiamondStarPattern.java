package patterns;

public class Pattern9_DiamondStarPattern {

    public static void main(String[] args) {

        // Star pyramid + inverted Star pyramid is = Diamond star pattern

        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" "); // this one is for spaces
            }

            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

        // so above code has completed the first half of the diamond pyramid

        for(int i=5;i>=1;i--){
            for(int j=4;j>i-1;j--){
                System.out.print(" ");
            }

            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
