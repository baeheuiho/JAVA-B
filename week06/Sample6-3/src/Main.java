//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
           final int YEAR = 365;      // 1년
           final int SPEED = 300000;  // 빛이 1초에 가는 거리 (Km)
           int second;
           long result;

           second = YEAR * 24 * 60 * 60;
           result = (long) second * SPEED;

           System.out.printf("빛은 1초에 %,d Km를 이동합니다.\n", SPEED);
           System.out.printf("%d일은 %,d 초 입니다.\n", YEAR, second);
           System.out.printf("빛이 %d일동안 이동한 거리는 %,d Km 입니다.\n", YEAR, result);
    }
}