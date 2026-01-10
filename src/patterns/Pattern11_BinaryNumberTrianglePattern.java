package patterns;

public class Pattern11_BinaryNumberTrianglePattern {

    public static void main(String[] args) {

        int coin = 1;

        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(coin+" ");
                coin = 1-coin;
            }
            System.out.println();
        }
    }
}
