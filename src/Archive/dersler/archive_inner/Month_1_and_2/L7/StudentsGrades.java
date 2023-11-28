package Archive.dersler.archive_inner.Month_1_and_2.L7;

import java.util.Scanner;

public class StudentsGrades {
    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Student Grades Tracker! ");
        System.out.print("Nece dene telebemiz var : ");
        int students = sc.nextInt();
        
        System.out.print("nece dene imtahan kecirilib: ");
        int assessments = sc.nextInt();


        if (students == 0 || assessments == 0){
            System.out.println(" sayi doqru qeyd edin! ");
            return;
        }


        String[] studentNames = new String[students];
        int [][] examResults = new int[students][assessments];

        sc.nextLine();


        for (int i = 0; i < students; i++) {
            System.out.print((i + 1) + " nomreli telebenin adini qeyd edin: ");
            studentNames[i] = sc.nextLine();
        }

        if(studentNames.length == students){
            for (int i = 0; i < students; i++) {
                System.out.println("Imtahan neticelerini daxil edin " + studentNames[i] );
                for (int j = 0; j < assessments; j++) {
                    System.out.print("imtahan " + (j + 1) + " : ");
                    examResults[i][j] = sc.nextInt();

                    if (examResults[i][j] >100){
                        System.out.println(" imtahan bal limtiini ashan netice ");
                        return;
                    }
                }
            }
        }




        System.out.println();
        System.out.println("Imtahan ballarinin hesabati :");
        System.out.print("Telebe        ");
        System.out.println("Ortalama ");
        System.out.println();
        System.out.println("-------------------");




        for (int i = 0; i < students; i++) {
            int total = 0;

            for (int j = 0; j < assessments; j++) {
                total += examResults[i][j];
            }

            double average = (double) total / assessments;
            System.out.println(studentNames[i] + "        " + average);
            System.out.println();

        }


        System.out.print("Telebe        ");
        System.out.println("Ortalama ");
        System.out.println();
        System.out.println("-------------------");


        for (int i = 0; i < assessments; i++) {
            int examScores = 0;

            for (int j = 0; j <  students; j++) {
                 examScores  += examResults[j][i];
            }

            double examsAverage = (double) examScores /students;
            System.out.println( (i+1) +  "  imtahan ortalama        " + examsAverage);
            System.out.println();

        }


    }
}
