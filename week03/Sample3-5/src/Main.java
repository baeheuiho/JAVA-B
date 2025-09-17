import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        float litter = 0.0f;
        float km = 0.0f;
        float result = 0.0f;

        System.out.print("소비된 연료량 입력 ");
        litter = keyboard.nextFloat();
        System.out.print("운행한 거리 입력 ");
        km = keyboard.nextFloat();


        result = km / litter;


        System.out.printf("자동차 소비된 연료 : %.1f Litter\n", litter);
        System.out.printf("자동차 운행 거리 : %.1f Km\n", km);
        System.out.printf("연비 : %.2f %c\n", result, '\u339e');
    }
}