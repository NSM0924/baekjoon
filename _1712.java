import java.util.Scanner;

public class _1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

//        (n * 상품가격) = 불변비용 + (n * 가변비용)
//        nC = A + nB
//        nC - nB = A
//        n(C - B) = A
//        n = A/C - B

        if (C<=B){
            System.out.println("-1");
        } else {
            System.out.println((A/(C-B))+1);
        }

    }
}
