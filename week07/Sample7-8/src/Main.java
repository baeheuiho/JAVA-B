import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int hours;
        int salary;
        int extra;

        System.out.print("주당 근무 시간 입력 : ");
        hours = keyboard.nextInt();

        if (hours <= 40) {
            salary = 11500 * hours;
            extra = 0;
        } else {
            salary = 11500 * 40;
            extra = (int) (11500 * 1.5) * (hours - 40);
        }

        System.out.printf("%d시간의 이르바이트 급여는 초과 수당 %,d원과 급여 %,d를 합한 %,d 원 입니다.\n",
                hours, extra, salary, extra + salary);
    }
}