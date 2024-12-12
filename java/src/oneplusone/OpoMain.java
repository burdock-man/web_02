package oneplusone;

import java.util.Scanner;

public class OpoMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("" + "" +
            "                                ..::::::::..\n" +
            "                             .::::::::::::::::.\n" +
            "                           .:::: ::::  :::: ::::.\n" +
            "                          ::::   ::      ::   ::::\n" +
            "                         ::::::: ::::  :::: :::::::\n" +
            "                         ::::::: :::::::::: :::::::\n" +
            "                          ::::::: :::::::: :::::::\n" +
            "                           ':::      ::      :::'\n" +
            "                             '::::::::::::::::'\n" +
            "                                ''::::::::''\n\n" +

            "                     ::::   ::   ::::::::::     ::::   ::\n" +
            "                   ::    :: ::     ::  ::     ::    :: ::\n" +
            "                     ::::   ::   ::::::::::     ::::   ::\n" +
            "                   :::::::: ::  ::::::::::::  :::::::: ::\n" +
            "                      ::   :::   ::::::::::      ::   :::\n" +
            "                    ::             ...'''      ::        \n" +
            "                     :::::::::   ::::::::::     :::::::::\n"
        );
        System.out.println("┌────────────────────────────────────────────────────────────────────────┐");
        System.out.println("│              모든 편의점을 담다, 행사상품 가이드 원플원!               │");
        System.out.println("└────────────────────────────────────────────────────────────────────────┘");
        System.out.println("  ──────────────────────────────────────────────────────────────────────");
        System.out.println("    광고  |  " + "CU와 함께 연말파티 CHEERS! 인기 와인 41종 20% 할인행사");
        System.out.println("  ──────────────────────────────────────────────────────────────────────");
        System.out.println("  ┌───────────────────────────────────────────────────────────────────┐");
        System.out.println("  │                                                                   │");
        System.out.println("  │                       메뉴를 선택해 주세요.                       │");
        System.out.println("  │                                                                   │");
        System.out.println("  │    [1] 전체 행사상품 목록                [4] 상품 검색            │");
        System.out.println("  │    [2] 1+1 행사상품 목록                                          │");
        System.out.println("  │    [3] 2+1 행사상품 목록                 [5] 관리자 메뉴          │");
        System.out.println("  │                                                                   │");
        System.out.println("  └───────────────────────────────────────────────────────────────────┘");
        System.out.print("   입력 : ");
        try {
            int selectMenu = scan.nextInt();
        } catch (Exception e) {
            System.out.println("\n   ** 오류 : 잘못된 입력입니다. **\n");
        }
    }
}
