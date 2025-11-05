import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        final int COUNT = 10;
        int num;
        int sum = 0;

        for (int count = 0; count <= COUNT;   ) {
            System.out.printf("%d회 양의 정수 입력 : ", count);
            num = keyboard.nextInt();
            if (num < 0){
                System.err.println("ERROR : 양의 정수 입력");
                System.in.read();
            } else {
                sum += num;
                count++;
            }
        }

        System.out.printf("합계 = %,d\n", sum);
        System.out.printf("평균 : %.2f\n", sum / (float) COUNT);
    }
}