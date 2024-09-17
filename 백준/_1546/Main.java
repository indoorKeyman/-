package _1546;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int Max = 0;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > Max) {
                Max = arr[i];
            }
        }

        float total = 0;
        for(int value : arr) {
            total += value;
        }

        System.out.println(total*100/Max/n);
    }
}
