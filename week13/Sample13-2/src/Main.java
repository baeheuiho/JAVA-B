//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static int sumNumber(int... numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++)
            total += numbers[i];

        return total;
    }


    public static void main(String[] args) {

        System.out.println(sumNumber(1, 3, 4));
        System.out.println(sumNumber(3, 6, 7, 9, 12));


    }
}