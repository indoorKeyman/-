package _10986;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        long result = 0;

        long [] arr = new long[n];
        long [] arr2 = new long[m];

        arr[0] = sc.nextInt();
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i-1] + sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int temp = (int) (arr[i] % m + m) % m;
            if (temp == 0) result++;
            arr2[temp]++;
        }

        for (int i = 0; i < m; i++) {
            result += (arr2[i] * (arr2[i] -1))/2;
        }

        System.out.println(result);

    }
}
