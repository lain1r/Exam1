package variant_22;

import java.util.Scanner;

public class Dss {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("введите ваше счастливое число");
        num = sc.nextInt();
        switch (num){
            case (7):
                System.out.println("Это и моё счастливое число!!!");
                break;
            case (13):
                System.out.println("это несчастливое число :_(");
                break;
            case (24):
                System.out.println("это несчастливое число :_(");
                break;
            default:
                System.out.println("число "+num+ " ваше личное счастливое число!!!");
        }
    }
}