import java.util.Scanner;

public class _2355 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long A = sc.nextInt();
        long B = sc.nextInt();
        sc.close();

        if(A<=B) {
            System.out.println((A+B)*(B-A+1)/2);
        }else {
            System.out.println((A+B)*(A-B+1)/2);
        }
    }
}