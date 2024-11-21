package a1121.homework;

import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        int width = 0;
        int height = 0;

        System.out.print("\n가로 길이를 입력하세요> ");
        width = scan.nextInt();
        System.out.print("세로 길이를 입력하세요> ");
        height = scan.nextInt();

        Rectangle rect1 = new Rectangle(width, height); // 객체 생성

        System.out.printf("사각형의 면적은 %d 입니다.", rect1.getArea);

        
        



    }
}
