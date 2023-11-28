package Archive.mentor.archive_inner.Month_1.M8;

import java.util.Scanner;

public class MainCategory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        System.out.print("Elave olunacaq kategoriyaların sayini qeyd edin: ");
        int total= sc.nextInt();


        System.out.println(" neçə yeni məhsulumuz olacaq ? ");
        int count_of_products = sc.nextInt();

        Category[] new_category = new Category[total];
        Product[] new_product = new Product[count_of_products];



        for (int i = 0; i < total; i++) {

            System.out.print( "Kateriyanin Id-ni daxil edin: ");
            int category_id = sc.nextInt();
            sc.nextLine();
            System.out.print( "Kateriyanin adini daxil edin: ");
            String categoryName = sc.nextLine();
            System.out.print( "Kateriyanin descriptionu daxil edin: ");
            String description = sc.nextLine();
            System.out.println("-----------------");


            for (int j = 0; j < count_of_products; j++) {
                System.out.print("Mehsulun id-si:");
                int product_id = sc.nextInt();
                sc.nextLine();
                System.out.print("Mehsulun adi:");
                String product_name = sc.nextLine();
                System.out.print("Mehsulun qiymeti:");
                int product_price = sc.nextInt();
                System.out.print("Mehsulun sayi:");
                int product_count = sc.nextInt();
                sc.nextLine();
                System.out.print("Mehsulun rengi:");
                String product_color = sc.nextLine();

                new_product[j] = new Product(product_id,product_name,product_price,product_count, product_color);

            }
            new_category[i]= new Category(category_id, categoryName,description, new_product );

        }


        for (int i = 0; i < total; i++) {
            System.out.println(new_category[i]);
        }








    }
}
