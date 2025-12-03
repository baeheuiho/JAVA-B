public class Output {

    public static void display(String[][] customers, int[][] money, float[] used) {
        display();
        System.out.println("번호  이름 코드  구분  사용량  사용 금액  세금   징수금액  기타 ");
        display();
        for (int i = 0; i < customers.length; i++) {
            System.out.printf(" %4s %3s %1s %3s %5.1f 리터 %,7d 원 %,7d원 %,7d원\n",
                    customers[i][0], customers[i][1], customers[i][2],
                    customers[i][3], used[i], money[i][0], money[i][1], money[i][2]);
        }
        display();
    }

    private static void display() {
        System.out.println("***************************************************");
    }
}
