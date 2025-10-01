//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean test = 5 > 3 && 6 < 3;   // true && false -> false
        boolean test1 = 2 > 3 && 6 < 3;   // false  && ? -> false

        boolean test2 = 5 > 3 || 6 < 3;   // true || ? -> true   Short circuit Evaluation(단축 연산)
        boolean test3 = 2 > 3 || 6 < 3;   // false || false -> false

        boolean test4 = 5 > 3 & 6 < 3;   // true && false -> false
        boolean test5 = 2 > 3 & 6 < 3;   // false  && false -> false

        boolean test6 = 5 > 3 | 6 < 3;   // true || false -> true
        boolean test7 = 2 > 3 | 6 < 3;   // false || false -> false

        System.out.printf("test = %b\n", test);
        System.out.printf("test1 = %b\n", test1);
        System.out.printf("test2 = %b\n", test2);
        System.out.printf("test3 = %b\n", test3);

        System.out.printf("test4 = %b\n", test4);
        System.out.printf("test5 = %b\n", test5);
        System.out.printf("test6 = %b\n", test6);
        System.out.printf("test7 = %b\n", test7);
    }
}