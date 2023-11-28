package Archive.dersler.archive_inner.Month_1_and_2.L4;

import java.util.Scanner;

public class ExamScoreThirdWay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zəhmət olmasa imtahan balınızı qeyd edin ! ");
        int studentGrade = sc.nextInt();



        String examGrade = 100 >= studentGrade && studentGrade >= 91
                ? "Təbriklər! Siz A aldınız!" : 90 >= studentGrade && studentGrade >= 81
                ? "Təbriklər! Siz B aldınız!" : 80 >= studentGrade && studentGrade >= 71
                ? "Təbriklər! Siz C aldınız!" : 70 >= studentGrade && studentGrade >= 61
                ? "Təbriklər! Siz D aldınız" : 60 >= studentGrade
                ? "Təəssüf! Siz F aldınız " : "Sizin balınız imtahan balının limitlərini aşıb!";

        System.out.println(examGrade);
    }
}
