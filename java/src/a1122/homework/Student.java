package a1122.homework;

class Student {
    private String name;
    private int id;
    private int koreanScore;
    private int englishScore;
    private int mathScore;

    private int number = 0;
    private static int studentTotal = 0;

    public Student(String name, int id, int koreanScore, int englishScore, int mathScore) {
        this.name = name;
        this.id = id;
        this.koreanScore = koreanScore;
        this.englishScore = englishScore;
        this.mathScore = mathScore;
        studentTotal++;
        number = studentTotal;
        id += 20240000;

        if (id <= 0 || id >= 10000) {
            System.out.println("*** 오류 : 학번은 1부터 9999까지 적을 수 있습니다. 학번이 자동으로 생성됩니다. ***");
            this.id = 20250000 - number;
        } else if (koreanScore < 0) {
            System.out.println("*** 오류 : 점수는 0부터 100까지 적을 수 있습니다. 0점으로 처리됩니다. ***");
            this.koreanScore = 0;
        } else if (englishScore < 0) {
            System.out.println("*** 오류 : 점수는 0부터 100까지 적을 수 있습니다. 0점으로 처리됩니다. ***");
            this.englishScore = 0;
        } else if (mathScore < 0) {
            System.out.println("*** 오류 : 점수는 0부터 100까지 적을 수 있습니다. 0점으로 처리됩니다. ***");
            this.mathScore = 0;
        }
    }





    public String getName() {return name;}
    public void setName(String name) {this.name = name;}

    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public int getKoreanScore() {return koreanScore;}
    public void setKoreanScore(int koreanScore) {this.koreanScore = koreanScore;}

    public int getEnglishScore() {return englishScore;}
    public void setEnglishScore(int englishScore) {this.englishScore = englishScore;}

    public int getMathScore() {return mathScore;}
    public void setMathScore(int mathScore) {this.mathScore = mathScore;}


}
