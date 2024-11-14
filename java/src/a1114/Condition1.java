package a1114;

public class Condition1 {
    public static void main(String[] args) {
        int score = 85;
        char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C'); // 겉에 큰 괄호 빼도 되는데 보기에 좋음 ㅇㅇㅋ
        System.out.println(score + "점은 " + grade + "등급입니다.");
    }
}
