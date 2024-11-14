package a1114;

public class Compare {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("Ex 1 ======================================================");
        System.out.println();


        int num1 = 10;
        int num2 = 10;

        boolean result1 = (num1 == num2);
        boolean result2 = (num1 != num2);
        boolean result3 = (num1 <= num2);

        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);

        System.out.println();
        System.out.println("Ex 2 ======================================================");
        System.out.println();

        char char1 = 'A'; // 65
        char char2 = 'B'; // 66

        boolean result4 = (char1 < char2);

        System.out.println("result4: " + result4);

        System.out.println();
        System.out.println("Ex 3 ======================================================");
        System.out.println();

        int num3 = 1;
        double num4 = 1.0;
        
        boolean result5 = (num3 == num4);

        System.out.println("result5: " + result5);

        System.out.println();
        System.out.println("Ex 4 ======================================================");
        System.out.println();

        float num5 = 0.1f; // float는 근사치로 저장되므로 float와 double값이 다르게 평가됨.
        double num6 = 0.1; // ★★★★★★★★★★★★★★★★★★★★★★★★★★★ 부동소수점 따로 공부해야할듯.

        boolean result6 = (num5 == num6);
        boolean result7 = (num5 == (float)num6);

        System.out.println("result6: " + result6);
        System.out.println("result7: " + result7);

        System.out.println();
        System.out.println("Ex 5 ======================================================");
        System.out.println();

        String str1 = "자바";
        String str2 = "Java";

        boolean result8 = (str1.equals(str2));
        boolean result9 = (! str1.equals(str2));

        System.out.println("result8: " + result8);
        System.out.println("result9: " + result9);
    

    }
}
