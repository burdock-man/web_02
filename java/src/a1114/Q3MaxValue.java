package a1114;

import java.util.Scanner;

public class Q3MaxValue {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("정수 x를 입력해 주세요.");
        int x = scan.nextInt();
        System.out.print("정수 y를 입력해 주세요.");
        int y = scan.nextInt();
        

        int result = (x < y) ? y :  x;


        System.out.println();
        System.out.println("x(" + x + ")와 y(" + y + ")중,");
        System.out.println("더 큰 값은 " + result + "입니다.");
    }
}
