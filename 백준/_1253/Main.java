package _1253;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int []arr = new int[n];

        int count = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        for (int i = 0 ; i < n ; i++) {
            int m = arr[i];
            int start_index = 0;
            int end_index = n-1;

            while(start_index < end_index) {

                if (arr[start_index] + arr[end_index] == m) {
                    if (start_index != i && end_index != i) {
                        count++;
                        break;
                    }
                    if (start_index == i) {
                        start_index++;
                    } else if (end_index == i) {
                        end_index--;
                    }
                } else if (arr[start_index] + arr[end_index] < m) {
                    start_index++;
                } else {
                    end_index--;
                }
            }
        }
        System.out.println(count);
    }

}
