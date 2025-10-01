//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         int a = 5 > 3 ? 6 : 7;       // 6
         System.out.printf("a = %d\n", a);

         int b = 2 > 3 ? a++ : a--;    //  b = 6, a = 5
         System.out.printf("a = %d, b = %d\n", a, b);

         int c = b > a ? ++b - 1 : a++ + 1;  // a = 5, b = 7, c = 6
         System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);

        c = (b > a) && (a++ > 3) ? ++b - 1 : a++ + 1;  // a =6, b =8, c =7
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);

    }
}