import java.util.Scanner;

public class ExamScore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Zəhmət olmasa imtahan balınızı qeyd edin ! ");
        int studentGrade = sc.nextInt();



        String examGrade = 100 >= studentGrade && studentGrade >= 91  ? "A" : 90 >= studentGrade && studentGrade >= 81 ? "B" : 80 >= studentGrade && studentGrade >= 71 ? "C" : 70 >= studentGrade && studentGrade >= 61 ? "D" : 60 >= studentGrade   ? "F" : "" ;


        switch (examGrade){
            case "A":
                System.out.println("Təbriklər! Siz A qazandınız !");
                break;
            case "B":
                System.out.println("Təbriklər! Siz B qazandınız !");
                break;
            case "C":
                System.out.println("Təbriklər! Siz C qazandınız !");
                break;
            case "D":
                System.out.println("Təbriklər! Siz D qazandınız !");
                break;
            case "F":
                System.out.println("Təəssüflər! Siz F qazandınız !");
                break;
            default:
                System.out.println("Sizin balınız imtahan balının limitlərini aşıb!");

        }


    }
}