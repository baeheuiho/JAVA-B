public class Compute {
    public static void pay(int[] money, String[] customer, float v) {
        int used = (int) (v + 0.5f);
        if (customer[2].equals("1")) {
            money[0] = used * 40 + 1200;
        } else if (customer[2].equals("2")) {
            money[0] = used * 55 + 1200;
        } else if (customer[2].equals("3")) {
            money[0] = used * 78 + 1200;
        } else if (customer[2].equals("4")) {
            money[0] = used * 35 + 1200;
        } else if (customer[2].equals("5")) {
            money[0] = used * 20 + 1200;
        } else {
            money[0] = used * 0;
        }
    }

    public static void tax(String[][] customer, int[][] money) {
        for (int i = 0; i < customer.length; i++) {
            if (customer[i][2].equals("1")) {
                money[i][1] = (int) (money[i][0] * (5.0f / 100));
            } else if (customer[2].equals("2")) {
                money[i][1] = (int) (money[i][0] * (3.5f / 100));
            } else if (customer[2].equals("3")) {
                money[i][1] = (int) (money[i][0] * (2.5f / 100));
            } else if (customer[2].equals("4")) {
                money[i][1] = (int) (money[i][0] * (1.5f / 100));
            } else if (customer[2].equals("5")) {
                money[i][1] = 0;
            } else {
                money[i][1] = -11;
            }
            money[i][1] /= 10;
            money[i][1] *= 10;
        }
    }

    public static void total(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++)
            ints[ints.length - 1] += ints[i];
    }
}
