package variant_22;

import java.util.Random;
import java.util.Scanner;

public class task_2 {
    public static void main(String[] args) {
        int attempt = 10;
        Random rn = new Random();
        int rnum = rn.nextInt(10-0);

        System.out.println(rnum);
        Scanner sc = new Scanner(System.in);
        System.out.println("Дорогой космонавт, рубрика 'угадай код, чтобы ВЫЖИТЬ!!1!'. Ведите число от 0 до 10 (у вас 10 попыток):");
        int num = sc.nextInt();
        --attempt;

        while (rnum != num && attempt > 0){
            --attempt;
            System.out.println("не угадал, ещё попытка" );
            num = sc.nextInt();
        }
        if (attempt >= 0 && num == rnum){
            System.out.print("ТЫ УГАДАЛ!!! теперь ты отпровляешься домой!!");
        } else if (attempt == 0 && num != rnum){
            System.out.println("мы тебя взорвём");
        }
    }
}
