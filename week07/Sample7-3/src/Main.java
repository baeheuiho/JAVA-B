import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;
        String result;

        System.out.print("정수 입력 : ");
        num = keyboard.nextInt();

        result = (num % 2 == 0) ? "짝수" : "홀수";   // 조건 연산자
        System.out.printf("%d는 %s 입니다.\n", num, result);

        if (num % 2 == 0) {
            result = "짝수";
        }
        if (num % 2 == 1){
            result = "홀수";
        }
        System.out.printf("%d는 %s 입니다.\n", num, result);

        if (num % 2 == 0) {
            result = "짝수";
        } else {
            result = "홀수";
        }
        System.out.printf("%d는 %s 입니다.\n", num, result);

        switch (num % 2) {
            case 0:
                result = "짝수";
                break;
            default:    // case 1:
                result = "홀수";
        }
        System.out.printf("%d는 %s 입니다.\n", num, result);
    }
}