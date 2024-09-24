package _11659;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n+1];
        int[] arr2 = new int[n+1];

        arr[0] = 0;
        arr2[0] = 0;

        for (int i = 1; i < n+1; i++) {

            arr[i] = sc.nextInt();
            arr2[i] = arr2[i-1] + arr[i];
        }


        for (int i = 0; i < m; i++) {

            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(arr2[b] - arr2[a-1]);

        }



    }


    


}
