package a1119;

import java.util.Scanner;

public class Currency_ysb {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("\n\n금액을 입력하세요: ");
        int cash = scan.nextInt();
        int num = 0;
        
        int currency[] = new int[8];
        currency[0] = 50000;
        currency[1] = 10000;
        currency[2] = 5000;
        currency[3] = 1000;
        currency[4] = 500;
        currency[5] = 100;
        currency[6] = 50;
        currency[7] = 10;

        for (int i = 0; i < currency.length; i++) {
            num = cash / currency[i];
            cash = cash - (num * currency[i]);

            if (currency[i] == currency[0]) System.out.printf("\n오만원권 : %d 매", num);
            if (currency[i] == currency[1]) System.out.printf("\n만원권   : %d 매", num);
            if (currency[i] == currency[2]) System.out.printf("\n오천원권 : %d 매", num);
            if (currency[i] == currency[3]) System.out.printf("\n천원권   : %d 매", num);
            if (currency[i] == currency[4]) System.out.printf("\n오백원   : %d 개", num);
            if (currency[i] == currency[5]) System.out.printf("\n백원     : %d 개", num);
            if (currency[i] == currency[6]) System.out.printf("\n오십원   : %d 개", num);
            if (currency[i] == currency[7]) System.out.printf("\n십원     : %d 개", num);
        }
        
    }
}
