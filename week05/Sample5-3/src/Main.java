//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean test = ((('a' + 1) > 'A') && ('A' > 'B'));  // 'b' > 'A' -> true &&(*) false -> false
        boolean test1 = ((('a' + 1) > 'A') || ('A' > 'B'));  // 'b' > 'A' -> true ||(+) ? -> true

        int a = 5;

        boolean test2 = ((5 > 3) && ((a++) != 0));  // true && true - true a = 6



        System.out.printf("test = %b\n", test);
        System.out.printf("test1 = %b\n", test1);
        System.out.printf("test2 = %b, a = %d\n", test2, a);

        boolean test3 = ((2 > 3) & ((++a) != 0));      // false & true - false a = 7
        System.out.printf("test3 = %b, a = %d\n", test3, a);
    }
}