package _2750;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();
        int [] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < num; i++) {

            for (int j = i + 1; j < num; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int value : arr) {
            System.out.println(value);
        }

    }

}
