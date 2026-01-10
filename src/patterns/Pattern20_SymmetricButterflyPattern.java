package patterns;

public class Pattern20_SymmetricButterflyPattern {

    public static void main(String[] args) {

        // so the logic is we print the first half where we print, space, print

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            // print space
            for(int j=0;j<2*(4-i);j++){
                System.out.print(" ");
            }
            // print star again
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // second half of butterfly

        for(int i=4;i>=0;i--){
            //print stars
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            //print spaces
            for(int j=0;j<2*(4-i);j++){
                System.out.print(" ");
            }
            //print star again
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
