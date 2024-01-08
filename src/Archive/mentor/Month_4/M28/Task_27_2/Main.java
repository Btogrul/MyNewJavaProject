package Archive.mentor.Month_4.M28.Task_27_2;

public class Main {
    public static void main(String[] args) {
        ProductCatalog productCatalog = new ProductCatalog();

        // Adding products to the catalog
        Product p_1 = new Product(1, "x", 43, 2);
        Product p_2 = new Product(2, "y", 22, 3);

        productCatalog.add(p_1);
        productCatalog.add(p_2);
        productCatalog.display();
        System.out.println();
        System.out.println();
        productCatalog.remove(2);
        productCatalog.update(1, "Z", 323, 4);
        productCatalog.display();

    }
}
