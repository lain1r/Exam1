package variant_22;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        int credit;
        int balanc;
        int paym;
        int month;
        double overpaym;
        double f_overpaym;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введие сумму кредита");
        credit = sc.nextInt();
        for (month=12;month>0 && credit>0;month--){
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Введие сумму ежемесячного платежа");
        paym = sc1.nextInt();
            balanc = credit - paym;
            credit = balanc;
            overpaym =paym*0.18;
            System.out.println("осталось выплатить "+balanc+". осталось платить кредит "+month+" месяцев. Переплата в этом месяце составила "+overpaym);
        }
        System.out.println("УРА ты не раб банка!!!!!!!1");
    }
}
