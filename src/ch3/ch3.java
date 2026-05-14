package ch3;

public class ch3 {
    public static void main(String[] args) {

        // 3-1
        /*int mathScore = 90;
        int engScore = 70;
        int korScore = 60;

        int totalScore = mathScore + engScore + korScore;
        System.out.println(totalScore);

        double avgScore = totalScore / 3.0;
        System.out.println(avgScore);*/

        // 3-2
        /*int gameScore = 150;

        int lastScore1 = gameScore++;
        System.out.println(lastScore1);

        int lastScore2 = gameScore--;
        System.out.println(lastScore2);*/

        // 3-3
        /*int num1 = 10;
        int num2 = 20;

        boolean flag = (num1 > 0) && (num2 > 0);
        System.out.println(flag);

        flag = (num1 < 0) && (num2 > 0);
        System.out.println(flag);

        flag = (num1 < 0) || (num2 > 0);
        System.out.println(flag);*/

        // 3-4

        /*int num1 = 10;
        int i = 2;

        boolean value = ((num1 = num1 + 10) < 10) && ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);

        value = ((num1 + num1 + 10) > 10) || ((i = i + 2) < 10);
        System.out.println(value);
        System.out.println(num1);
        System.out.println(i);*/

        // 3-5

        /*int fatherage = 45;
        int motherage = 47;

        char ch;
        ch = (fatherage > motherage) ? 'T' : 'F';
        System.out.println(ch);*/

        // 3-6
        /*int num = 0B00000101;

        System.out.println(num << 2);
        System.out.println(num >> 2);
        System.out.println(num >>> 2);

        System.out.println(num);
        num = num << 2;
        System.out.println(num);*/

        // 되새김 문제 14
        int num1 = 5;
        int num2 = ~num1;

        System.out.println("원래 값:" + num1);
        System.out.println("비트를 반대로 뒤짚은 값:" + num2);
        System.out.println("이진수로 표현한 원래 값:" + Integer.toBinaryString(num1));
        System.out.println("이진수로 표현한 뒤짚은 값:" + Integer.toBinaryString(num2));


    }
}
