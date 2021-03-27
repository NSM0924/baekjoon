import java.util.Scanner;

public class _2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int[] R = new int[T];
        String[] S = new String[T];
        for (int i = 0; i<T; i++){
            R[i] = sc.nextInt(); S[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i<T; i++){
            String P = "";
            for(int j = 0; j<S[i].length(); j++){
                for (int k = 0; k<R[i]; k++){
                    P += S[i].charAt(j);
                }
            }
            System.out.println(P);
        }
    }
}
