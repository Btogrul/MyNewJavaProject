package Archive.dersler.archive_inner.Month_1_and_2.L4;

import java.util.Scanner;

public class ExamScoreSecondWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zəhmət olmasa imtahan balınızı qeyd edin ! ");
        int studentGrade = sc.nextInt();

        if(100>=studentGrade && studentGrade >= 91){
            System.out.println("Təbriklər! Siz A qazandınız !");
        } else if (90>=studentGrade && studentGrade >= 81) {
            System.out.println("Təbriklər! Siz B qazandınız !");
        }else if (80>=studentGrade && studentGrade >= 71) {
            System.out.println("Təbriklər! Siz C qazandınız !");
        }else if (70>=studentGrade && studentGrade >= 61) {
            System.out.println("Təbriklər! Siz D qazandınız !");
        }else if (60>=studentGrade) {
            System.out.println("Təəssüflər! Siz F qazandınız !");
        }else{
            System.out.println("Sizin balınız imtahan balının limitlərini aşıb!");
        }

    }
}
