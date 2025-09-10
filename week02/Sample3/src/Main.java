import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 준비물
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int age = 0;

        // Data 입력
        System.out.print("당신의 이름은 ? ");
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는 ? ", name);
        age = keyboard.nextInt();

        // 처리

        // 출력 (필수)
        System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);

    }
}