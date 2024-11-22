package a1122.homework;

import java.util.Scanner;

public class StudentEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Student s1 = new Student("홍길동", 87, 62, 81);
        Student s2 = new Student("김철수", 77, 54, 68);
        Student s3 = new Student("이영희", 90, 96, 89);
        Student s4 = new Student("곽두칠", 12, 23, 34);

        Student[] sArr = {s1, s2, s3, s4};

        System.out.println();

        while (true) {

            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("|                                  진행하실 업무를 선택하세요.                                     |");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.println("|  1. 학생정보열람   |   2. 학생정보수정   |   3. 학생정보생성   |   4. 학생정보삭제   |  5. 종료  |");
            System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
            System.out.printf("| 선택> ");
            int select = scan.nextInt();

            if (select == 1) {
                Student.sInfo(sArr);
                Student.sAvg();
            } else if (select == 2) {
                Student.sInfo(sArr);
                System.out.println("|                                                                                                  |");
                System.out.println("| 수정할 학생 선택                                                                                 |");
                System.out.printf("| 리스트 번호> ");
                int modSelect = scan.nextInt();
                scan.nextLine(); // 개행문자 제거? 이걸 해야 다음 문자를 받을수 있나보다.
                if (modSelect < 0 || modSelect > sArr.length) {
                    System.out.println("|                                                                                                  |");
                    System.out.printf("| 잘못된 리스트 번호입니다. 1부터 %d까지의 리스트 번호를 입력해 주세요.                             |\n", sArr.length);
                    System.out.println("|                                                                                                  |");
                    continue;
                }

                System.out.println("|                                                                                                  |");
                System.out.printf("| 수정할 학생의 이름을 입력해 주세요. (현재 이름: %s)                                          |\n", sArr[modSelect-1].getName());
                System.out.print("| 이름> ");

                String modName = scan.nextLine();
                sArr[modSelect-1].setName(modName);


                // 이 아래부터 계속 하면 된다.
                // 일단 이름 수정하는것까지는 구현했는데,
                // 성적을 바꿔도 평균이 바뀌지 않는 문제가 생겼다.

                // System.out.println("|                                                                                                  |");
                // System.out.printf("| 수정할 학생의 국어 성적을 입력해 주세요. (현재 국어 성적: %3s)                                   |\n", sArr[modSelect-1].getKoreanScore());
                // int modKorean = scan.nextInt();
                // if (modKorean >= 0 && modKorean <= 100) {
                //     sArr[modSelect-1].setKoreanScore(modKorean);
                // } else {
                //     System.out.println("|                                                                                                  |");
                //     System.out.println("| 잘못된 성적입니다. 1부터 100까지의 성적을 입력해 주세요. 현재 국어점수는 0점으로 처리됩니다.            |");
                //     System.out.println("|                                                                                                  |");
                //     sArr[modSelect-1].setKoreanScore(0);
                // }


                Student.sTotalClear(); // 성적 초기화 해줘야지 누적이 안된다.

            } else if (select == 3) {
                
            } else if (select == 4) {
                
            } else if (select == 5) {
                System.out.println("| 프로그램 종료                                                                                    |");
                System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
                break;
            } else {
                System.out.println("|                                                                                                  |");
                System.out.println("| 잘못된 번호입니다. 1부터 5까지의 번호를 입력해 주세요.                                           |");
                System.out.println("|                                                                                                  |");
            }









        }
    }
}
