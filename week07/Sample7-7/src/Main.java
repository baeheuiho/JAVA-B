import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int a, b, c;
        String result;
        double s;
        double area;
        boolean flag = true;

        System.out.print("삼각형의 세변의 길이(정수) 입력 : ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if ((a + b > c) && (b + c > a) && (a + c > b)) {
            s = (a + b + c) / 2.0;
            area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            result = String.format(" 면적 : %.2f \u33a0", area);
        } else {
            result = "삼각형을 만들수가 없습니다.";
            flag = false;
        }

        if (flag) {
            System.out.printf("삼각형의 각 변의 길이 %,d Cm, %,d Cm, %,d Cm 이면, %s.\n",
                    a, b, c, result);
        } else {
            System.err.printf("삼각형의 각 변의 길이 %,d Cm, %,d Cm, %,d Cm 이면, %s.\n",
                    a, b, c, result);
        }
    }
}