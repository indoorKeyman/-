package _1940;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] arr = new int[n];

        int start_index = 0;
        int end_index = n - 1;

        int count = 0 ;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        while (start_index < end_index) {

            if (arr[start_index] + arr[end_index] > m) {
                end_index--;
            }

            else if (arr[start_index] + arr[end_index] < m) {
                start_index++;
            }

            else {
                end_index--;
                start_index++;
                count++;
            }

        }

        System.out.println(count);
    }

}
