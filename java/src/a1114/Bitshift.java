package a1114;

public class Bitshift {
    public static void main(String[] args) {
        int num1 = 1; // 이거 공부좀 해야할듯 ★★★★★★★★★★★★ 알듯말듯하네
        int result1 = num1 << 3; // 이진수의 0000 0001에서 1을 좌로 3칸 이동
        int result2 = num1 * (int)Math.pow(2, 3);
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
    }
}
