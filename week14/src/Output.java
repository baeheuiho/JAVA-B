public class Output {
    public static void display(String[][][] students, int[][][] score, float[][] avg) {
         for (int i = 0; i < students.length; i++) {
             System.out.printf("\t\t\t\t  *** %d반 성적표 ***\n", i + 1);
             display();
             System.out.println(" 학번    이름   국어 영어 수학 선택 총점  평균  반석차 학년석차  기타");
             display();
             float gradeAvg = Compute.average(avg[i]);
             for (int j = 0; j < students[i].length; j++) {
                 System.out.printf("%8s %3s %3d %3d %3d %3d %3d %5.1f %2d %2d %s\n",
                         students[i][j][0], students[i][j][1],
                         score[i][j][0], score[i][j][1], score[i][j][2], score[i][j][3], score[i][j][4],
                         avg[i][j], score[i][j][5], score[i][j][6], avg[i][j] < gradeAvg ? "반 평균 미만" : " ");
             }
             display();
             System.out.printf("%d반 전체 평균: %6.2f\n\n", i + 1, gradeAvg);
         }
         System.out.printf("\n학년 전체 평균 : %6.2f\n", Compute.totalAvg(avg));
    }

    private static void display() {
        System.out.println("******************************************************");
    }
}
