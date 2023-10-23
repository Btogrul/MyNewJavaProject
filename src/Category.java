import java.util.Arrays;

public class Category {
    int id;
    String categoryName;
    String description;

    Product[] product;


    public Category(int id, String categoryName, String description, Product [] product) {
        this.id = id;
        this.categoryName = categoryName;
        this.description = description;
        this.product = product;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setProduct(Product [] product) {
        this.product = product;
    }

    public int getId() {
        return id;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public String getDescription() {
        return description;
    }

    public Product [] getProduct() {
        return product;
    }

    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", categoryName='" + categoryName + '\'' +
                ", description='" + description + '\'' +
                ", product=" + Arrays.toString(product) +
                '}';
    }
}
