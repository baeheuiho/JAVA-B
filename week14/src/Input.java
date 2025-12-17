import java.io.IOException;
import java.util.Scanner;

public class Input {

    public static int[] readData(int ban, String[] student) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        String[] subject = {"국어", "영어", "수학", "기술", "가정"};
        int[] data = new int[7]; //{국어, 영어, 수학 , 선택, 총점, 반석차, 학년 석차}


        int i = 0;
        while (i < data.length - 3) {
            if (i == 3 && student[2].equals("여")) {
                System.out.printf("%d반 학생 %s의 %s 점수 입력 : ", ban, student[1], subject[i + 1]);
            } else {
                System.out.printf("%d반 학생 %s의 %s 점수 입력 : ", ban, student[1], subject[i]);
            }
            data[i] = keyboard.nextInt();
            if (data[i] >= 0 && data[i] <= 100)
                i++;
            else {
                System.err.println("ERROR : 0 ~ 100점");
                System.in.read();
            }
        }

        return data;
    }
}
