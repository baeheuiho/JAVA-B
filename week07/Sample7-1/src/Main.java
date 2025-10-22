import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2;
        float result;

        System.out.print("분자 입력 : ");
        num1 = keyboard.nextInt();
        System.out.print("분모 입력 : ");
        num2 = keyboard.nextInt();

        result = (num2 == 0) ? 0.0f : (float) num1 / num2;
        String temp = (result == 0.0f) ? "ERROR : 분모가 0으로 나누셈을 할수 없음" :
                          String.format("%d / %d = %.2f\n", num1, num2, result);
        System.out.println(temp);

        if (num2 == 0) {
            System.err.println("ERROR : 분모가 0으로 나누셈을 할수 없음");
        } else {
            result = (float) num1 / num2;
            System.out.printf("%d / %d = %.2f\n", num1, num2, result);
        }
    }
}