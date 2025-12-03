import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String[][] customers = new String[][] {{"1111", "홍길동", "1", ""},
                {"2222", "문예영", "2", ""}, {"3333", "문예영", "3", ""}, {"4444", "문예영", "4", ""},
                {"5555","문예영", "5", ""}, {"6666", "문예영", "2", ""}, {"7777", "문예영", "4", ""},
                {"8888","문예영", "3", ""}, {"9999", "문예영", "5", ""}, {"1010", "문예영", "1", ""}};// {번호, 이름 , 타입, 타입 이름}
        int[][] money = new int[customers.length][3];  // {사용금액, 세금, 징수금액}

        Input.preProcess(customers);
        float[] used = Input.readData(customers);

        for (int i = 0; i < money.length; i++) {
            Compute.pay(money[i], customers[i], used[i]);  // 사용 금액 계산
        }

        Compute.tax(customers, money);  // 2차원

        for (int i = 0; i < money.length; i++){
            Compute.total(money[i]);
        }

        Output.display(customers, money, used);


    }
}