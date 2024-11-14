package a1114;

import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        System.out.print("당신의 나이를 입력해 주세요. : ");
        int age = scan.nextInt();

        String value = ((age >= 1 && age < 13) ? "어린이" : (age >= 13 && age < 20) ? "청소년" : (age >= 20  && age < 99) ? "으른" : "ㅋㅋ?");
        System.out.println();
        System.out.println(value);

    }
}