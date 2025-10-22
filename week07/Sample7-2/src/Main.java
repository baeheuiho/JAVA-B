import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num;

        System.out.print("정수 입력 : ");
        num = keyboard.nextInt();

        if (num > 6)
            if (num < 12)
                System.out.println("너는 끝이야");
            else
                System.out.println("미안해, 너는 기회를 상실했어");

    }

}
