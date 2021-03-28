import java.util.Scanner;

public class _1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        // toUpperCase() 모두 대문자로 변경, toLowerCase() 소문자
        sc.close();

        int[] count = new int[26];
        for (int i = 0; i<str.length(); i++){
            int num = str.charAt(i)-'A';
            // A = 65, B - A = 66 - 65 = 1
            count[num]++;
        }

        int max = 0;
        char result = '?';
        for (int i = 0; i<count.length; i++){
            if (max<count[i]){
                max = count[i];
                result = (char)(i+'A');
            }else if(max == count[i]){
                result = '?';
            }
        }

        System.out.println(result);
    }
}