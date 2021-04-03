import java.util.Scanner;

public class _1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = sc.nextInt();
        }
        sc.close();

        int result = 0;
        for (int i = 0; i < N; i++) {
            int count = 0;
            for (int j = 2; j <= num[i]; j++) {
                if (num[i] % j == 0) {
                    count++;
                }
            }
            if (count == 1) {
                result++;
            }
        }

        System.out.println(result);
    }
}