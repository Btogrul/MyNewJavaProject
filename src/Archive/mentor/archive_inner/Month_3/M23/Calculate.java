package Archive.mentor.archive_inner.Month_3.M23;

import java.util.Map;

public class Calculate {
    double calculateTotal(Map<String, Double> items) {
        double totalPrice =0;
        for (double price : items.values()) {
            totalPrice += price;
        }
        return totalPrice;
    }
}
