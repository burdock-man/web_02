package a1114;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("정수를 입력하세요: ");
        int value = scan.nextInt();

        // if (value > 0) {
        //     System.out.println();
        //     System.out.println(value + "는 양수입니다.");
        // } else if (value < 0) {
        //     System.out.println();
        //     System.out.println(value + "는 음수입니다.");
        // } else if (value == 0) {
        //     System.out.println();
        //     System.out.println(value + "는 0입니다.");
        // } else {
        //     System.out.println();
        //     System.out.println("올바른 정수를 입력해 주세요.");
        // }

        String result = (value > 0) ? "양수입니다." : (value < 0) ? "음수입니다." : (value == 0) ? "0입니다." : "올바른 정수를 입력하세요.";
        System.out.println();
        System.out.println(result);
    }
}
