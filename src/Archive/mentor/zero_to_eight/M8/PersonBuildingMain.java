package Archive.mentor.zero_to_eight.M8;

import java.util.Scanner;

public class PersonBuildingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Building building_1 = new Building();


        System.out.println("Xoş gəldiniz.");

        System.out.print("Kompleksin ID -sini daxil edin: ");
        building_1.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Kompleksin adını daxil edin: ");
        building_1.setBuildingName(sc.nextLine());

        System.out.print("Binanın nömrəsini daxil edin: ");
        building_1.setBuildingNumber(sc.nextInt());

        System.out.print("Mərtəbə sayını daxil edin: ");
        building_1.setCountOfFloor(sc.nextInt());
        sc.nextLine();
        System.out.print("Mənzil nömrəsini daxil edin: ");
        building_1.setApartmentNumber(sc.nextLine());

        System.out.print("İpoteka mövcuddur? (true/false): ");
        building_1.setMortgage(sc.nextBoolean());

        Person person = new Person();


        System.out.print(" Şəxsin ID -sini daxil edin: ");
        person.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Adınızı daxil edin: ");
        person.setName(sc.nextLine());

        System.out.print("Soyadınızı daxil edin: ");
        person.setLastName(sc.nextLine());

        System.out.print("Yaşınızı daxil edin: ");
        person.setAge(sc.nextInt());


        System.out.print("Aile sayınız: ");
        person.setNumberOfFamilies(sc.nextInt());


        System.out.println("Məlumatlar uğurla daxil edildi.");

        person.setBuilding(building_1);
        System.out.println(person);
//        System.out.println( person.getBuilding());
    }
}