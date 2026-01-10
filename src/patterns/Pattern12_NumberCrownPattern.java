package patterns;

public class Pattern12_NumberCrownPattern {
    public static void main(String[] args) {

        int spaces = 2*(4-1);

        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            // we want space for the other half
            for(int j=1;j<=spaces;j++){
                System.out.print(" ");
            }
            // now print the number for the second half
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();

            // decreased spaces by 2 after each row
            spaces -= 2;
        }
    }
}
