package Archive.mentor.Month_4.M28.Task_27_2;

import java.util.HashMap;
import java.util.Map;

public class ProductCatalog {
    Map<Integer, Product> catalog;

    public ProductCatalog() {
        this.catalog = new HashMap<>();
    }


    public void update(int productId, String newName, double newPrice, int newQuantity) {
        Product product = catalog.get(productId);
        product.setName(newName);
        product.setPrice(newPrice);
        product.setQuantity(newQuantity);
        System.out.println(product + " elave olundu ");
    }

    public void remove(int product_id) {
        catalog.remove(product_id);
    }

    public void add(Product product) {
        System.out.println("əlavə olundu : " + product.getName());
        catalog.put(product.getId(), product);

    }

    public void display() {
        System.out.println("catalog:");
        for (Product product : catalog.values()) {
            System.out.println(product);
        }
        System.out.println("==================");
    }
}
