import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // 준비물
        Scanner keyboard = new Scanner(System.in);
        short first = 0;
        short second = 0;
        int result = 0;

        // Data 입력
        System.out.print("첫번째 값 입력 : ");
       first = keyboard.nextShort();
        System.out.print("두번째 값 입력 : ");
        second = keyboard.nextShort();

        // 처리
        result = first * second;

        // 출력

        System.out.printf("%,d * %,d = %,d\n", first, second, result);



    }
}