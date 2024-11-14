package a1114;

public class InfinityNaN {
    public static void main(String[] args) {

        // 잘못된 코드 ==============================================

        // int x = 5;
        // double y = 0.0;
        // double z = x / y; // infinity
        // double z = x % y; // NaN

        // System.out.println();
        // System.out.println(z + 2);

        // =========================================================

        int x = 5;
        double y = 0.0;
        double z = x / y;

        if(Double.isInfinite(z) || Double.isNaN(z)) {
            System.out.println("값 산출 불가");
        } else {
            System.out.println(z + 2);
        }

        

    }
}
