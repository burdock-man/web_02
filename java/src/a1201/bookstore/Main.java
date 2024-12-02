package a1201.bookstore;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 도서 추가 (addBook)
        // 도서 삭제 (deleteBook)
        // 도서 수정 (updateBook)
        // 도서 조회 (searchBook)

        BookDAO content = new BookDAO();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. 도서 목록");
            System.out.println("2. 도서 조회");
            System.out.println("3. 도서 추가");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 수정");
            System.out.println("6. 정보 저장");
            System.out.println("7. 정보 불러오기");
            System.out.println("0. 프로그램 종료\n");
            System.out.print("진행할 업무를 선택하세요.");

            try {
                int select = scan.nextInt();

                
            } catch (Exception e) {
                System.out.println("\n*** 선택 오류 : 다시 선택해 주세요 (" + e.getMessage() + ") ***");
                scan.nextLine();
                continue;
            }
            // content.bookList();
            // break;
        }






        
    }
}
