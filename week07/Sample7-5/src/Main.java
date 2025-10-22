import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int num1, num2, num3;
        int result;

        System.out.print("3개의 정수를 입력 : ");
        num1 = keyboard.nextInt();
        num2 = keyboard.nextInt();
        num3 = keyboard.nextInt();

        result = num1 >= num2 ? ((num1 >= num3) ? num1 : num2 >= num3 ? num2 :  num3) :
                (num2 >= num3 ? num2 : (num3 >= num1 ? num3 :  num1));
        System.out.printf("입력한 정수 %d, %d와 %d중에 가장 큰 수는 %d 입니다.\n",
                num1, num2, num3, result);

        if (num1 >= num2) {
            if (num1 >= num3){
                result = num1;
            } else if (num2 >= num3){
                result = num2;
            } else {
                result = num3;
            }
        } else if (num2 >= num3){
            result = num2;
        } else if (num3 >= num1){
            result = num3;
        } else {
            result = num1;
        }
        System.out.printf("입력한 정수 %d, %d와 %d중에 가장 큰 수는 %d 입니다.\n",
                num1, num2, num3, result);



    }
}