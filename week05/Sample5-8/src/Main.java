import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char ch;
        String result, result1;

        System.out.print("하나의 문자 입력 : ");
        ch = keyboard.next().charAt(0);

        result = (ch >= 'A' && ch <= 'Z') ||
                (ch >= 'a' && ch <= 'z') ||
                (ch >= '0' && ch <= '9') ? "올바른" : "올바르지 않은";

        result1 = (ch >= 'A' && ch <= 'Z') ? "대문자" :
                ((ch >= 'a' && ch <= 'z') ? "소문자" :
                        ((ch >= '0' && ch <= '9') ? "숫자" : "X"));

        System.out.printf("입력 받은 %c는 %s(%s) 문자 입니다\n", ch, result, result1);
    }
}