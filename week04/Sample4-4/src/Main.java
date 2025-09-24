import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int won = 0;           // data
        float convert;         // Data
        float dollar = 0.0f;   // 정보


        System.out.print("오늘의 dollar 환율은 ? ");
        convert = keyboard.nextFloat();
        System.out.print("원화 얼마를 dollar로 환전할까 ? ");
        won = keyboard.nextInt();



        dollar = won / convert;


        System.out.printf("원화 %,d원은 %,f 달러($) 입니다.\n", won, dollar);

    }
}