package a1119;

import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {

        System.out.println("\n(201p 7번문제)=========================================");

        int[] array1 = {1, 5, 3, 8, 2}; // 배열에서 최대값 출력하는 코드 (for문 사용)

        int max1 = 0;
        int min1 = 0;

        for (int i = 0; i < array1.length; i++) {
            if (max1 < array1[i]) max1 = array1[i];
            if (min1 > array1[i] || min1 == 0) min1 = array1[i];
        }

        System.out.println("\n최대값: " + max1);
        System.out.println("최소값: " + min1);

        System.out.println("\n=======================================================");
        System.out.println("\n(201p 8번문제)=========================================");

        int[][] array2 = {{95, 86}, {83, 92, 96}, {78, 83, 93, 87, 88}}; // 배열 항목 전체 합과 평균을 구해 출력하는 코드 (중첩for문 사용)

        int sum2 = 0;
        int num2 = 0;

        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array2[i].length; j++) {
                sum2 += array2[i][j];
                num2++;
            }
        }

        double avg2 = (double) sum2 / num2;

        System.out.println("\n합계: " + sum2);
        System.out.printf("평균: %.2f\n", avg2);

        System.out.println("\n=======================================================");
        System.out.println("\n(201p 9번문제)=========================================");

        // 문제 설명하기 애매하니까 페이지 참조.

        Scanner scan = new Scanner(System.in);

        // 학생수 > 학생수 3명
        // 점수입력 > 애들 각각 점수를 입력받아서 변수로 선언(배열로하면될듯)
        // 점수리스트 > 그냥 점수 받아서 선언한 변수 출력오는거
        // 분석 > 최고점수 출력, 평균점수 출력(소수점1자리).
        // 종료 > break


        while (true) {

            System.out.println("\n.......................................................");
            System.out.println("1.학생수 : 2.점수입력 : 3.점수리스트 : 4.분석 : 5.종료");
            System.out.println(".......................................................");

            System.out.print("\n선택> ");
            int choice3 = scan.nextInt();

            break;
        }



        System.out.println("\n=======================================================");

    }
}
