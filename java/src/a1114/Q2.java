package a1114;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {

        // 400과 4로 나눈값이 0일때 윤년. 근데 100으로 나눈값이 0인것은 윤년이 아님.

        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("현재는 몇 년 입니까?: ");
        int year = scan.nextInt();

        // 이건 아까 if로 구했던거 ==============================================

        // if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
        //     System.out.println();
        //     System.out.print(year + "년은 윤년입니다.");
        // } else {
        //     System.out.println();
        //     System.out.print(year + "년은 윤년이 아닙니다.");
        // }

        // ====================================================================

        String result = ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "윤년입니다." : "윤년이 아닙니다.");
        System.out.println();
        System.out.print(year + "년은 " + result);

    }
}