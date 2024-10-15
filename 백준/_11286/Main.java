package _11286;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->{

            int first_abs = Math.abs(a);
            int second_abs = Math.abs(b);

            if(first_abs == second_abs){
                return a > b ? 1 : -1;
            }
            else
                return first_abs - second_abs;
        });

        for (int i = 0; i < n; i++) {

            int num = sc.nextInt();

            if (num == 0) {
                if (pq.isEmpty()) {
                    System.out.println("0");
                    continue;
                }
                System.out.println(pq.poll());
            }
            else{
                pq.add(num);
            }
        }
    }
}
