import java.util.Scanner;

public class _1436 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num = 0;
        while(N > 0) {
            num++;
            if(Integer.toString(num).contains("666")) {
                N--;
            }
        }
        System.out.println(num);
    }
}
