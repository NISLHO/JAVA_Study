package ch4;

public class ch4 {
    public static void main(String[] args){
        // 4-1
        /*int age = 7;
        if (age >= 8){
            System.out.println("학교에 다닙니다");
        } else {
            System.out.println("학교에 다니지 않습니다");
        }*/
        // 4-2
        /*int age = 9;
        int charge;

        if (age < 8){
            charge = 1000;
            System.out.println("취학 전 아동입니다");
        }
        else if (age < 14){
            charge = 2000;
            System.out.println("초등학생입니다.");
        }
        else if (age < 20){
            charge = 2500;
            System.out.println("중고등학생입니다.");
        }
        else {
            charge = 3000;
            System.out.println("일반인입니다.");
        }
        System.out.println("입장료는" + charge + "원입니다.");*/

        // 4-3
        /*int ranking = 1;
        char medalColor;

        switch (ranking) {
            case 1 : medalColor = 'G';
            break;
            case 2 : medalColor = 'S';
            break;
            case 3 : medalColor = 'B';
            break;
            default:
                medalColor = 'A';
        }
        System.out.println(ranking + "등 메달의 색깔은" + medalColor + "입니다.");*/

        // 4-4
        /*String medal = "Gold";

        switch (medal) {
            case "Gold" : System.out.println("금메달입니다.");
            break;
            case "Silver" : System.out.println("은메달입니다.");
            break;
            case "Bronze" : System.out.println("동메달입니다.");
            break;
            default: {
                if (medal.equals("gege")){
                    System.out.println("줴줴이야");
                }
                else {
                    System.out.println("알 수 없는 오류입니다");
                }
            }
        }*/
        // 4-5
        /*int num = 1;
        int sum = 0;

        while (num <= 10) {
            sum += num;
            num++;
        }
        System.out.println("1부터 10까지의 합은" + sum + "입니다.");*/

        // 4-6
        /*int i;
        int sum;
        for (i = 0, sum = 0; i <= 10; i++){
            sum += i;
        }
        System.out.println("1부터 10까지의 합은" + sum + "입니다.");*/

        // 4-7
        /*int dan;
        int times;

        for (dan =2; dan <=9; dan++){
            for (times = 1; times <= 9; times++){
                System.out.println(dan + "X" + times + "=" + dan * times);
            }
            System.out.println("");
        }*/

        // 4-8
        /*int total = 0;
        int num;

        for (num = 1; num <= 100; num++){
            if (num % 2 == 0)
                continue;
            total += num;
        }
        System.out.println("1부터 100까지의 홀수의 합은" + total + "입니다.");*/

        // 4-9
        /*int sum = 0;
        int num = 0;

        for (num = 0; ; num++){
            sum += num;
            if (sum >= 100)
                break;
        }
        System.out.println("num : " + num);
        System.out.println("sum : " + sum);*/

        // 4장 되새김 문제 1
        /*int num1 = 10;
        int num2 = 2;
        int value = 0;

        char operator = '*';
        String operator2 = "/";

        if (operator == '+') {
            value = num1 + num2;
        }
        else if (operator == '-') {
            value = num1 - num2;
        }
        else if (operator == '*') {
            value = num1 * num2;
        }
        else if (operator == '/') {
            value = num1 / num2;
        }
        System.out.println(value);

        switch (operator2) {
            case "+" : value = num1 + num2;
            break;
            case "-" : value = num1 - num2;
            break;
            case "*" : value = num1 * num2;
            break;
            case "/" : value = num1 / num2;
            break;
        }
        System.out.println(value);*/

        // 되새김 문제2

    }
}
