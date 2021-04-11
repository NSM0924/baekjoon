import java.util.Arrays;
import java.util.Scanner;

public class _2750 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr);
//        for (int i = 0; i<arr.length; i++){
//            for (int j = 0; j<arr.length - i -1; j++){
//                if (arr[j] > arr[j+1]){
//                    int temp = arr[j+1];
//                    arr[j+1] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
        for (int i : arr){
            System.out.println(i);
        }

    }
}
