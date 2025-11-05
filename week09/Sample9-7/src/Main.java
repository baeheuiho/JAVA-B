//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++ ) {
            if (i % 2 == 1) {
               sum += i;
            }
        }

        System.out.printf("1 + 3 +  + 99 = %,d\n", sum);
    }
}