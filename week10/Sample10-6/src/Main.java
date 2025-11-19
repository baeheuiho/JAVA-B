import java.io.IOException;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner keyboard = new Scanner(System.in);

        String[][] students = {{"홍길동", "2501002"}, {"이재명", "2501004"}, {"윤석열", "2501005"},
                {"경복대", "2501014"}, {"오세훈", "2501024"}, { "강민성",  "2501032"},
                { "김진성", "2501044"}, {"니키타", "2501055"}, {"김정은", "2501064"}, {"김시온", "2501074"}};
        int[][] score = new int[students.length][5];
        float[] avg = new float[students.length];

        boolean swapped = false;


        int i = 0;
        while (i < students.length) {
            System.out.printf("\n%s 학생의 국어 성적 입력 : ", students[i][0]);
            score[i][0] = keyboard.nextInt();
            System.out.printf("%s 학생의 영어 성적 입력 : ", students[i][0]);
            score[i][1] = keyboard.nextInt();
            System.out.printf("%s 학생의 수학 성적 입력 : ", students[i][0]);
            score[i][2] = keyboard.nextInt();

            if ((score[i][0] >= 0 && score[i][0] <= 100) &&
                    (score[i][1] >= 0 && score[i][1] <= 100) &&
                    (score[i][2] >= 0 && score[i][2] <= 100)) {
                i++;
            } else {
                System.err.println("ERROR : 0 ~ 100");
                System.in.read();
            }
        }

        for (i = 0; i < students.length; i++) {
            score[i][3] = score[i][0] + score[i][1] + score[i][2];
        }

        for (i = 0; i < students.length; i++) {
            score[i][4] = 1;
            for (int j = 0; j < students.length; j++) {
                if (score[i][3] < score[j][3])
                    ++score[i][4];
            }
        }


        /*
        for (i = 0; i < name.length - 1; i++) {
            swapped = false;
            // 인접한 요소를 비교 후 교환
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (total[j] < total[j + 1]) {  // 내림 차순
                    // 자리 교환 (swap)
                    String text = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = text;

                    text = hakbun[j];
                    hakbun[j] = hakbun[j + 1];
                    hakbun[j + 1] = text;

                    int temp = kor[j];
                    kor[j] = kor[j + 1];
                    kor[j + 1] = temp;

                    temp = eng[j];
                    eng[j] = eng[j + 1];
                    eng[j + 1] = temp;

                    temp = math[j];
                    math[j] = math[j + 1];
                    math[j + 1] = temp;

                    temp = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = temp;
                    swapped = true;
                }
            }
            // 교환이 한 번도 일어나지 않았다면 이미 정렬 완료
            if (!swapped) break;
        } */

        for (i = 0; i < students.length; i++) {
            avg[i] = score[i][3] / 3.0f;
        }



      /*  for (i = 0; i < name.length; i++)
            rank[i] = i + 1;

        for (i = 0; i < name.length - 1; i++) {
            if (avg[i] == avg[i + 1])
                rank[i + 1] = rank[i];
        }

        for (i = 0; i < name.length - 1; i++) {
            swapped = false;
            // 인접한 요소를 비교 후 교환
            for (int j = 0; j < name.length - 1 - i; j++) {
                if (hakbun[j].compareTo(hakbun[j + 1]) > 0) {  // 내림 차순
                    // 자리 교환 (swap)
                    String text = name[j];
                    name[j] = name[j + 1];
                    name[j + 1] = text;

                    text = hakbun[j];
                    hakbun[j] = hakbun[j + 1];
                    hakbun[j + 1] = text;

                    int temp = kor[j];
                    kor[j] = kor[j + 1];
                    kor[j + 1] = temp;

                    temp = eng[j];
                    eng[j] = eng[j + 1];
                    eng[j + 1] = temp;

                    temp = math[j];
                    math[j] = math[j + 1];
                    math[j + 1] = temp;

                    temp = total[j];
                    total[j] = total[j + 1];
                    total[j + 1] = temp;
                    temp = rank[j];
                    rank[j] = rank[j + 1];
                    rank[j + 1] = temp;

                    float temp1 = avg[j];
                    avg[j] = avg[j + 1];
                    avg[j + 1] = temp1;

                    swapped = true;
                }
            }
            // 교환이 한 번도 일어나지 않았다면 이미 정렬 완료
            if (!swapped) break;
        } */


        System.out.println("***********************************************");
        System.out.println(" 학번   이름  국어  영어   수학  총점   평군   등수 ");
        System.out.println("***********************************************");
        for (i = 0; i < students.length; i++) {
            System.out.printf("%7s %3s  %3d  %3d  %3d  %3d   %5.1f %2d\n",
                    students[i][1], students[i][0], score[i][0],
                    score[i][1], score[i][2], score[i][3], avg[i], score[i][4]);
        }
        System.out.println("***********************************************");
    }

}