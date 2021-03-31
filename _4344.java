import java.util.Scanner;

public class _4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();
        int N = 0;
        int[] score = new int[1000];

        for (int i = 0; i<C; i++){
            N = sc.nextInt();
            int total = 0;
            int num = 0;

            for (int j = 0; j<N; j++){
                score[j] = sc.nextInt();
                total += score[j]; // 합계
            }
            double avg = (double)total / N; // 평균

            //학생수 세
            for (int j = 0; j<N; j++){
                if (score[j]>avg){
                    num++;
                }
            }
            System.out.printf("%.3f",100.0*num/N);
            System.out.println("%");

        }
        sc.close();
    }
}