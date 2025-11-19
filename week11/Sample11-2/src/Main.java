import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[][] students = new String[][]{
                {"12345", "홍길동"}, {"34563", "이혜인"},
                {"45321", "김명성"}, {"56456", "경복대"}, {"67853", "이대학"}};
        String[] subject = new String[]{"국어", "영어", "수학"};

        int[][] score = new int[students.length][subject.length + 1];  // 4 = 국어, 영어, 수학, 총점
        float[] avg = new float[students.length];
        boolean swapped = false;

        for (int i = 0; i < students.length; i++) {
            int j = 0;
            while (j < subject.length) {
                System.out.printf("%s님의 %s 성적 입력 : ", students[i][1], subject[j]);
                score[i][j] = keyboard.nextInt();
                if (score[i][j] >= 0 && score[i][j] <= 100) {
                    j++;
                } else {
                    System.err.println("ERROR : 0 ~ 100");
                    System.in.read();
                }
            }
        }

        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < subject.length; j++)
                score[i][score[i].length - 1] += score[i][j];
        }


     /*   for (int i = 0; i < students.length - 1; i++) {
            swapped = false;
            // 인접한 요소를 비교 후 교환
            for (int j = 0; j < students.length - 1 - i; j++) {
                if ( score[i][score[i].length - 1] > score[j][score[j].length - 1]) {  // 내림 차순
                    // 자리 교환 (swap)
                    String[] text = students[i];
                    students[i] = students[j];
                    students[j] = text;

                    int[] temp = score[i];
                    score[i] = score[j];
                    score[j] = temp;
                    swapped = true;
                }
            }
            // 교환이 한 번도 일어나지 않았다면 이미 정렬 완료
            if (!swapped) break;
        } */







        for (int i = 0; i < students.length; i++) {
            avg[i] = score[i][score[i].length - 1] / 3.0f;
        }


        System.out.println("*********************************************");
        System.out.println(" 학번    이름  국어  영어  수학  총점  평균 ");
        System.out.println("*********************************************");
        for (int i = 0; i < students.length; i++) {
            System.out.printf("%6s %3s %3d %3d %3d %3d %6.2f\n", students[i][0], students[i][1],
                    score[i][0], score[i][1], score[i][2], score[i][3], avg[i]);
        }
        System.out.println("*********************************************");


    }
}