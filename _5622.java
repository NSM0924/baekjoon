import java.util.Scanner;

public class _5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        sc.close();

        int time = 0;
        for (int i = 0; i<str.length(); i++){
            char text = str.charAt(i);
            if (text>='A' && text<='C'){
                time +=3;
            }else if (text>='D' && text<='F'){
                time +=4;
            }else if (text>='G' && text<='I'){
                time +=5;
            }else if (text>='J' && text<='L'){
                time +=6;
            }else if (text>='M' && text<='O'){
                time +=7;
            }else if (text>='P' && text<='S'){
                time +=8;
            }else if (text>='T' && text<='V'){
                time +=9;
            }else if (text>='W' && text<='Z'){
                time +=10;
            }
        }
        System.out.println(time);
    }
}
