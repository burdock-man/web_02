package a1114;

public class EvenOdd {
    public static void main(String[] args) {
        int number = 7;

        String result = (number % 2 == 0) ? "짝수" : "홀수"; // 조건식 ? 조건이 참일때 값 : 거짓일때 값
        System.out.println(result); // 선언 변수 = (조건) ? 참 : 거짓;
    }
}
