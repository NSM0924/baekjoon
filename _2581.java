import java.util.Scanner;

public class _2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        boolean[] primeNum = new boolean[N+1];
        primeNum[1] = true;

        for (int i = 2; i<=N; i++){
            for (int j = 2; i*j<=N; j++){
                primeNum[i*j] = true;
            }
        }

        int mini = 10001;
        int result = 0;
        for (int i =M; i<=N; i++){
            if (!primeNum[i]){
                result += i;
                if(mini>i){
                    mini = i;
                }
            }
        }
        if(mini == 10001){
            System.out.println("-1");
        }else{
            System.out.println(result);
            System.out.println(mini);
        }
    }
}
