import java.util.Arrays;
import java.util.Scanner;

public class _1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] score = new double[N];
        for (int i = 0; i<N; i++){
            score[i] = sc.nextDouble();
        }
        sc.close();

        Arrays.sort(score);
        double result = 100;
        for (int i = 0; i<N-1; i++){
            result += score[i]/score[N-1]*100;
        }

        System.out.println(result/N);
    }
}