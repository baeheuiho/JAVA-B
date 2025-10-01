import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        char type = ' ';
        int width = 0;
        int height = 0;
        int area = 0;

        System.out.print("사각형의 가로 길이 입력 : ");
        width = keyboard.nextInt();
        System.out.print("사각형의 세로 길이 입력 : ");
        height = keyboard.nextInt();


        type = width == height ? '정' : '직';
        area = width * height;


        System.out.printf("**** %c사각형 넓이 ******\n", type);
        System.out.printf("\t 가로 길이 : %,d Cm\n", width);
        System.out.printf("\t 세로 길이 : %,d Cm\n", height);
        System.out.printf("\t넓      이 : %,d \u33a0\n", area);

    }
}