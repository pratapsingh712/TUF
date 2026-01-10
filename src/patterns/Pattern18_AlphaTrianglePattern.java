package patterns;

public class Pattern18_AlphaTrianglePattern {
    public static void main(String[] args) {

        for(int i=0;i<5;i++){
            char ch = (char) ('E'-i);

            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }
    }
}
