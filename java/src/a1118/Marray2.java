package a1118;

import java.util.Scanner;

public class Marray2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[][] score = new int [3][3];

        int result = 0;
        int student = 0;
        int k;

        for(int i = 0; i < score.length; i++) {
            System.out.println();
            System.out.printf("%d반 학생들의 수학 점수를 입력하세요; ", i+1);
            System.out.println();

            for(k = 0; k < score[i].length; k++) {
                System.out.printf("%d반 %d번: ", i+1, k+1);
                score[i][k] = scan.nextInt();
                result += score[i][k];
                student += k;
            }

            k = 0;
        }

        double avg = (double) result / student;

        System.out.println();
        System.out.println("전교생 수학 점수 총합: " + result);
        System.out.printf("전교생 수학 점수 평균: %.1f", avg);
    }
}
