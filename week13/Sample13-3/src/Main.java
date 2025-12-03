
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[][] data = new int[][]{{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}};
        // 매개 변수 : 2차원, 1차원, 원소

        multiple(data);    // 2차원   Call by Reference
        display(data);


        for (int i = 0; i < data.length; i++)
            multiple(data[i]);       // 1차원 배열 Call by Reference

        System.out.println("******************************");
        for (int i = 0; i < data.length; i++)
            display(data[i]);
        System.out.println("******************************");


        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                data[i][j] = multiple(data[i][j]);      // 원소  Call by Value
            }
        }

        System.out.println("******************************");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                display(data[i][j]);      // 원소  Call by Value
            }
            System.out.println();
        }
        System.out.println("******************************");
    }


    private static void display(int data) {
        System.out.printf("%3d ", data);
    }

    private static void display(int[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.printf("%3d ", data[i]);
        }
        System.out.println();
    }


    private static void display(int[][] data) {
        System.out.println("*****************************");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                System.out.printf("%3d ", data[i][j]);
            }
            System.out.println();
        }
        System.out.println("*****************************");
    }

    private static void multiple(int[][] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++)
                data[i][j] *= 2;
        }
    }

    private static void multiple(int[] data) {
        for (int i = 0; i < data.length; i++)
            data[i] *= 2;
    }

    private static int multiple(int data) {
        return data * 2;
    }
}