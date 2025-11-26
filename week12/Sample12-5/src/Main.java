import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String[][] students = new String[][] {{"홍길동", "남", ""}, {"강성우", "남", ""},
        {"김소이", "여", ""}, {"김준석", "남", ""},{"장한별", "여", ""}, {"조민기", "남", ""},
        {"최장빈", "남", ""}, {"황연준", "여", ""},{"파트마", "여", ""}, {"미라치", "남", ""}};
        int[] height = new int[students.length];
        float[][] weight = new float[students.length][3]; // {몸무게, 표준 체중, BMI}

        Input.readData(students, height);
        Input.readData(students, weight);

        Compute.standard(students, height, weight);
        Compute.bmi(students, height, weight);
        Compute.check(students, weight);

        Output.display(students, height, weight);
    }
}