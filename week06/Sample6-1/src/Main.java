//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        final int KOREA = 99720;
        final int NorthKorea = 122762;
        final int USA = 9631418;
        final int JAPAN = 377873;

        float temp1 = (float) NorthKorea / KOREA;
        float temp2 = (float) USA / KOREA;
        float temp3 = (float) JAPAN / KOREA;


        System.out.printf("대한민국의 면적 :%,d ㎢\n", KOREA);
        System.out.printf("북한의 면적 : %,d ㎢\n", NorthKorea);
        System.out.printf("미국의 면적 : %,d ㎢\n", USA);
        System.out.printf("일본의 면적 : %,d ㎢\n", JAPAN);

        System.out.printf("북한은 우리나라에 비해 %.2f 배임.\n", temp1);
        System.out.printf("미국은 우리나라에 비해 %.2f 배임.\n", temp2);
        System.out.printf("일본은 우리나라에 비해 %.2f 배임.\n", temp3);
    }
}