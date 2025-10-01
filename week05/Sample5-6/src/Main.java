import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int data = 0;
        String result = "";

        System.out.print("정수 입력 : ");
        data = keyboard.nextInt();

        result = data > 0 ? "양수" : ((data == 0) ? "영" : "음수");


        System.out.printf("%d는 %s 입니다.\n", data, result);
    }
}