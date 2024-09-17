package _11720;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String num = sc.next();
        int result = 0;

        char[] numArr = num.toCharArray();
        for (int i = 0; i < n; i++) {

            result += numArr[i] - '0';
        }

        System.out.println(result);

    }
}
