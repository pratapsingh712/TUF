package patterns;

public class Pattern19_SymmetricVoidPattern {

    public static void main(String[] args) {

        // so the logic for the upper half is we print stars, spaces, stars

        for(int i=0;i<5;i++){
            // print stars
            for(int j=0;j<5-i;j++){
                System.out.print("*");
            }
            // print spaces
            for(int j=0;j<2*i;j++){
                System.out.print(" ");
            }
            //print stars again
            for(int j=0;j<5-i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=5;i>0;i--){
            //print stars
            for(int j=0;j<=5-i;j++){
                System.out.print("*");
            }
            //print spaces
            for(int j=0;j<2*(i-1);j++){ // here I am decreasing the spaces by because i=5 would print 10 spaces which is not required for value = 5 we would need spaces from 0 to 8
                System.out.print(" ");
            }
            //print star again
            for(int j=0;j<=5-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
