import java.util.Scanner;

public class _10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        sc.close();

        String[] AB = {"a","b","c","d","e","f","g",
                "h","i","j","k","l","m","n","o","p",
                "q","r","s","t","u","v","w","x","y","z"};
        String[] result = new String[26];
        String[] Sarr = S.split("");

        for (int i=0; i<AB.length; i++){
            result[i] = "-1";
            for (int j=0; j< Sarr.length; j++){
                if (AB[i].equals(Sarr[j])){
                    result[i] = Integer.toString(j);
                    break;
                }
            }
            System.out.print(result[i]+" ");
        }
    }
}
