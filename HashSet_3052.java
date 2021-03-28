import java.util.HashSet;
import java.util.Scanner;

public class HashSet_3052 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> num = new HashSet<Integer>();
        for (int i = 0; i<10; i++){
            num.add(sc.nextInt()%42);
        }
        sc.close();

        System.out.println(num.size());
    }
}
