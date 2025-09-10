import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name = "";
        int age = 0;
        char gender = ' ';
        char result = ' ';

        System.out.print("당신의 이름은 ? ");
        name = keyboard.nextLine();
        System.out.printf("%s님의 나이는 ? ", name);
        age = keyboard.nextInt();
        System.out.printf("%s님의 성별 (남 = M, 여 = F) ? ", name);
        gender = keyboard.next().charAt(0);

        result = gender == 'M' ? '남' : '여';

        System.out.printf("%s님의 나이는 %d살 입니다.\n", name, age);
        System.out.printf("%s님의 성별은 %c(%c자) 입니다.\n", name, gender, result);

    }
}