package _10807;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i = 1; i <= n; i++) {

            arrList.add(sc.nextInt());
        }

        int target = sc.nextInt();
        int count = 0;

        for (int value : arrList) {

            if (value == target) {
                count++;
            }
        }

        System.out.println(count);

    }
}
