import java.util.Scanner;

public class MathMax_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        System.out.println(Math.max(change(A), change(B)));
    }

    private static int change(int num) {
        return (num%100%10*100) + (num%100/10*10) + (num/100);
    }
}
