package variant_22;

import java.util.Arrays;
import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        String[] arr = new String[40];
        Scanner sc = new Scanner(System.in);
        System.out.println("Напиши фильмы, которые хочешь посмотреть");

        for (int a = 0; a<arr.length;a++){
            String films = sc.next();
            System.out.println("напиши ещё фильмы которые хочешь посмотреть (exit - выход)");
            if((films.equalsIgnoreCase("exit") || films.equalsIgnoreCase("выход"))){break;}
            arr[a] = films;
        }
        System.out.println(Arrays.toString(arr));
    }
}