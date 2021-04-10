import java.util.Scanner;

public class _10872 {
    public static int factorial(int num){
        if (num <= 1){
            return 1;
        }
        return num * factorial(num - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();

        int result = factorial(N);
        System.out.println(result);
    }
}