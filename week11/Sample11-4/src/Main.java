import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[][] employees = {{"홍길동", "1111"}, {"강민성", "1211"}, {"김명성", "2111"},
                {"박건준", "1441"}, {"오유빈", "1444"}, {"니카타", "1456"},
                {"한정호", "1678"}, {"파마트", "1567"}, {"이예린", "1789"},
                {"제이넵", "1789"}};
        int[] hobong = {1, 4, 5, 3, 2, 1, 3, 4, 3, 2};
       int[][] salarys = new int[employees.length][5];  // {기본급, 업무수당, 급여액, 세금, 지급액}

   //     int[][] salarys = {{1, 0, 0, 0, 0, 0}, {4, 0, 0, 0, 0, 0}, }

        int i = 0;
        while (i < employees.length) {
            System.out.printf("%s님의 업무수당 입력 : ", employees[i][0]);
            salarys[i][1] = keyboard.nextInt();

            if (salarys[i][1] >= 0 && salarys[i][1] <= 1000000)
                i++;
            else {
                System.err.println("ERROR : 업무 수당은 0 ~ 1,000,000 ");
                System.in.read();
            }
        }

        for (i = 0; i < employees.length; i++) {
            switch (hobong[i]) {
                case 1 :
                    salarys[i][0] = 1650000;
                    break;
                case 2 :
                    salarys[i][0] = 1680000;
                    break;
                case 3 :
                    salarys[i][0] = 1700000;
                    break;
                case 4 :
                    salarys[i][0] = 1720000;
                    break;
                case 5 :
                    salarys[i][0] = 1750000;
                    break;
                default:
                    salarys[i][0] = 0;
            }
        }

        for (i = 0; i < employees.length; i++) {
            salarys[i][2] = salarys[i][0] + salarys[i][1];
        }

        for (i = 0; i < employees.length; i++) {
            if (salarys[i][2] >= 2600000) {
                salarys[i][3] = (int) (salarys[i][2] * (10.0f / 100));
            } else if (salarys[i][2] >= 2000000) {
                salarys[i][3] = (int) (salarys[i][2] * (8.0f / 100));
            } else {
                salarys[i][3] = (int) (salarys[i][2] * (5.0f / 100));
            }
        }


        for (i = 0; i < employees.length; i++) {
            salarys[i][4] = salarys[i][2] - salarys[i][3];
        }


        for (i = 0; i < employees.length - 1; i++) {
            // 마지막 i개는 이미 정렬되어 있음
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (salarys[j][4] > salarys[j + 1][4]) {
                    // swap
                    String[] temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;

                    int temp1 = hobong[j];
                    hobong[j] = hobong[j + 1];
                    hobong[j + 1] = temp1;

                    int[] temp2 = salarys[j];
                    salarys[j] = salarys[j + 1];
                    salarys[j + 1] = temp2;
                }
            }
        }





        System.out.println("***************************************************************");
        System.out.println(" 이름 사번 호봉 기본급 업무수당  금여액  세금   지급액");
        System.out.println("***************************************************************");

        for (i = 0; i < employees.length; i++) {
            System.out.printf("%4s %5s %1d %,9d %,9d %,9d %,8d %,9d\n", employees[i][0], employees[i][1],
                    hobong[i], salarys[i][0], salarys[i][1], salarys[i][2], salarys[i][3], salarys[i][4]);
        }

        System.out.println("***************************************************************");
    }
}