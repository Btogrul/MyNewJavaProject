package Archive.mentor.archive_inner.Month_1.M7;

import java.util.Scanner;

public class BankSystem {
    public static void main(String[] args) {
        BankAccount bankAcc = new BankAccount();
        Scanner sc = new Scanner(System.in);
        bankAcc.balance = (int)(Math.random() * 5000);
        bankAcc.account_number = 1234;
        int user_number;
        int user_input;

        System.out.println("Zehmet olmasa shifrenizi qeyd edin ");
        user_number = sc.nextInt();
        sc.nextLine();

        if(user_number == user_number){
            System.out.println("Accounta daxil oldunuz!");
            System.out.println();
            System.out.println("Əməliyyatı seçin ");
            System.out.println(" Balans artimi üçün ->  +");
            System.out.println(" hesabdan pul çıxartmaq üçün ->  -  ");
            System.out.println();
            System.out.println("--------------");
            String user_request = sc.nextLine();

            if(user_request.equals("+")){
                System.out.println();
                System.out.println("Balansiniz " + bankAcc.balance + "$");
                System.out.print("Balans artimi uchun mebleqi qeyd edin ");
                user_input =sc.nextInt();


                if(user_input <= 0){
                    System.out.println(" Sehv mebleq qeyd olundu. ");
                }else{
                    System.out.println("Toplam balans " + bankAcc.depozit(user_input));
                }



            } else if (user_request.equals("-")) {

                System.out.println();
                System.out.println("Balansiniz " + bankAcc.balance + "$");
                System.out.print("Hesabdan çıxarış ");
                user_input =sc.nextInt();




                if(user_input > bankAcc.balance){
                    System.out.println("Balansinizda kifayet qeder mebleq yoxdur");

                }else{
                    System.out.println("Toplam balans " + bankAcc.cashDraw(user_input));
                }


            }else{
                System.out.println("Yanlish emeliyyat");
            }


        }else{
            System.out.println("Giriş xətası");
        }




    }

}
