package _10950;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        int result [] = new int[A];

        for (int i = 0; i < A; i++) {
            int B = sc.nextInt();
            int C = sc.nextInt();

            result[i] = B + C;

        }

        sc.close();

        for(int value : result){
            System.out.println(value);
        }


    }
}
