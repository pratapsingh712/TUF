package basicHashing;

import java.util.Scanner;

public class PreStoringAndFetching {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int array[] = new int[n];

        for(int i=0;i<n;i++){
            array[i] = sc.nextInt();
        }

        // now let's create pre-storing hash considering it has value less than 13

        int[] hash = new int[13];

        for(int i=0;i<n;i++){ // this is for iterating over array not hash index the array values are hash index
            hash[array[i]] += 1;
        }

        int q = sc.nextInt();

        while(q--!=0){
            int number;
            number = sc.nextInt();

            System.out.println(hash[number]);
        }

    }

}
