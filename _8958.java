import java.util.Scanner;

public class _8958 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String[] oxResult = new String[num];
        for (int i = 0; i<num; i++){
            oxResult[i] = sc.next();
        }
        sc.close();


        for (int i = 0; i<num; i++){
            int scoreNum = 0; int score = 0;
            for (int j = 0; j<oxResult[i].length(); j++){
                if (oxResult[i].charAt(j) == 'O'){
                    score += ++scoreNum;
                }else{
                    scoreNum = 0;
                }
            }
            System.out.println(score);
        }
    }
}
