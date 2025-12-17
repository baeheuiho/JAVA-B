public class Compute {
    public static void total(int[][][] score) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                for (int k = 0; k < score[i][j].length - 3; k++) {
                    score[i][j][score[i][j].length - 3] += score[i][j][k];
                }
            }
        }
    }

    public static void total(int[][] score) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length - 3; j++) {
                score[i][score[i].length - 3] += score[i][j];
            }
        }
    }

    public static void sort(String[][][] students, int[][][] score) {
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students[i].length - 1; j++) {
                for (int k = j + 1; k < students[i].length; k++) {
                    if (score[i][j][score[i][j].length - 3] < score[i][k][score[i][j].length - 3]) {
                        int[] temp = score[i][j];
                        score[i][j] = score[i][k];
                        score[i][k] = temp;

                        String[] test = students[i][j];
                        students[i][j] = students[i][k];
                        students[i][k] = test;
                    }
                }
            }
        }

    }

    public static void ranking(int[][][] score) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j][score[i][j].length - 2] = j + 1;
            }
        }
        tieRanking(score);
    }

    private static void tieRanking(int[][][] score) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length - 1; j++) {
                for (int k = j + 1; k < score[i].length; k++) {
                    if (score[i][j][score[i][j].length - 3] == score[i][k][score[i][j].length - 3]) {
                        score[i][k][score[i][j].length - 2] = score[i][j][score[i][j].length - 2];
                    }
                }
            }
        }
    }

    public static void gradeRanking(int[][][] score) {
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                score[i][j][score[i][j].length - 1] = 1;
                for (int k = 0; k < score.length; k++) {
                    for (int l = 0; l < score[k].length; l++) {
                        if (score[i][j][score[i][j].length - 3] < score[k][l][score[k][l].length - 3]) {
                            score[i][j][score[i][j].length - 1]++;
                        }
                    }
                }
            }
        }
    }


    public static float[] average(int[][] scores) {
        float[] avg = new float[scores.length];
        for (int i = 0; i < scores.length; i++)
            avg[i] = scores[i][scores[i].length - 3] / 4.0f;

        return avg;
    }

    public static float average(float[] avgs) {
        float temp = 0.0f;
        for (int i = 0; i < avgs.length; i++) {
            temp += avgs[i];
        }
        return temp / avgs.length;
    }

    public static float totalAvg(float[][] score) {
        int count = 0;
        float total = 0;
        for (int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                total += score[i][j];
                count++;
            }
        }
        return total / count;
    }
}
