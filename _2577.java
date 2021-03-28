import java.util.Scanner;

public class _2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        String num = Integer.toString(A*B*C);
        for (int i = 0; i<10; i++){
            int result = 0;
            for (int j = 0; j< num.length(); j++){
                if ((num.charAt(j)-'0') == i){
                    result++;
                }
            }
            System.out.println(result);
        }
    }
}
