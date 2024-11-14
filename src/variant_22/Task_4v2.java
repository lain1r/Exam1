package variant_22;

import java.util.Arrays;
import java.util.Scanner;

public class Task_4v2 {
    public static void main(String[] args) {
        double balanc, paym, credit;
        double[] arr = new double[12];
        int months = 12;
        Scanner sc = new Scanner(System.in);
        System.out.println("введите сумму вашего кредита");
        credit = sc.nextDouble();
        credit *= 1.18;
        balanc = credit/12;
        System.out.println("Сумма по кредиту с процентам составит "+ credit +" рублей");
        System.out.println("Каждый месяц вам надо платить "+ balanc +" рублей\n");
for (int a = 0; a<arr.length; a++){

    months--;
    Scanner sc1 = new Scanner(System.in);
    System.out.println("Введите сумму ежемесечного платежа");
    paym = sc1.nextDouble();
    arr[a] = paym;
    credit -= paym;


    if (credit<=0){
        break;
    } else {
        System.out.println("Вам осталось выплатить "+ credit +" рублей за "+ months +" месяцев\n");
    }
}
        System.out.println("история ваших платежей "+ Arrays.toString(arr));
    }
}
